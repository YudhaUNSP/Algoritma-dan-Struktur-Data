package programsederhana;

import java.util.Scanner;

public class HitungKelilingLingkaran {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double keliling = 2 * PI * jariJari;
        System.out.println("Keliling lingkaran: " + keliling);
        scanner.close();
    }
}
