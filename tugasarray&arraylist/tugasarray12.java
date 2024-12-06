public class tugasarray12 {
    public static void main(String[] args) {
        int[][] matriksA = {
            {4, 5},
            {3, 2}
        };

        int[][] matriksB = {
            {6, 2},
            {8, 4}
        };

        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("Hasil Matriks A + Matriks B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
