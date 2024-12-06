    import java.util.Scanner;

    public class tugasperulangan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu 1-3: ");
            choice = scanner.nextInt(); 

            if (choice == 1) {
                System.out.println("Anda memilih menu PENJUMLAHAN.\n");
            } else if (choice == 2) {
                System.out.println("Anda memilih menu PENGURANGAN.\n");
            } else if (choice == 3) {
                System.out.println("Program berhenti!");
                break; 
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
            }
        }

        scanner.close(); 
    }
}