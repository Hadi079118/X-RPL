import java.util.Scanner;

public class tugasperulangan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret yang ingin ditampilkan: ");
        int jumlahDeret = scanner.nextInt();

        int bilangan = 3; 
        int selisih = 2; 

        System.out.print("Deret bilangan: ");
        for (int i = 1; i <= jumlahDeret; i++) {
            System.out.print(bilangan + " "); 
            selisih++;
            bilangan += selisih; 
        }

        System.out.println(); 
        scanner.close(); 
    }
}
