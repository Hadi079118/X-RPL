import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama sekolah: ");
        String nama = input.nextLine();

        System.out.print("masukkan jarak ke rumah: ");
        int angka = input.nextInt();

        input.nextLine();

        System.out.print("masukkan kode plat: ");
        char  plat = input.nextLine(). charAt(0);

        System.out.print("masukan anak ke: ");
        int anak = input.nextInt();

        System.out.println("\n-------Output-------");
        System.out.println("Nama Sekolah\t: " + nama);
        System.out.println("Angka\t\t: " + angka);
        System.out.println("Desimal\t\t: " + plat);
        System.out.println("Anak Keberapa\t: " + anak);

        input.close();
    }
}