import java.util.Arrays;
import java.util.Random;  
import java.util.Scanner;  

public class tugas15 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Masukkan jumlah elemen dalam array: ");  
        int n = scanner.nextInt();  

        int[] dataArray = generateRandomArray(n);  
        System.out.println("Array yang dihasilkan: " + Arrays.toString(dataArray));  

        Arrays.sort(dataArray);  
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

    public static int[] generateRandomArray(int size) {  
        Random random = new Random();  
        int[] array = new int[size];  
        for (int i = 0; i < size; i++) {  
            array[i] = random.nextInt(100);  
        }  
        return array;  
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