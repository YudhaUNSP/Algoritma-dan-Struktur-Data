package programsederhana;

import java.util.Scanner;

public class HitungUangKembalian {
    public static void main(String[] args) {
        final double HARGA_PER_KG = 28000.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah Telur (kg): ");
        double jumlahTelur = scanner.nextDouble();
        double totalBayar = jumlahTelur * HARGA_PER_KG;
        System.out.println("Total Bayar: " + totalBayar);
        System.out.print("Uang yang dibayarkan: ");
        double uangDibayarkan = scanner.nextDouble();
        double uangKembalian = uangDibayarkan - totalBayar;
        System.out.println("Uang Kembalian: " + uangKembalian);
    }
}
