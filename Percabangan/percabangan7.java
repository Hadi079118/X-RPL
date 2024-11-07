import java.util.Scanner;

public class percabangan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        int terbesar;
        if (angka1 > angka2) {
            terbesar = angka1;
        } else {
            terbesar = angka2;
        }

        System.out.println("Angka terbesar adalah: " + terbesar);

        scanner.close();
    }
}
