import java.util.Scanner;  

public class tugas9 {  
 
    public static int sequentialSearch(int[] array, int key) {  
        for (int i = 0; i < array.length; i++) {  
            if (array[i] == key) {  
                return i;
            }  
        }  
        return -1;  
    }  

    public static void main(String[] args) {   
        int[] array = {5, 6, 9, 2, 8, 1, 7};  

        Scanner scanner = new Scanner(System.in);  
        System.out.print("Masukkan nilai yang ingin dicari: ");  
        int key = scanner.nextInt();  
  
        int result = sequentialSearch(array, key);  

        if (result != -1) {  
            System.out.println("Nilai " + key + " ditemukan pada index: " + result);  
        } else {  
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");  
        }  

        scanner.close();  
    }  
}