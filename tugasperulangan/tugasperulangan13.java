import java.util.Scanner;

public class tugasperulangan13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahDeret;

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        jumlahDeret = scanner.nextInt();

        int a = 1, b = 1, count = 2; 
        System.out.print("Deret Fibonacci: ");
        System.out.print(a + " " + b + " ");

        do {
            int next = a + b; 
            System.out.print(next + " "); 
            a = b; 
            b = next;
            count++;
        } while (count < jumlahDeret);

        System.out.println();
        scanner.close();
    }
}