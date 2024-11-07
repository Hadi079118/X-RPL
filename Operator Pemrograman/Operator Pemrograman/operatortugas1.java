import java.util.Scanner;

public class operatortugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai Alas: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tinggi: ");
        double tinggi = scanner.nextDouble();

        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitihga tersebut adalah: " + luas);
    }
}