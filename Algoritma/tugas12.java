import java.util.Scanner;  

public class tugas12 {  
    public static void main(String[] args) {  
        int[] dataArray = {27, 80, 8, 46, 16, 0, 50};  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Masukkan angka yang ingin dicari: ");  
        int keyToFind = scanner.nextInt();  
        int resultIndex = sequentialSearch(dataArray, keyToFind);  

        if (resultIndex != -1) {  
            System.out.println("Angka " + keyToFind + " ditemukan di indeks: " + resultIndex);  
        } else {  
            System.out.println("Angka " + keyToFind + " tidak ditemukan dalam array.");  
        }  

        scanner.close();  
    }  

    public static int sequentialSearch(int[] array, int key) {  
        for (int i = 0; i < array.length; i++) {  
            if (array[i] == key) {  
                return i;  
            }  
        }  
        return -1;  
    }  
}