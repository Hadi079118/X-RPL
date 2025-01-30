import java.util.Scanner;

class BangunRuang {
    protected double hasil;

    public double getHasil() {
        return hasil;
    }

    public double volume() {
        return 0;
    }
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }
}

class Kubus extends BangunRuang {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }
}

class Tabung extends BangunRuang {
    private double r;
    private double tinggi;

    public void setR(double r) {
        this.r = r;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return 3.14 * r * r * tinggi;
    }
}

class Kerucut extends BangunRuang {
    private double r;
    private double tinggi;

    public void setR(double r) {
        this.r = r;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (1.0 / 3) * 3.14 * r * r * tinggi;
    }
}

public class tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilih bangun ruang:");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    Balok balok = new Balok();
                    System.out.print("Masukkan panjang: ");
                    balok.setPanjang(input.nextDouble());
                    System.out.print("Masukkan lebar: ");
                    balok.setLebar(input.nextDouble());
                    System.out.print("Masukkan tinggi: ");
                    balok.setTinggi(input.nextDouble());
                    System.out.println("Volume Balok: " + balok.volume());
                    break;
                case 2:
                    Kubus kubus = new Kubus();
                    System.out.print("Masukkan sisi: ");
                    kubus.setSisi(input.nextDouble());
                    System.out.println("Volume Kubus: " + kubus.volume());
                    break;
                case 3:
                    Tabung tabung = new Tabung();
                    System.out.print("Masukkan jari-jari: ");
                    tabung.setR(input.nextDouble());
                    System.out.print("Masukkan tinggi: ");
                    tabung.setTinggi(input.nextDouble());
                    System.out.println("Volume Tabung: " + tabung.volume());
                    break;
                case 4:
                    Kerucut kerucut = new Kerucut();
                    System.out.print("Masukkan jari-jari: ");
                    kerucut.setR(input.nextDouble());
                    System.out.print("Masukkan tinggi: ");
                    kerucut.setTinggi(input.nextDouble());
                    System.out.println("Volume Kerucut: " + kerucut.volume());
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
        input.close();
    }
}