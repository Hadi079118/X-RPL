import java.util.Scanner;

public class tugaspercabangan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Masukkan total belanja: ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("Selamat! Anda mendapatkan gantungan kunci"); 
        } 
        

    }
}
