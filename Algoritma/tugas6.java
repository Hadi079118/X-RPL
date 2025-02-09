public class tugas6 {  
 
    public static void selectionSortModified(int[] array) {  
        int length = array.length;  
  
        for (int i = 0; i < length / 2; i++) {  
            int maxIndex = i; 
            int minIndex = length - 1 - i;  

            for (int j = i; j < length - i; j++) {  
                if (array[j] > array[maxIndex]) {  
                    maxIndex = j;  
                }  
            }  
  
            for (int j = i; j < length - i; j++) {  
                if (array[j] < array[minIndex]) {  
                    minIndex = j;  
                }  
            }  

            if (maxIndex != i) {  
                int temp = array[i];  
                array[i] = array[maxIndex];  
                array[maxIndex] = temp;  
            }  
 
            if (minIndex == i) {  
                minIndex = maxIndex;  
            }  
 
            if (minIndex != length - 1 - i) {  
                int temp = array[length - 1 - i];  
                array[length - 1 - i] = array[minIndex];  
                array[minIndex] = temp;  
            }  
        }  
    }  

    public static void main(String[] args) {   
        int[] array = {27, 80, 8, 46, 16, 12, 50};  

        selectionSortModified(array);  
 
        System.out.println("Data setelah diurutkan:");  
        for (int value : array) {  
            System.out.print(value + " ");  
        }  
    }  
}