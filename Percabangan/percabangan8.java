import java.util.Scanner;

public class percabangan8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        String jenisAngka1 = (angka1 % 2 == 0) ? "genap" : "ganjil";
        String jenisAngka2 = (angka2 % 2== 0) ? "genap" : "ganjil";

        System.out.println("Angka pertama (" + angka1 + ") adalah: " + jenisAngka1);
        System.out.println("Angka kedua (" + angka2 + ") adalah: " + jenisAngka2);

        scanner.close();
    }
}
