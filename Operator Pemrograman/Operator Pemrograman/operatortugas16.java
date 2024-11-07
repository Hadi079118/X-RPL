
    
import java.util.Scanner;

public class operatortugas16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai siswa: ");
        double grade = scanner.nextDouble();

        String promotionMessage = (grade >= 85) ? "NAIK KELAS" : "TIDAK NAIK KELAS";

        System.out.println(promotionMessage);
        
        scanner.close();
    }
}
