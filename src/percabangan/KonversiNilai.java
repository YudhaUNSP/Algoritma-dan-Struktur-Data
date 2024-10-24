package percabangan;

import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = scanner.nextInt();
        // Variabel untuk menyimpan nilai huruf
        char nilaiHuruf;
        // Menentukan nilai huruf berdasarkan kriteria
        if (nilai > 85) {
            nilaiHuruf = 'A';
        } else if (nilai > 75) {
            nilaiHuruf = 'B';
        } else if (nilai > 65) {
            nilaiHuruf = 'C';
        } else if (nilai > 55) {
            nilaiHuruf = 'D';
        } else {
            nilaiHuruf = 'E';
        }
        // Menampilkan hasil konversi
        System.out.println("Nilai huruf: " + nilaiHuruf);

        scanner.close();
    }
}
