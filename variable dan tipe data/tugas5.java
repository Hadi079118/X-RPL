public class tugas5 {
    // Sebagai konstanta      : nama toko dan harga pokok
    //Sebagai variabel         : 
    //Harga promo (harga pokok dikurangi 10.000) 
    //Harga reseller (harga pokok dikurangi 20.000) 

    public static void main(String[] args) {
        final String NAMATOKO = "bakso GOMORAX";
        final int HARGAPOKOK = 32_000;
        int potonganHarga = 10_000;
        int potonganReseller = 20_000;
        
        int hargaPromo = HARGAPOKOK - potonganHarga;
        int hargaReseller = HARGAPOKOK - potonganReseller;

        System.err.println("Nama Toko : " + NAMATOKO);
        System.err.println("Harga Bakso : " + HARGAPOKOK);
        System.err.println("Harga Promo : " + hargaPromo);
        System.err.println("Harga Reseller : " + hargaReseller);
    }
}
