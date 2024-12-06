public class tugas5perulangan {
    public static void main(String[] args) {
        System.out.println("Deret Bilangan Ganjil antara 1 s/d 100:");
        
        // Loop untuk menampilkan bilangan ganjil
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // Mengecek apakah i adalah bilangan ganjil
                System.out.print(i + " ");
            }
        }
    }
}
