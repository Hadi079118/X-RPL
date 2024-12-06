import java.util.Scanner;

public class operatorstring8 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kalimat1 = "HUMMASOFT TECHNOLOGY MALANG";
        String kalimat2 = "kelas industri bergengsi di indonesia";
        String kalimat3 = "hummasoft mempunyai produk sistem sekolah";

        String hasil1 = kalimat1.toLowerCase();
        String hasil2 = kalimat2.toUpperCase(); 

        String[] bagianKalimat3 = kalimat3.split(" ");
        String hasil3 = bagianKalimat3[0].toUpperCase() + " " 
                + bagianKalimat3[1] + " " + bagianKalimat3[2] + " " 
                + bagianKalimat3[3].toUpperCase() + " " + bagianKalimat3[4];

        System.out.println("--- Hasil Perubahan Kalimat ---");
        System.out.println("1. " + hasil1);
        System.out.println("2. " + hasil2);
        System.out.println("3. " + hasil3);
    }
}
