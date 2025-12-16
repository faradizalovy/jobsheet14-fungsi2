import java.util.Scanner;

public class percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return(saldo);
        } else {
            return (1.11 * hitungLaba(saldo,tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun): ");
        tahun = sc.nextInt();
        System.out.println("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }
}

/*PERTANYAAN*/

/*1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”! 
Jawaban: -  Pada Percobaan 3, bagian kode program yang merupakan base case adalah 
            kondisi ketika nilai parameter 'tahun' bernilai nol, yaitu pada pernyataan 'if (tahun == 0)' 
            yang mengembalikan nilai 'saldo'. Pada kondisi ini, fungsi tidak lagi memanggil dirinya sendiri 
            sehingga proses rekursi dihentikan.
         -  Sementara itu, bagian kode program yang termasuk recursion call terdapat pada pernyataan 'return 1.11 
            * hitungLaba(saldo, tahun - 1);'. Pada baris ini, fungsi 'hitungLaba()'' memanggil dirinya sendiri dengan 
            nilai parameter 'tahun' yang dikurangi satu, sehingga proses perhitungan laba dilakukan secara berulang 
            untuk setiap tahun hingga mencapai kondisi penghentian.*/

/*2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3) 
Jawaban: Pada pemanggilan fungsi 'hitungLaba(100000, 3)'', proses rekursif dimulai dengan fase ekspansi, yaitu fase ketika fungsi terus 
memanggil dirinya sendiri dengan nilai parameter 'tahun' yang semakin berkurang.
  - FASE EKSPANSI
    hitungLaba(100000, 3)
    = 1.11 × hitungLaba(100000, 2)
    = 1.11 × (1.11 × hitungLaba(100000, 1))
    = 1.11 × (1.11 × (1.11 × hitungLaba(100000, 0)))
Pemanggilan fungsi berhenti ketika tahun bernilai 0, karena kondisi tersebut merupakan base case.
Setelah mencapai base case, proses dilanjutkan ke fase substitusi, yaitu fase penghitungan nilai secara bertahap dari pemanggilan terakhir 
kembali ke pemanggilan awal.
    - FASE SUBSTITUSI
     hitungLaba(100000, 0) = 100000
    = 1.11 × 100000
    = 111000
    = 1.11 × 111000
    = 123210
    = 1.11 × 123210
    = 136763.1
Jadi, hasil akhir dari pemanggilan fungsi hitungLaba(100000, 3) adalah 136763.1, yang menunjukkan jumlah saldo investor setelah tiga tahun 
investasi dengan laba sebesar 11% per tahun.*/