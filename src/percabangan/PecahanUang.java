package percabangan;

import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Meminta pengguna memasukkan jumlah uang
        System.out.print("Masukkan jumlah uang: ");
        int jumlahUang = scanner.nextInt();
        // Daftar pecahan uang
        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        String[] namaPecahan = {"100 ribuan", "50 ribuan", "20 ribuan", "10 ribuan", 
                                "5 ribuan", "2 ribuan", "1 ribuan", "500", "100"};
        // Menghitung jumlah tiap pecahan
        for (int i = 0; i < pecahan.length; i++) {
            if (jumlahUang >= pecahan[i]) {
                int jumlahLembar = jumlahUang / pecahan[i];
                jumlahUang = jumlahUang % pecahan[i];
                System.out.println(jumlahLembar + " lembar " + namaPecahan[i]);
            }
        }

        scanner.close();
    }
}
