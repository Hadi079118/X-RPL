import java.io.*;

public class operatortugas2 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai a: ");
        int A = Integer.parseInt(input.readLine());

        System.out.print("Masukkan nilai b: ");
        int B = Integer.parseInt(input.readLine());

        System.out.print("Masukkan nilai c: ");
        int C = Integer.parseInt(input.readLine());

        int hasil = A * B + C;
        System.out.println("-------Hasil-------");
        System.out.println("Hasil : " + hasil);
    }
}       