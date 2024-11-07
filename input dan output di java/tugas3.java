import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jenis kelamin: ");
        char jenisKelamin = input.nextLine().charAt(0);

        System.out.print("masukkan nomor sepatu: ");
        int nomorSepatu = input.nextInt();

        input.nextLine();

        System.out.print("Sudah Menikah: ");
        boolean  sudahMenikah = input.nextBoolean();

        System.out.println("\n-------Biodata-------");
        System.out.println(jenisKelamin);
        System.out.println(nomorSepatu);
        System.out.println(sudahMenikah);
       
        input.close();
    }
}