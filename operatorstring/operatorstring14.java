public class operatorstring14 {
    public static void main(String[] args) {
        String kalimat = "Aksara Jawa Hanacaraka Padajayanya";

        String hasil = kalimat.replaceAll("(?i)a", "o");

        System.out.println("Kalimat Asli: " + kalimat);
        System.out.println("Kalimat Setelah Diganti: " + hasil);
    }
}
