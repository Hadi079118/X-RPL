import java.util.Scanner;

public class tugaspercabangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Masukkan total belanja: ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("Selamat! Anda mendapatkan gantungan kunci"); 
        } else {
            int selisihbelanja = 500000 - belanja;
            System.out.println("Belanja anda kurang dari Rp. 500.000");
            System.out.println("Silahkan tambah lagi belanjanya senilai Rp. " + selisihbelanja);
            System.out.println("Agar bisa mendapatkan gantungan kunci");
            input.close();
        }

    }
}
