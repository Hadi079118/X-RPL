import java.util.Scanner;

public class operatorstring5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] array = new String[n];

        System.out.println("Masukkan elemen array (biarkan kosong untuk elemen yang tidak terisi):");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        System.out.println("\n--- Hasil Merapikan Kalimat ---");
        for (int i = 0; i < array.length; i++) {
            String elemen = array[i].trim(); 
            if (elemen.isEmpty()) {
                elemen = "-"; 
            }
            System.out.println("Elemen ke-" + (i + 1) + ": " + elemen);
        }
    }
}
