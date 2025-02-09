import java.util.Scanner;  

public class tugas13 {  
    public static void main(String[] args) {  
        String[] dataArray = {"Agung", "Putu", "Fairuz", "RyanArmando", "Ganjar", "Anies"};  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Masukkan nama yang ingin dicari: ");  
        String keyToFind = scanner.nextLine();  
        int resultIndex = sequentialSearch(dataArray, keyToFind);  

        if (resultIndex != -1) {  
            System.out.println("Nama " + keyToFind + " ditemukan di indeks: " + resultIndex);  
        } else {  
            System.out.println("Nama " + keyToFind + " tidak ditemukan dalam array.");  
        }  

        scanner.close();  
    }  

    public static int sequentialSearch(String[] array, String key) {  
        for (int i = 0; i < array.length; i++) {  
            if (array[i].equalsIgnoreCase(key)) {  
                return i;  
            }  
        }  
        return -1;  
    }  
}