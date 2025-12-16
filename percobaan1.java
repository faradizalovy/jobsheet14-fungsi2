public class percobaan1 {
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekursif(n - 1));
            }
        }
        static int faktorialteratif(int n) {
            int faktor = 1;
            for (int i = n; i >= 1; i--) {
                faktor = faktor * i;
            }
            return faktor;
        }
        public static void main(String[] args) {
            System.out.println(faktorialRekursif(5));
            System.out.println(faktorialteratif(5));
        }
}

/*PERTANYAAN*/

/*1. Apa yang dimaksud dengan fungsi rekursif?
Jawaban: Fungsi rekursif adalah fungsi yang di dalam proses eksekusinya melakukan 
pemanggilan terhadap dirinya sendiri. Pemanggilan ini dilakukan untuk menyelesaikan 
masalah dengan cara memecahnya menjadi bagian yang lebih kecil hingga mencapai kondisi 
tertentu yang disebut base case. Base case berfungsi sebagai batas penghentian agar proses 
pemanggilan fungsi tidak berlangsung tanpa akhir.*/

/*2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi 
faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi 
rekursif dan fungsi iteratif! 
Jawaban: Pada Percobaan 1, hasil yang diberikan oleh fungsi faktorialRekursif() dan fungsi 
faktorialIteratif() adalah sama, yaitu nilai faktorial dari bilangan yang dihitung. Meskipun 
menghasilkan output yang sama, alur programnya berbeda. Pada fungsi rekursif, perhitungan 
dilakukan dengan pemanggilan fungsi secara berulang hingga mencapai base case, kemudian hasil 
perhitungan dikembalikan secara bertahap ke pemanggilan sebelumnya. Sedangkan, pada fungsi iteratif, 
perhitungan dilakukan dengan menggunakan struktur perulangan dalam satu fungsi tanpa pemanggilan fungsi berulang, 
sehingga proses eksekusi berjalan secara langsung dan lebih sederhana*/
