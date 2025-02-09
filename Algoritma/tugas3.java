import java.util.Scanner;  

public class tugas3 {  
     
    public static int fibonacci(int n) {   
        if (n <= 1) {  
            return n;  
        }   
        return fibonacci(n - 1) + fibonacci(n - 2);  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah deret Fibonacci yang diinginkan: ");  
        int jumlah = scanner.nextInt();  

        System.out.println("Deret Fibonacci:");  
        for (int i = 0; i < jumlah; i++) {  
            System.out.print(fibonacci(i) + " ");  
        }  
        System.out.println();  

        scanner.close();  
    }  
}