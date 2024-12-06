import java.util.Scanner;

public class operatorstring17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan: ");
        String namaDepan = scanner.nextLine();

        System.out.print("Masukkan nama belakang: ");
        String namaBelakang = scanner.nextLine();

        String namaLengkap = namaDepan + " " + namaBelakang;

        System.out.print("Masukkan alamat lengkap: ");
        String alamat = scanner.nextLine();

        String alamatLengkap = "Alamat " + namaLengkap + " di " + alamat;

        System.out.println("\nNama Lengkap: " + namaLengkap);
        System.out.println("Alamat Lengkap: " + alamatLengkap);

        String namaLengkapBergantian = ubahHurufBergantian(namaLengkap);

        String alamatBergantian = ubahHurufBergantian(alamatLengkap);

        System.out.println("\nNama Lengkap Bergantian: " + namaLengkapBergantian);
        System.out.println("Alamat Lengkap Bergantian: " + alamatBergantian);
    }

    public static String ubahHurufBergantian(String str) {
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % 2 == 0) {
                hasil.append(Character.toUpperCase(c));
                hasil.append(Character.toLowerCase(c)); 
            }
        }
        return hasil.toString();
    }
}
