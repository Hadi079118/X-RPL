public class tugasarray8 {
    public static void main(String[] args) {
        String[][] nama = {
            {"Sugito", "Prayoga"},
            {"Samirul", "Hilmi"},
            {"leo", "Hermawan"},
            {"Triawan", "Angga"}
        };

        System.out.println("Data Nama:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i][0] + " " + nama[i][1]);
        }
    }
}
