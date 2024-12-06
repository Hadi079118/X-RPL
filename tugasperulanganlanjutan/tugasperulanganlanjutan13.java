import java.util.Scanner;

public class tugasperulanganlanjutan13 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga silu-silu: ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }

        scanner.close(); 
    }
}
