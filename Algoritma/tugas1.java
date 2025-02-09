import java.util.Scanner;  

public class tugas1 {  

    public static int hitungPangkat(int basis, int eksponen) {  
        if (eksponen == 0) {  
            return 1;  
        }  
        else if (eksponen < 0) {  
            return 1 / hitungPangkat(basis, -eksponen);  
        }  
        return basis * hitungPangkat(basis, eksponen - 1);  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan angka (basis): ");  
        int basis = scanner.nextInt();  

        System.out.print("Masukkan pangkat (eksponen): ");  
        int eksponen = scanner.nextInt();  

        int hasil = hitungPangkat(basis, eksponen);  

        System.out.printf("%d^%d = %d\n", basis, eksponen, hasil);  

        scanner.close();  
    }  
}