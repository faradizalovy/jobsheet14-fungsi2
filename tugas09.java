
import java.util.Scanner;

public class tugas09 {
    //Fungsi iteratif untuk menghitung total nilai
    static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i <data.length; i++) {
            total += data[i];
        }
        return total;
    }
    //Fungsi rekursif untuk menghitung total nilai
    static int totalRekursif(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return data[n - 1] + totalRekursif(data, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] angka = new int[N];
        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        int hasilIteratif = totalIteratif(angka);
        int hasilRekursif = totalRekursif(angka, N);

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + hasilIteratif);
    }
}
/*PENJELASAN PROGRAM

Diawali dengan meminta pengguna memasukkan jumlah angka yang akan dihitung, yang disimpan dalam variabel N. 
Selanjutnya, program menyediakan array bertipe int untuk menyimpan angka-angka yang dimasukkan oleh pengguna. 
Proses pengisian array dilakukan menggunakan perulangan, di mana pengguna diminta memasukkan nilai angka ke-1 
hingga ke-N sesuai dengan contoh pada soal. Perhitungan total nilai dilakukan dengan dua cara. Cara pertama 
menggunakan fungsi iteratif 'totalIteratif()'', yang menghitung jumlah seluruh elemen array dengan perulangan 
for. Cara kedua menggunakan fungsi rekursif totalRekursif(), di mana fungsi akan memanggil dirinya sendiri 
dengan nilai indeks yang semakin berkurang hingga mencapai kondisi dasar, yaitu ketika nilai parameter bernilai nol.
Hasil perhitungan kemudian ditampilkan. Meskipun program menggunakan dua metode perhitungan, hasil yang ditampilkan 
tetap sama karena kedua metode menghasilkan total nilai yang identik.*/