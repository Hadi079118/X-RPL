import java.util.ArrayList;
import java.util.Scanner;

public class tugasarray17 {
      public static void main(String[] args) {
        ArrayList<String> merkLaptop = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Pilihan ===");
            System.out.println("1. Menambahkan data nama merk laptop");
            System.out.println("2. Melihat daftar nama merk laptop");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama merk laptop: ");
                    String merk = scanner.nextLine();
                    merkLaptop.add(merk);
                    System.out.println("Merk laptop '" + merk + "' berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\nDaftar nama merk laptop:");
                    if (merkLaptop.isEmpty()) {
                        System.out.println("Belum ada data merk laptop yang ditambahkan.");
                    } else {
                        for (int i = 0; i < merkLaptop.size(); i++) {
                            System.out.println((i + 1) + ". " + merkLaptop.get(i));
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
