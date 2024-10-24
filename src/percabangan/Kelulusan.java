package percabangan;

import java.util.Scanner;

public class Kelulusan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        // Menentukan apakah nilai tersebut memenuhi kriteria kelulusan
        if (nilai > 75) {
            System.out.println("Selamat! Anda lulus.");
        } else {
            System.out.println("Maaf, Anda tidak lulus.");
        }

        scanner.close();
    }
}
