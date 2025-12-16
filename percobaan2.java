import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
            int bilangan, pangkat;
            System.out.print("Bilangan yang dihitung: ");
            bilangan = sc.nextInt();
            System.out.print("Pangkat: ");
            pangkat = sc.nextInt();

            //Jawaban pertanyaan nomer 2 (Cetak Perhitungan Pangkat)
            if (pangkat == 0) {
                System.out.println("Hasil = 1");
            } else {
           for (int i = 1; i <= pangkat; i++) {
            System.out.print(bilangan + "x");
           }
           System.out.println("1 = " +hitungPangkat(bilangan, pangkat));
        }
    }
}

/*PERTANYAAN*/

/*1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, 
pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() 
secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan 
dijalankan!
Jawaban: Pada Percobaan 2, proses pemanggilan fungsi rekursif 'hitungPangkat(bilangan, pangkat)' 
akan terus berlangsung selama nilai parameter pangkat belum mencapai nol. Setiap kali fungsi memanggil 
dirinya sendiri, nilai pangkat akan dikurangi satu sehingga permasalahan yang dihitung semakin mendekati 
kondisi penghentian. Proses pemanggilan tersebut akan berhenti ketika nilai pangkat bernilai nol karena 
kondisi tersebut merupakan base case, di mana fungsi tidak lagi memanggil dirinya sendiri dan langsung 
mengembalikan nilai 1. Setelah mencapai base case, hasil perhitungan akan dikembalikan secara bertahap ke 
pemanggilan sebelumnya hingga kembali ke fungsi main.*/
