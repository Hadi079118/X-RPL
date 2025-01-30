import java.util.Scanner;

public class tugas9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binatang hewan = null;
        int pilihan;

        while (true) {
            System.out.println("*** Kebon Binatang Surabaya ***");
            System.out.println("Pilih hewan:");
            System.out.println("1. Gajah");
            System.out.println("2. Kelinci");
            System.out.println("3. Burung");
            System.out.println("4. Kucing");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer input

            if (pilihan == 5) {
                System.out.println("Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    hewan = new Gajah();
                    break;
                case 2:
                    hewan = new Kelinci();
                    break;
                case 3:
                    hewan = new Burung();
                    break;
                case 4:
                    hewan = new Kucing();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            // Menampilkan informasi hewan yang dipilih
            System.out.println("--- Info hewan yang dipilih: " + hewan.getClass().getSimpleName() + " ---");
            hewan.makan();
            hewan.berkembangbiak();
            hewan.hidupdi();
            hewan.termasukjenishewan();
        }

        scanner.close();
    }
}

class Binatang {
    public void makan() {
        System.out.println("Hewan ini makan.");
    }

    public void berkembangbiak() {
        System.out.println("Hewan ini berkembang biak.");
    }

    public void hidupdi() {
        System.out.println("Hewan ini hidup di suatu tempat.");
    }

    public void termasukjenishewan() {
        System.out.println("Hewan ini termasuk jenis hewan.");
    }
}

class Gajah extends Binatang {
    @Override
    public void makan() {
        System.out.println("Gajah makan rumput.");
    }

    @Override
    public void berkembangbiak() {
        System.out.println("Gajah berkembang biak dengan beranak.");
    }

    @Override
    public void hidupdi() {
        System.out.println("Gajah hidup di darat.");
    }

    @Override
    public void termasukjenishewan() {
        System.out.println("Gajah termasuk binatang herbivora.");
    }
}

class Kelinci extends Binatang {
    @Override
    public void makan() {
        System.out.println("Kelinci makan wortel dan rumput.");
    }

    @Override
    public void berkembangbiak() {
        System.out.println("Kelinci berkembang biak dengan beranak.");
    }

    @Override
    public void hidupdi() {
        System.out.println("Kelinci hidup di darat.");
    }

    @Override
    public void termasukjenishewan() {
        System.out.println("Kelinci termasuk binatang herbivora.");
    }
}

class Burung extends Binatang {
    @Override
    public void makan() {
        System.out.println("Burung makan biji-bijian dan serangga.");
    }

    @Override
    public void berkembangbiak() {
        System.out.println("Burung berkembang biak dengan telur.");
    }

    @Override
    public void hidupdi() {
        System.out.println("Burung hidup di udara.");
    }

    @Override
    public void termasukjenishewan() {
        System.out.println("Burung termasuk binatang ovipar.");
    }
}

class Kucing extends Binatang {
    @Override
    public void makan() {
        System.out.println("Kucing makan ikan dan daging.");
    }

    @Override
    public void berkembangbiak() {
        System.out.println("Kucing berkembang biak dengan beranak.");
    }

    @Override
    public void hidupdi() {
        System.out.println("Kucing hidup di darat.");
    }

    @Override
    public void termasukjenishewan() {
        System.out.println("Kucing termasuk binatang karnivora.");
    }
}