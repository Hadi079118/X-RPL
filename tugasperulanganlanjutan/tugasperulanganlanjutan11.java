import java.util.Scanner;

public class tugasperulanganlanjutan11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran sisi persegi minimal 3: ");
        int ukuran = scanner.nextInt();

        if (ukuran < 3) {
            System.out.println("Ukuran sisi harus minimal 3.");
        } else {
            for (int i = 1; i <= ukuran; i++) {
                for (int j = 1; j <= ukuran; j++) {
                    if (i == 1 || i == ukuran || j == 1 || j == ukuran || i == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); 
                    }
                }
                System.out.println(); 
            }
        }

        scanner.close(); 
    }
}
