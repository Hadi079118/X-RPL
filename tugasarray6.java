import java.util.Scanner;

public class tugasarray6 {
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

        int maks = angka[0];
        for (int i = 1; i < n; i++) {
            if (angka[i] > maks) {
                maks = angka[i];
            }
        }

        System.out.println("\nAngka terbesar dari angka yang diinputkan adalah: " + maks);
    }
}
