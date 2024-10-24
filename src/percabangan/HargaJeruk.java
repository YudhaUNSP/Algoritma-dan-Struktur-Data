package percabangan;

import java.util.Scanner;

public class HargaJeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Meminta pengguna memasukkan jumlah jeruk yang ingin dibeli
        System.out.print("Masukkan jumlah jeruk yang dibeli: ");
        int jumlahJeruk = scanner.nextInt();
        // Variabel untuk menyimpan total harga
        int totalHarga = 0;
        // Menghitung harga dengan memaksimalkan diskon
        int paketLima = jumlahJeruk / 5;
        jumlahJeruk %= 5;

        int paketDua = jumlahJeruk / 2;
        jumlahJeruk %= 2;

        int paketSatu = jumlahJeruk;
        // Menghitung total harga
        totalHarga += paketLima * 10000; // Harga untuk paket 5 jeruk
        totalHarga += paketDua * 5000;   // Harga untuk paket 2 jeruk
        totalHarga += paketSatu * 3000;  // Harga untuk 1 jeruk
        // Menampilkan total harga
        System.out.println("Total harga: " + totalHarga + " rupiah");

        scanner.close();
    }
}
