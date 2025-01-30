import java.util.Scanner;  

abstract class Binatang {  
    String nama;  
    String info;  

    Binatang(String nama, String info) {  
        this.nama = nama;  
        this.info = info;  
    }  

    abstract String getInfo();  
}  

class Gajah extends Binatang {  
    Gajah() {  
        super("Gajah", "--- info gajah madagaskar --- \nmakan rumput\nberkembang biak dengan beranak\nhidup di darat\ntermasuk binatang herbivora");  
    }  

    @Override  
    String getInfo() {  
        return info;  
    }  
}  

class Kelinci extends Binatang {  
    Kelinci() {  
        super("Kelinci", "--- info kelinci --- \nmakan sayuran\nberkembang biak dengan beranak\nhidup di darat\ntermasuk binatang herbivora");  
    }  

    @Override  
    String getInfo() {  
        return info;  
    }  
}  

class Burung extends Binatang {  
    Burung() {  
        super("Burung", "--- info burung --- \nmakan biji-bijian\nberkembang biak dengan bertelur\nhidup di udara\ntermasuk binatang omnivora");  
    }  

    @Override  
    String getInfo() {  
        return info;  
    }  
}  

class Kucing extends Binatang {  
    Kucing() {  
        super("Kucing", "--- info kucing --- \nmakan daging\nberkembang biak dengan beranak\nhidup di darat\ntermasuk binatang karnivora");  
    }  

    @Override  
    String getInfo() {  
        return info;  
    }  
}  

public class tugas13 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.println("*** Kebon Binatang Surabaya ***");  
        System.out.println("1. Gajah");  
        System.out.println("2. Kelinci");  
        System.out.println("3. Burung");  
        System.out.println("4. Kucing");  
        System.out.println("5. Keluar");  
        System.out.print("Masukkan pilihan : ");  
        
        int pilihan = scanner.nextInt();  

        Binatang binatang = null;  

        switch (pilihan) {  
            case 1:  
                binatang = new Gajah();  
                break;  
            case 2:  
                binatang = new Kelinci();  
                break;  
            case 3:  
                binatang = new Burung();  
                break;  
            case 4:  
                binatang = new Kucing();  
                break;  
            case 5:  
                System.out.println("Terima kasih! Sampai jumpa.");  
                return;  
            default:  
                System.out.println("Pilihan tidak valid.");  
                return;  
        }  

        if (binatang != null) {  
            System.out.println(binatang.getInfo());  
        }  

        System.out.println("--------------------------------");  
        
        scanner.close();  
    }  
}