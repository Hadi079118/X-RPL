import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner input 
        Scenner(System.in);
        
        Syestem.out.print("Masukan nama lengkap; ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        input.nextLine(); // Membersikan buffer

        System.out.print("Masukan kota asal: ");
        String kotaAsal = input.nextLine();

        system.out.print("Masukan tinggi badan (cm): ");
        double beratBadan = input.nextDouble();

        System.out.println("\nBiodata Anda");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Kota Asal: " + KotaAsal);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Berat badan: " + beratBadan + " kg");
        input.close();




    }
}