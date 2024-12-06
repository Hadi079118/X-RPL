import java.util.Scanner;

public class tugasperulangan10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) { 
            System.out.print("Apakah Anda ingin berhenti? (ketik 'ya' untuk berhenti): ");
            userInput = scanner.nextLine().trim().toLowerCase(); 

            if (userInput.equals("ya")) {
                System.out.println("Program berhenti.");
                break; 
            } else {
                System.out.println("Program terus berjalan...\n");
            }
        }

        scanner.close(); 
}
}
