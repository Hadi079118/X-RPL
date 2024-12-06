public class operatorstring16 {
    public static void main(String[] args) {
        String kalimat = "Siswa kelas industri sangat antusias untuk belajar di hari sabtu";

        int countS = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (c == 's' || c == 'S') {
                countS++;
            }
        }

        System.out.println("Kalimat: " + kalimat);
        System.out.println("Jumlah huruf 's' dan 'S': " + countS);
    }
}
