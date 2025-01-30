class Karyawan {  
    private String nama;  
    private double gaji;  
    protected final double persenNaikGaji = 0.10; 

    public Karyawan(String nama, double gaji) {  
        this.nama = nama;  
        this.gaji = gaji;  
    }  

    public String getNama() {  
        return nama;  
    }  

    public void setNama(String nama) {  
        this.nama = nama;  
    }  

    public double getGaji() {  
        return gaji;  
    }  

    public void setGaji(double gaji) {  
        this.gaji = gaji;  
    }  

    public double getPersen() {  
        return persenNaikGaji;  
    }  

    public void naikkanGaji() {  
        gaji += (gaji * persenNaikGaji);  
    }  
}  

class Manager extends Karyawan {  
    private double bonus;  

    public Manager(String nama, double gaji) {  
        super(nama, gaji);  
    }  

    public void setBonus(double bonus) {  
        this.bonus = bonus;  
    }  

    public double getBonus() {  
        return bonus;  
    }  

    @Override  
    public double getGaji() {  
        return super.getGaji() + bonus; 
    }  

    public double getGajiAkhir() {  
        return getGaji(); 
    }  
}  

public class tugas11 {  
    public static void main(String[] args) {  
        Karyawan karyawan1 = new Karyawan("Arya", 5000000);  
        System.out.println("Nama: " + karyawan1.getNama());  
        System.out.println("Gaji Sebelum Naik: " + karyawan1.getGaji());  
        karyawan1.naikkanGaji();  
        System.out.println("Gaji Setelah Naik: " + karyawan1.getGaji());  

        Manager manager1 = new Manager("Reyes", 8000000);  
        manager1.setBonus(2000000); 
        System.out.println("\nNama: " + manager1.getNama());  
        System.out.println("Gaji Sebelum Naik: " + manager1.getGaji());  
        manager1.naikkanGaji();  
        System.out.println("Gaji Setelah Naik: " + manager1.getGajiAkhir());  
    }  
}