import java.util.Scanner;  

abstract class Timbangan {  
    abstract double hitung(double berat, double tinggi, int jenisKelamin);  
    abstract int hitung(int berat, int tinggi, int jenisKelamin);  
    abstract void hasil();  
}  

class TimbanganDigital extends Timbangan {  
    private double berat;  
    private double tinggi;  
    private double hasil;  

    @Override  
    public double hitung(double berat, double tinggi, int jenisKelamin) {  
        this.berat = berat;  
        this.tinggi = tinggi;  
        if (jenisKelamin == 1) {  
            hasil = (tinggi - 100) - ((tinggi - 100) * 10 / 100);  
        } else {  
            hasil = (tinggi - 100) - ((tinggi - 100) * 15 / 100);  
        }  
        return hasil;  
    }  

    @Override  
    public int hitung(int berat, int tinggi, int jenisKelamin) {  
        this.berat = berat;  
        this.tinggi = tinggi;  
        if (jenisKelamin == 1) {  
            return (int) ((tinggi - 100) - ((tinggi - 100) * 10 / 100));  
        } else {  
            return (int) ((tinggi - 100) - ((tinggi - 100) * 15 / 100));  
        }  
    }  

    @Override  
    public void hasil() {  
        System.out.printf("Berat badan ideal kamu yaitu: %.2f kg \n", hasil);  
    }  
}  

class TimbanganAnalog extends Timbangan {  
    private int berat;  
    private int tinggi;  
    private int hasil;  

    @Override  
    public double hitung(double berat, double tinggi, int jenisKelamin) {  
        return 0; // Tidak digunakan  
    }  

    @Override  
    public int hitung(int berat, int tinggi, int jenisKelamin) {  
        this.berat = berat;  
        this.tinggi = tinggi;  
        if (jenisKelamin == 1) {  
            hasil = (int) ((tinggi - 100) - ((tinggi - 100) * 10 / 100));  
        } else {  
            hasil = (int) ((tinggi - 100) - ((tinggi - 100) * 15 / 100));  
        }  
        return hasil;  
    }  

    @Override  
    public void hasil() {  
        System.out.println("Berat badan ideal kamu yaitu: " + hasil + " kg");  
    }  
}  

public class tugas12 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("*** Ideal kah kamu?... yuk nimbang dulu... ***");  
        System.out.println("Pilih : 1. Timbangan Digital  2. Timbangan Anal0g");  
        int pilihan = scanner.nextInt();  

        System.out.print("Masukkan jenis kelamin kamu (1: Laki-laki, 2: Perempuan): ");  
        int jenisKelamin = scanner.nextInt();  
        System.out.print("Masukkan berat badan kamu (kg): ");  
        double berat = scanner.nextDouble();  
        System.out.print("Masukkan tinggi badan kamu (cm): ");  
        double tinggi = scanner.nextDouble();  

        if (pilihan == 1) {  
            TimbanganDigital timbanganDigital = new TimbanganDigital();  
            timbanganDigital.hitung(berat, tinggi, jenisKelamin);  
            System.out.println("--- Hasil Timbangan Digital ---");  
            timbanganDigital.hasil();  
        } else if (pilihan == 2) {  
            TimbanganAnalog timbanganAnalog = new TimbanganAnalog();  
            timbanganAnalog.hitung((int) berat, (int) tinggi, jenisKelamin);  
            System.out.println("--- Hasil Timbangan Analog ---");  
            timbanganAnalog.hasil();  
        }  

        scanner.close();  
    }  
}