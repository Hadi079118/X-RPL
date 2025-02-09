import java.util.Scanner;  

public class tugas7 {  

    public static void selectionSort(int[] array) {  
        int length = array.length;  

        for (int i = 0; i < length - 1; i++) {  
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {  
                if (array[j] < array[minIndex]) {  
                    minIndex = j;  
                }  
            }  

            if (minIndex != i) {  
                int temp = array[i];  
                array[i] = array[minIndex];  
                array[minIndex] = temp;  
            }  
        }  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
 
        System.out.print("Masukkan jumlah data yang ingin diinput: ");  
        int jumlah = scanner.nextInt();  
 
        int[] array = new int[jumlah];  
 
        System.out.println("Masukkan " + jumlah + " angka:");  
        for (int i = 0; i < jumlah; i++) {  
            System.out.print("Angka ke-" + (i + 1) + ": ");  
            array[i] = scanner.nextInt();  
        }  
 
        selectionSort(array);  

        System.out.println("Data setelah diurutkan secara ascending:");  
        for (int value : array) {  
            System.out.print(value + " ");  
        }  
        System.out.println();  

        scanner.close();  
    }  
}