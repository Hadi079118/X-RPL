import java.util.Scanner;

public class tugasarray13 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriksA = new int[3][2];
        int[][] matriksB = new int[3][2];
        int[][] hasil = new int[3][2];

        System.out.println("Masukkan elemen Matriks A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Matriks A[%d][%d]: ", i, j);
                matriksA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen Matriks B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Matriks B[%d][%d]: ", i, j);
                matriksB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\nHasil Penjumlahan Matriks A dan Matriks B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
