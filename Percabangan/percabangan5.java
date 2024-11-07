import java.util.Scanner;

public class percabangan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input angka
        System.out.print("Masukkan angka (1-7): ");
        int angka = scanner.nextInt();

        String namaHari;

        // Menentukan nama hari berdasarkan angka
        switch (angka) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jum'at";

                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Angka tidak valid. Harap masukkan angka antara 1 hingga 7.";
                break;
        }

        // Menampilkan hasil
        System.out.println("Hari: " + namaHari);
    }
}
