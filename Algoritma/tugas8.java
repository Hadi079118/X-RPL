import java.util.ArrayList;  
import java.util.Scanner;  

public class tugas8 {  
  
    public static void selectionSortDescending(ArrayList<Integer> list) {  
        int size = list.size();  
 
        for (int i = 0; i < size - 1; i++) {  
            int maxIndex = i;
  
            for (int j = i + 1; j < size; j++) {  
                if (list.get(j) > list.get(maxIndex)) {  
                    maxIndex = j;  
                }  
            }  
 
            if (maxIndex != i) {  
                int temp = list.get(i);  
                list.set(i, list.get(maxIndex));  
                list.set(maxIndex, temp);  
            }  
        }  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        ArrayList<Integer> list = new ArrayList<>();  
 
        System.out.print("Masukkan jumlah data yang ingin diinput: ");  
        int jumlah = scanner.nextInt();  


        System.out.println("Masukkan " + jumlah + " angka:");  
        for (int i = 0; i < jumlah; i++) {  
            System.out.print("Angka ke-" + (i + 1) + ": ");  
            list.add(scanner.nextInt());  
        }  
 
        selectionSortDescending(list);  
  
        System.out.println("Data setelah diurutkan secara descending:");  
        for (int value : list) {  
            System.out.print(value + " ");  
        }  
        System.out.println();  

        scanner.close();  
    }  
}