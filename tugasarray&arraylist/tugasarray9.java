public class tugasarray9 {
    public static void main(String[] args) {
        int[][] angka = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        System.out.println("Total penjumlahan untuk setiap baris:");
        for (int i = 0; i < angka.length; i++) {
            int total = 0; 
            for (int j = 0; j < angka[i].length; j++) {
                total += angka[i][j];
            }
            System.out.println("Baris " + (i + 1) + ": " + total);
        }
    }
}
