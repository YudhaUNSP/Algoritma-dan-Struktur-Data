package percabangan;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Meminta pengguna memasukkan sebuah bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();
        // Mengecek apakah bilangan tersebut genap atau ganjil
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        scanner.close();
    }
}