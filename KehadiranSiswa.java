import java.util.Scanner;

public class KehadiranSiswa {
    public static void main(String[] args) {
        Scanner dion = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = dion.nextInt();

        int[] kehadiran = new int[jumlahSiswa];
        int totalKehadiran = 0;

        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = dion.nextInt();
            totalKehadiran += kehadiran[i];
        }

       
        double rataRata = (double) totalKehadiran / jumlahSiswa;
        System.out.println("\nRata-rata kehadiran siswa: " + rataRata + " hari");

       
        System.out.println("\nKesimpulan:");
        System.out.println("Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRata) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }

        System.out.println("\nSiswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRata) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
    }
}
