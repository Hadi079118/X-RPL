import java.util.Scanner;

public class tugasperulanganlanjutan9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = scanner.nextInt();  
        
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();  
        }
        scanner.close();
    }
}
