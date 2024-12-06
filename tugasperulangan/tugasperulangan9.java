import java.util.Scanner;

public class tugasperulangan9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan untuk menghitung faktorial: ");
        int bilangan = scanner.nextInt();

        
        if (bilangan < 0) {
            System.out.println("Faktorial tidak dapat dihitung untuk bilangan negatif.");
        } else {        
            int faktorial = 1;
            int i = bilangan;

            while (i > 0) {
                faktorial *= i; 
                i--; 
            }

            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }

        scanner.close(); 
    }
}
