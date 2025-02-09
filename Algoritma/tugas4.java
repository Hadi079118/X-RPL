import java.util.Scanner;  

public class tugas4 {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah deret yang diinginkan: ");  
        int jumlah = scanner.nextInt();  
 
        int[] deret = new int[jumlah];  
 
        deret[0] = 3;   
        if (jumlah > 1) {  
            deret[1] = 5;  
        }  
  
        for (int i = 2; i < jumlah; i++) {  
            deret[i] = deret[i - 1] + (i + 1);
        }  

        System.out.println("Deret Angka:");  
        for (int i = 0; i < jumlah; i++) {  
            System.out.print(deret[i] + " ");  
        }  
        System.out.println();  

        scanner.close();  
    }  
}