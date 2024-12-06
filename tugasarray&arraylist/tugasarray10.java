public class tugasarray10 {
    public static void main(String[] args) {
        String[] nama = {"Kenzo Ismail", "Desmon Daffa", "Kayla Isabela", "Khansa Zakira"};
        int[][] nilai = {
            {81, 90, 62}, 
            {60, 82, 87}, 
            {89, 59, 65},
            {77, 75, 60}  
        };    
        System.out.println("No.\tNama\t\tRata-rata");
        for (int i = 0; i < nama.length; i++) {
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            double rataRata = total / (double) nilai[i].length;
            System.out.printf("%d.\t%s\t%.2f\n", (i + 1), nama[i], rataRata);
        }
    }
}
