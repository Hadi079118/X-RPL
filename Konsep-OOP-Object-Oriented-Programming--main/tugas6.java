import java.util.Scanner;

class BangunDatar {
    protected float hasil;

    public float luas() {
        return hasil;
    }

    public float keliling() {
        return hasil;
    }
}

class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        hasil = panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

class Persegi extends BangunDatar {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
        hasil = sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
}

class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        hasil = 0.5f * alas * tinggi;
    }

    @Override
    public float keliling() {
        return (float) (alas + 2 * Math.sqrt(alas * alas / 4 + tinggi * tinggi));
    }
}

class Lingkaran extends BangunDatar {
    private float r;

    public Lingkaran(float r) {
        this.r = r;
        hasil = (float) Math.PI * r * r;
    }

    @Override
    public float keliling() {
        return 2 * (float) Math.PI * r;
    }
}

public class tugas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Persegi");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih!");
                break;
            }

            float panjang, lebar, sisi, alas, tinggi, r;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    panjang = scanner.nextFloat();
                    System.out.print("Masukkan lebar: ");
                    lebar = scanner.nextFloat();
                    PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas Persegi Panjang: " + pp.luas());
                    System.out.println("Keliling Persegi Panjang: " + pp.keliling());
                    break;
                case 2:
                    System.out.print("Masukkan sisi: ");
                    sisi = scanner.nextFloat();
                    Persegi p = new Persegi(sisi);
                    System.out.println("Luas Persegi: " + p.luas());
                    System.out.println("Keliling Persegi: " + p.keliling());
                    break;
                case 3:
                    System.out.print("Masukkan alas: ");
                    alas = scanner.nextFloat();
                    System.out.print("Masukkan tinggi: ");
                    tinggi = scanner.nextFloat();
                    Segitiga s = new Segitiga(alas, tinggi);
                    System.out.println("Luas Segitiga: " + s.luas());
                    System.out.println("Keliling Segitiga: " + s.keliling());
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari: ");
                    r = scanner.nextFloat();
                    Lingkaran l = new Lingkaran(r);
                    System.out.println("Luas Lingkaran: " + l.luas());
                    System.out.println("Keliling Lingkaran: " + l.keliling());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}