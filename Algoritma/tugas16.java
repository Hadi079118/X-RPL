import java.util.Arrays;  
import java.util.Scanner;  

public class tugas16{  
    public static void main(String[] args) {  
        int[] dataArray = {9, 6, 4, 3, 7, 1, 6, 10, 20, 61, 43, 80, 100, 54, 32, 36, 75, 81, 17, 19, 1020, 55, 57, 82, 84, 16, 21, 28, 99, 89, 87, 73, 74, 76, 78, 79, 83, 85};  
        Scanner scanner = new Scanner(System.in);  

        System.out.println("========== Sequential Search ==========");  
        System.out.println("Data array:");  
        System.out.println(Arrays.toString(dataArray));  
        
        System.out.print("Masukkan angka yang ingin dicari: ");  
        int keyToFind = scanner.nextInt();  

        long startTime = System.currentTimeMillis();  
        int indexSequential = sequentialSearch(dataArray, keyToFind);  
        long endTime = System.currentTimeMillis();  
        long durationSequential = endTime - startTime;  

        if (indexSequential != -1) {  
            System.out.println("Angka " + keyToFind + " ditemukan pada data ke-" + indexSequential);  
        } else {  
            System.out.println("Angka " + keyToFind + " tidak ditemukan dalam Sequential Search.");  
        }  
        System.out.println("Waktu eksekusi sequential search: " + durationSequential + " ms");  
        System.out.println("========================================");  

        System.out.println("========== Binary Search ============");  
        Arrays.sort(dataArray);  
        System.out.println("Data array setelah diurutkan:");  
        System.out.println(Arrays.toString(dataArray));  

        startTime = System.currentTimeMillis();  
        int indexBinary = binarySearch(dataArray, keyToFind);  
        endTime = System.currentTimeMillis();  
        long durationBinary = endTime - startTime;  

        if (indexBinary != -1) {  
            System.out.println("Angka " + keyToFind + " ditemukan pada index ke-" + indexBinary);  
        } else {  
            System.out.println("Angka " + keyToFind + " tidak ditemukan dalam Binary Search.");  
        }  
        System.out.println("Waktu eksekusi binary search: " + durationBinary + " ms");  
        System.out.println("========================================");  

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