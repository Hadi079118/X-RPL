import java.util.Scanner;

public class tugas8 {

    static Pasien[] pasienArray = new Pasien[100];
    static Dokter[] dokterArray = new Dokter[100];
    static int pasienCount = 0;
    static int dokterCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input");
            System.out.println("2. Update");
            System.out.println("3. View");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (pilihan) {
                case 1:
                    inputPasien(scanner);
                    break;
                case 2:
                    updatePasien(scanner);
                    break;
                case 3:
                    viewData();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void inputPasien(Scanner scanner) {
        System.out.println("Input Data Pasien:");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Penyakit: ");
        String penyakit = scanner.nextLine();

        System.out.print("Nomor Kamar: ");
        String noKamar = scanner.nextLine();

        System.out.print("Nomor KTP: ");
        int ktp = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Input Data Dokter
        System.out.println("Input Data Dokter:");
        System.out.print("Nama Dokter: ");
        String namaDokter = scanner.nextLine();

        System.out.print("Spesialis: ");
        String spesialis = scanner.nextLine();

        // Create and store new Pasien and Dokter objects
        Pasien newPasien = new Pasien(nama, penyakit, noKamar, ktp);
        Dokter newDokter = new Dokter(namaDokter, spesialis);

        pasienArray[pasienCount++] = newPasien;
        dokterArray[dokterCount++] = newDokter;

        System.out.println("Data pasien dan dokter berhasil disimpan.");
    }

    static void updatePasien(Scanner scanner) {
        System.out.print("Masukkan Nomor KTP pasien yang ingin diupdate: ");
        int ktp = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < pasienCount; i++) {
            if (pasienArray[i] != null && pasienArray[i].getKtp() == ktp) {
                System.out.println("Data ditemukan. Silakan masukkan data baru.");

                System.out.print("Nama: ");
                pasienArray[i].setNama(scanner.nextLine());

                System.out.print("Penyakit: ");
                pasienArray[i].setPenyakit(scanner.nextLine());

                System.out.print("Nomor Kamar: ");
                pasienArray[i].setNoKamar(scanner.nextLine());

                System.out.println("Data pasien berhasil diupdate.");
                return;
            }
        }
        System.out.println("Pasien dengan Nomor KTP tersebut tidak ditemukan.");
    }

    static void viewData() {
        System.out.println("Data Pasien:");
        for (int i = 0; i < pasienCount; i++) {
            if (pasienArray[i] != null) {
                System.out.println(pasienArray[i]);
            }
        }

        System.out.println("Data Dokter:");
        for (int i = 0; i < dokterCount; i++) {
            if (dokterArray[i] != null) {
                System.out.println(dokterArray[i]);
            }
        }
    }
}

class Pasien {
    private String nama;
    private String penyakit;
    private String noKamar;
    private int ktp;

    public Pasien(String nama, String penyakit, String noKamar, int ktp) {
        this.nama = nama;
        this.penyakit = penyakit;
        this.noKamar = noKamar;
        this.ktp = ktp;
    }

    public int getKtp() {
        return ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Penyakit: " + penyakit + ", Nomor Kamar: " + noKamar + ", KTP: " + ktp;
    }
}

class Dokter {
    private String nama;
    private String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    @Override
    public String toString() {
        return "Nama Dokter: " + nama + ", Spesialis: " + spesialis;
    }
}