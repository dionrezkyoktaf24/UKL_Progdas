
import java.util.Scanner;

public class LuasPermukaanBola {
    public static double hitungluaspermukaanbola (double jariJari) {
        double luas = 4 * 3.14 * jariJari * jariJari;
                return luas;
        
    }
    public static void main(String[] args) {
        Scanner dion = new Scanner(System.in);

        System.out.println("Masukkan Jari-Jari Bola (cm) : ");
        double jariJari = dion.nextDouble();

        double LuasPermukaanBola = hitungluaspermukaanbola(jariJari);

        System.out.println("Luas Permukaan bola Adalah : "+LuasPermukaanBola + "cm²");

    

        
    }

    
}