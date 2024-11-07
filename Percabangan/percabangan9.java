import java.util.Scanner;

public class percabangan9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPilihan Menu:");
            System.out.println("1. Penentuan Angka Terbesar");
            System.out.println("2. Penentuan Angka Ganjil dan Genap");
            System.out.println("3. Exit Program");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    penentuanAngkaTerbesar();
                    break;
                case 2:
                    penentuanAngkaGanjilGenap();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void penentuanAngkaTerbesar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int num1 = scanner.nextInt();   
        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int num3 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Angka terbesar adalah: " + max);
    }

    public static void penentuanAngkaGanjilGenap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Angka " + num + " adalah genap.");
        } else {
            System.out.println("Angka " + num + " adalah ganjil.");
        }
    }
}