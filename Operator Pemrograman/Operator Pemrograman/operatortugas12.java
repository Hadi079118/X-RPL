import java.util.Scanner;

public class operatortugas12 {
    public static void main(String[] args) {
        // Membuat scanner untuk mengambil input dari user
        Scanner input = new Scanner(System.in);
        
        // Meminta input tinggi badan dari user
        System.out.print("Masukkan tinggi badan (cm): ");
        int tinggi = input.nextInt();
        
        // Meminta input nilai UN dari user
        System.out.print("Masukkan nilai UN: ");
        double nilaiUN = input.nextDouble();
        
        // Mengecek apakah memenuhi syarat
        if (tinggi >= 160 && nilaiUN >= 80) {
            System.out.println("True - Calon pegawai memenuhi syarat.");
        } else {
            System.out.println("False - Calon pegawai tidak memenuhi syarat.");
        }
        
        input.close();
    }
}