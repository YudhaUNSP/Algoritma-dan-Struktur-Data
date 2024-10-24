package array;

class Mahasiswa {
    String nama;
    int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getStatus() {
        return nilai >= 60 ? "Lulus" : "Tidak Lulus";
    }
}

public class daftarnilaijadi {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = new Mahasiswa[5];
        mahasiswa[0] = new Mahasiswa("Santi", 100);
        mahasiswa[1] = new Mahasiswa("Aldi", 50);
        mahasiswa[2] = new Mahasiswa("Riko", 100);
        mahasiswa[3] = new Mahasiswa("Rahmi", 90);
        mahasiswa[4] = new Mahasiswa("Koko", 50);

        int totalNilai = 0;

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("===============================");
        System.out.println("No  Nama       Nilai  Status");

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println((i + 1) + "   " + mahasiswa[i].nama + "    " + mahasiswa[i].nilai + "    " + mahasiswa[i].getStatus());
            totalNilai += mahasiswa[i].nilai;  
        }

        double rataRataNilai = (double) totalNilai / mahasiswa.length;
        System.out.println("===============================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + String.format("%.1f", rataRataNilai));
    }
}

