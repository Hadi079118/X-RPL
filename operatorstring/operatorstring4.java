import java.util.Scanner;

public class operatorstring4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, alamat, email;

        do {
            System.out.print("Masukkan Nama: ");
            nama = scanner.nextLine().trim();
            if (nama.isEmpty()) {
                System.out.println("Nama tidak boleh kosong. Silakan input kembali.");
            }
        } while (nama.isEmpty());

        do {
            System.out.print("Masukkan Alamat: ");
            alamat = scanner.nextLine().trim();
            if (alamat.isEmpty()) {
                System.out.println("Alamat tidak boleh kosong. Silakan input kembali.");
            }
        } while (alamat.isEmpty());

        do {
            System.out.print("Masukkan Email: ");
            email = scanner.nextLine().trim();
            if (email.isEmpty()) {
                System.out.println("Email tidak boleh kosong. Silakan input kembali.");
            }
        } while (email.isEmpty());

        System.out.println("\n--- Biodata Anda ---");
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Email  : " + email);
    }
}
