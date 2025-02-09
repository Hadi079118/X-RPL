import java.util.Scanner;  

public class tugas2 {  

    // Metode rekursif untuk menghitung faktorial  
    public static long hitungFaktorial(int n) {   
        if (n == 0) {  
            return 1;  
        }   
        return n * hitungFaktorial(n - 1);  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan angka untuk dihitung faktorialnya: ");  
        int angka = scanner.nextInt();  

        if (angka < 0) {  
            System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");  
        } else {  
            long hasil = hitungFaktorial(angka);  
            System.out.printf("Faktorial dari %d adalah %d\n", angka, hasil);  
        }  

        scanner.close();  
    }  
}