import java.util.Scanner;

public class operatorstring3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah isi array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] array = new String[n];

        System.out.println("Masukkan isi array (biarkan kosong untuk isi yang tidak terisi):");
        for (int i = 0; i < n; i++) {
            System.out.print("Isi ke-" + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        System.out.println("\n--- Status Isi Array ---");
        for (int i = 0; i < array.length; i++) {
            if (array[i].trim().isEmpty()) {
                System.out.println("Isi ke-" + (i + 1) + ": Kosong");
            } else {
                System.out.println("Isi ke-" + (i + 1) + ": Terisi (" + array[i] + ")");
            }
        }
    }
}
