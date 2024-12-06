public class operatorstring15 {
    public static void main(String[] args) {
        String kalimat = "HUMMASOFT TECHNOLOGY";
        String hasil = toProperCase(kalimat);

        System.out.println("Kalimat Asli: " + kalimat);
        System.out.println("Kalimat Setelah Diubah: " + hasil);
    }

    public static String toProperCase(String str) {
        String[] kataArray = str.split(" ");
        StringBuilder properCaseString = new StringBuilder();

        for (String kata : kataArray) {
            String properKata = kata.substring(0, 1).toUpperCase() + kata.substring(1).toLowerCase();
            properCaseString.append(properKata).append(" ");
        }

        return properCaseString.toString().trim();
    }
}

