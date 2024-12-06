import java.util.Scanner;

public class operatorstring1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        int length = kalimat.length();

        if (length < 10) {
            System.out.println("Jumlah Karakter: " + length);
            System.out.println("LOW");
        } else if (length >= 10 && length <= 50) {
            System.out.println("Jumlah Karakter: " + length);
            System.out.println("MEDIUM");
        } else if (length > 50) {
            System.out.println("Jumlah Karakter: " + length);
            System.out.println("HIGH");
        }

        scanner.close();
    }
}