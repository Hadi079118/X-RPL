import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("NIS Anda: ");
        int NIS = input.nextInt();

        input.nextLine();

        System.out.print("Umur Anda: ");
        int Umur = input.nextInt();

        System.out.println("\n-------Biodata-------");
        System.out.println("Nama Anda\t: " + namaLengkap);
        System.out.println("NIS Anda\t: " + NIS);
        System.out.println("Umur Anda\t: " + Umur);
       
        input.close();
    }
}
