
import java.util.Scanner;

public class operatortugas13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Quiz section (unchanged)
        System.out.println("--Pertanyaan--");
        System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?");
        System.out.println("Pilihlah 2 jawaban berikut: ");
        System.out.println("1. Operator Indosat");
        System.out.println("2. Operator Aritmatika");
        System.out.println("3. Operator Telkomsel");
        System.out.println("4. Operator Assignment");

        System.out.print("Masukkan nomor pilihan pertama Anda (1-4): ");
        int jawaban1 = input.nextInt();

        System.out.print("Masukkan nomor pilihan kedua Anda (1-4): ");
        int jawaban2 = input.nextInt();

        boolean benar1 = (jawaban1 == 2 || jawaban1 == 4);
        boolean benar2 = (jawaban2 == 2 || jawaban2 == 4);

        if (benar1 && benar2) {
            System.out.println("Selamat! Kedua jawaban Anda benar.");
        } else if (benar1 || benar2) {
            System.out.println("Anda benar sebagian. Salah satu jawaban Anda benar.");
        } else {
            System.out.println("Maaf, kedua jawaban Anda salah.");
        }

        System.out.println("Jawaban yang benar adalah:");
        System.out.println("2. Operator Aritmatika");
        System.out.println("4. Operator Assignment");

        // New section for NIS check
        System.out.println("\n--Pengecekan Kelulusan--");
        System.out.print("Masukkan NIS Anda: ");
        int nis = input.nextInt();

        boolean lulus = (nis == 1001 || nis == 1002 || nis == 1003 || nis == 1004);

        System.out.println("Status kelulusan: " + lulus);

        input.close();
    }
}