public class operatorstring12 {
    public static void main(String[] args) {
        String kalimat = "saya belajar pemrograman java bersama hummasoft di kelas industri";

        String[] kataArray = kalimat.split(" ");
        int jumlahKata = kataArray.length;
        int jumlahKarakter = kalimat.replace(" ", "").length();

        System.out.println("Kalimat: " + kalimat);
        System.out.println("Jumlah kata: " + jumlahKata);
        System.out.println("Jumlah karakter (tanpa spasi): " + jumlahKarakter);
    }  
}
