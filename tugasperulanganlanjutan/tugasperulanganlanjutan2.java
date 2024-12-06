import java.util.Scanner;

public class tugasperulanganlanjutan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int angka; 
        
        
        while (true) {
            System.out.print("Masukkan angka 0 untuk berhenti: ");
            angka = scanner.nextInt();
            
            if (angka == 0) {
                break; 
            }
            
            System.out.println("Anda memasukkan angka: " + angka);
        }
        
        System.out.println("Program berhenti karena Anda memasukkan angka 0.");
        
        scanner.close(); 
    }
}
