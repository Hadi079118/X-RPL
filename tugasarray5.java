import java.util.Scanner;

public class tugasarray5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin diinputkan: ");
        int n = scanner.nextInt();

        int[] angka = new int[n];

        System.out.println("Masukkan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }

        System.out.println("\nTotal dari angka yang diinputkan adalah: " + total);
    } 
}
