import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugasarray3 {
    public static void main(String[] args) {
    try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] merkLaptop = new String[3];
        String[] merkHandphone = new String[3];

        System.out.println("Masukkan 3 nama merek laptop:");
        for (int i = 0; i < merkLaptop.length; i++) {
            System.out.print("Merek Laptop ke-" + (i + 1) + ": ");
            merkLaptop[i] = br.readLine();
        }

        System.out.println("\nMasukkan 3 nama merek handphone:");
        for (int i = 0; i < merkHandphone.length; i++) {
            System.out.print("Merek Handphone ke-" + (i + 1) + ": ");
            merkHandphone[i] = br.readLine();
        }

        System.out.println("\nDaftar Merek Laptop:");
        for (int i = 0; i < merkLaptop.length; i++) {
            System.out.println((i + 1) + ". " + merkLaptop[i]);
        }

        System.out.println("\nDaftar Merek Handphone:");
        for (int i = 0; i < merkHandphone.length; i++) {
            System.out.println((i + 1) + ". " + merkHandphone[i]);
        }
    } catch (IOException e) {
        System.out.println("Terjadi kesalahan input/output: " + e.getMessage());
    }
}  
}
