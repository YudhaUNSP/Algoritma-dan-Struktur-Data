package array;

import java.util.Scanner;

public class daftarnilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();
        String[] namaMahasiswa = new String[jumlahData];
        int[] nilaiMahasiswa = new int[jumlahData];
        int totalNilai = 0;
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Mahasiswa Ke-" + (i + 1));
            System.out.print("Nama: ");
            namaMahasiswa[i] = input.next();
            
            System.out.print("Nilai: ");
            nilaiMahasiswa[i] = input.nextInt();
            
            totalNilai += nilaiMahasiswa[i];  
        }
        
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("===============================");
        System.out.println("No  Nama       Nilai  Status");
        
        for (int i = 0; i < jumlahData; i++) {
            String status = nilaiMahasiswa[i] >= 60 ? "Lulus" : "Tidak Lulus";  
            System.out.println((i + 1) + "   " + namaMahasiswa[i] + "       " + nilaiMahasiswa[i] + "    " + status);
        }
        
        double rataRataNilai = (double) totalNilai / jumlahData;
        System.out.println("===============================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + String.format("%.1f", rataRataNilai));
        
        input.close();
    }
}
