import java.util.Scanner;

public class tugasperulanganlanjutan6 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0; 
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = scanner.nextInt();
            
            if (angka % 5 != 0) {
                continue; 
            }
            
            total += angka;
        }
        System.out.println("Jumlah kelipatan 5 adalah: " + total);
        
        scanner.close(); 
    }
}
