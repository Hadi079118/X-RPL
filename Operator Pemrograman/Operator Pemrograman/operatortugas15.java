import java.util.Scanner;

public class  operatortugas15 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai a: ");
            int a = scanner.nextInt();

            System.out.print("Masukkan nilai b: ");
            int b = scanner.nextInt();

            int leftShift = a << 2;
            int rightShift = b >> 2;

            System.out.println("Left shift (a << 2): " + leftShift);
            System.out.println("Right shift (b >> 2): " + rightShift);
        }
    }
}
