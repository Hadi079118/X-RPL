import java.util.Scanner;  

public class tugas10 {  
    public static void main(String[] args) {  
        int[] dataArray = {27, 80, 8, 46, 16, 12, 50};  

        Scanner scanner = new Scanner(System.in);  
        System.out.print("Masukkan nilai yang ingin dicari: ");  
        int keyToFind = scanner.nextInt();  

        boolean found = false; 

        for (int i = 0; i < dataArray.length; i++) {  
            if (dataArray[i] == keyToFind) {  
                found = true; 
                System.out.println("Key " + keyToFind + " ditemukan di indeks: " + i);  
                break; 
            }  
        }  

        if (!found) {  
            System.out.println("Key " + keyToFind + " tidak ditemukan di dalam array.");  
        }  
 
        scanner.close();  
    }  
}