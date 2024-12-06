import java.util.Scanner;

public class operatorstring11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        String[] kataArray = kalimat.split(" ");

        System.out.print("Masukkan nomor karakter yang ingin ditampilkan dari setiap kata: ");
        int charIndex = scanner.nextInt();

        StringBuilder hasil = new StringBuilder();
        for (String kata : kataArray) {
            if (kata.length() >= charIndex) { 
                hasil.append(kata.charAt(charIndex - 1));
            } else {
                hasil.append(" "); 
            }
        }

        System.out.println("\n--- Hasil Karakter Tertentu dari Setiap Kata ---");
        System.out.println("Kalimat baru: " + hasil.toString());
    }
}
