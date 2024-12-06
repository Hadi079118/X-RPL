import java.util.ArrayList;
import java.util.Scanner;

public class tugasarray18 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> angkaList = new ArrayList<>();

        System.out.print("Berapa jumlah angka yang ingin Anda masukkan? ");
        int jumlahAngka = scanner.nextInt();

        System.out.println("Masukkan " + jumlahAngka + " angka:");
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            int angka = scanner.nextInt();
            angkaList.add(angka);
        }

        int total = 0;
        for (int angka : angkaList) {
            total += angka;
        }
        double rataRata = (double) total / jumlahAngka;

        System.out.println("\nAngka yang dimasukkan: " + angkaList);
        System.out.println("Total angka: " + total);
        System.out.println("Rata-rata: " + rataRata);

        scanner.close();
    }
}
