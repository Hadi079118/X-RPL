import java.util.Arrays;  
import java.util.Scanner;  

public class tugas14 {  
    public static void main(String[] args) {  
        int[] dataArray = {85, 30, 55, 80, 100, 65, 35, 20, 70, 65, 10, 40, 82, 90};  
        Arrays.sort(dataArray);  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Masukkan angka yang ingin dicari: ");  
        int keyToFind = scanner.nextInt();  
        int resultIndex = binarySearch(dataArray, keyToFind);  

        if (resultIndex != -1) {  
            System.out.println("Angka " + keyToFind + " ditemukan di indeks: " + resultIndex);  
        } else {  
            System.out.println("Angka " + keyToFind + " tidak ditemukan dalam array.");  
        }  

        scanner.close();  
    }  

    public static int binarySearch(int[] array, int key) {  
        int left = 0;  
        int right = array.length - 1;  

        while (left <= right) {  
            int mid = left + (right - left) / 2;  

            if (array[mid] == key) {  
                return mid;  
            }  
            if (array[mid] < key) {  
                left = mid + 1;  
            } else {  
                right = mid - 1;  
            }  
        }  
        return -1;  
    }  
}