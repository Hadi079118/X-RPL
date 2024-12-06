public class tugasarray7 {
    public static void main(String[] args) {
        String[][] handphone = {
            {"1", "Xiaomi", "Poco M3", "1850000"},
            {"2", "Oppo", "Reno 6", "4299000"},
            {"3", "Vivo", "Y2", "1635000"},
            {"4", "Oppo", "A15", "1618500"},
            {"5", "Samsung", "Galaxy A12", "1990000"}
        };

        System.out.printf("%-4s %-10s %-15s %-10s%n", "No.", "Merk", "Tipe", "Harga");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < handphone.length; i++) {
            System.out.printf("%-4s %-10s %-15s Rp%-10s%n",
                handphone[i][0], handphone[i][1], handphone[i][2], handphone[i][3]);
        }
    }
}
