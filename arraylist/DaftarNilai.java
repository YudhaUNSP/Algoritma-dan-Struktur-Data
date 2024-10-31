import java.util.ArrayList;
import java.util.Scanner;

public class DaftarNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();
        int totalNilai = 0;

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Mahasiswa Ke-" + (i + 1));
            System.out.print("Nama: ");
            namaMahasiswa.add(input.next());

            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            nilaiMahasiswa.add(nilai);

            totalNilai += nilai;
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("===============================");
        System.out.println("No  Nama       Nilai  Status");

        for (int i = 0; i < jumlahData; i++) {
            String status = nilaiMahasiswa.get(i) >= 60 ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + "   " + namaMahasiswa.get(i) + "       " + nilaiMahasiswa.get(i) + "    " + status);
        }

        double rataRataNilai = (double) totalNilai / jumlahData;
        System.out.println("===============================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + String.format("%.1f", rataRataNilai));

        input.close();
    }
}
