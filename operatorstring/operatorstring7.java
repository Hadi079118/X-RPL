import java.util.Scanner;

public class operatorstring7 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        kalimat = kalimat.replace("hewan", "binatang");
        kalimat = kalimat.replace("tangkai", "pohon");
        kalimat = kalimat.replace("tanaman", "tumbuhan");

        System.out.println("\n--- Kalimat Setelah Diganti ---");
        System.out.println(kalimat);
    }
}
