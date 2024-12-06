import java.util.Scanner;

public class operatorstring9 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        String[] kataArray = kalimat.split(" ");

        System.out.println("\n--- Hasil Pemisahan dan Pengubahan ---");
        for (String kata : kataArray) {
            String kataUpper = kata.toUpperCase(); 
            int panjangKata = kata.length(); 
            System.out.println("Kata: " + kataUpper + " | Panjang: " + panjangKata);
        }
    }
}
