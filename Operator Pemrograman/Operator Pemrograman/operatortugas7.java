public class operatortugas7 {
    public static void main(String[] args) {
        Boolean hasilperbandingan;
        int a = 10;
        int b = 15;

        System.out.println("Nilai A: " + a + "\nNilai b: " + b);

        //Membandingkan apakah nilai A sama dengan nilai B?
        hasilperbandingan = a == b;
        System.out.println("a == b ? " + hasilperbandingan);

        //Membandingkan apakah nilai A tidak sama dengan nilai B?
        hasilperbandingan = a != b;
        System.out.println("a != b ? " + hasilperbandingan);

        //Membandingkan apakah nilai A lebih besar dari nilai B?
        hasilperbandingan = a > b;
        System.out.println("a > b ? " + hasilperbandingan);

        //Membandingkan apakah nilai A lebih kecil dari nilai B?
        hasilperbandingan = a < b;
        System.out.println("a < b ? " + hasilperbandingan);

        //Membandingkan apakah nilai A lebih besar sama dengan nilai B?
        hasilperbandingan = a >= b;
        System.out.println("a >= b ? " + hasilperbandingan);

        //Membandingkan apakah nilai A lebih kecil sama dengan nilai B?
        hasilperbandingan = a <= b;
        System.out.println("a <= b ? " + hasilperbandingan);
       
    }
}
