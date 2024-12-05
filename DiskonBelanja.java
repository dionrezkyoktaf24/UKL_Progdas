
import java.util.Scanner;

public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner dion = new Scanner(System.in);
        System.out.println("Masukkan Total Belanja : ");
        double totalBelanja = dion.nextDouble () ;
        double diskon;

        if (totalBelanja < 100000) {
            diskon = 0;
        }else if (totalBelanja <= 200000) {
            diskon = 0.1;
        }else {
            diskon = 0.2;
        }

        double totalBayar = totalBelanja - (totalBelanja * diskon);
        System.out.println("Harga Awal : " +totalBelanja);
        System.out.println("Harga Setelah Diskon : Rp " +totalBayar);
    }
}