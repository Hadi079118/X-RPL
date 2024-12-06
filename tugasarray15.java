import java.util.ArrayList;
import java.util.Arrays;

public class tugasarray15 {
     public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Elemen ArrayList:");
        for (int num : angka) {
            System.out.println(num);
        }
    }
}
