import java.util.Scanner;  

public class tugas11 {  
    public static void main(String[] args) {  
        String[] namaSiswa = {"Misbahul", "Andre", "Ivan", "Andika", "Riyan", "Afrizal"};  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Masukkan nama siswa yang ingin dicari: ");  
        String keyToFind = scanner.nextLine();  
        boolean found = false;  

        for (int i = 0; i < namaSiswa.length; i++) {  
            if (namaSiswa[i].equalsIgnoreCase(keyToFind)) {  
                found = true;  
                System.out.println("Nama " + keyToFind + " ditemukan di indeks: " + i);  
                break;  
            }  
        }  

        if (!found) {  
            System.out.println("Nama " + keyToFind + " tidak ditemukan dalam daftar.");  
        }  

        scanner.close();  
    }  
}