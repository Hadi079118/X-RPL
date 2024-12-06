import java.util.Scanner;

public class operatorstring2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat yang ingin ditulis: ");
        String tulisan = scanner.nextLine();

        int jumlahKarakter = tulisan.length();

        int gaji = 0;

        if (jumlahKarakter >= 100) {
            gaji = (jumlahKarakter / 100) * 10000;
        } else if (jumlahKarakter >= 50) {
            gaji = 5000;
        } else {
            gaji = 2000;
        }

        if (jumlahKarakter > 1000) {
            gaji += gaji * 0.1; 
        }

        System.out.println("\n--- Perhitungan Gaji Penulis ---");
        System.out.println("Jumlah karakter yang ditulis: " + jumlahKarakter);
        System.out.println("Gaji total: Rp " + gaji);
    }
}
