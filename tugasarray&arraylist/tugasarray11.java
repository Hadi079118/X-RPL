import java.util.Scanner;

public class tugasarray11 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        String[] nama = new String[jumlahSiswa];
        int[][] nilai = new int[jumlahSiswa][3];
        double[] rataRata = new double[jumlahSiswa];
        char[] nilaiHuruf = new char[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Data untuk siswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama[i] = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
            scanner.nextLine();

            int total = nilai[i][0] + nilai[i][1] + nilai[i][2];
            rataRata[i] = total / 3.0;

            if (rataRata[i] >= 81) {
                nilaiHuruf[i] = 'A';
            } else if (rataRata[i] >= 71) {
                nilaiHuruf[i] = 'B';
            } else if (rataRata[i] >= 51) {
                nilaiHuruf[i] = 'C';
            } else if (rataRata[i] >= 31) {
                nilaiHuruf[i] = 'D';
            } else {
                nilaiHuruf[i] = 'E';
            }
        }

        System.out.println("\nOutput:");
        System.out.println("No.\tNama\t\tRata-rata\tNilai Huruf");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.printf("%d.\t%-15s\t%.2f\t\t%c\n", (i + 1), nama[i], rataRata[i], nilaiHuruf[i]);
        }

        scanner.close();
    }
}
