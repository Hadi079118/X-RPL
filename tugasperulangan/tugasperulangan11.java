import java.util.Scanner;

public class tugasperulangan11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int panjangDeret;

        System.out.print("Tentukan panjang deret: ");
        panjangDeret = scanner.nextInt();

        System.out.print("Bilangan GANJIL: ");
        int i = 1, countGanjil = 0; 
        do {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
                countGanjil++;
            }
            i++;
        } while (countGanjil < panjangDeret / 2);
        System.out.println();

        System.out.print("Bilangan GENAP: ");
        int j = 1, countGenap = 0; 
        do {
            if (j % 2 == 0) { 
                System.out.print(j + " ");
                countGenap++;
            }
            j++;
        } while (countGenap < panjangDeret / 2);
        System.out.println();

        scanner.close();
    }
}
