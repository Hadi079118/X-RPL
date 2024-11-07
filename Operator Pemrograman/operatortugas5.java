import javax.swing.JOptionPane;

public class operatortugas5 {
    public static void main(String[] args) {
        int sirup = 5;
        int deterjen = 6;
        int mieinstan = 10;

        System.out.println("Jumlah Barang Awal:");
        System.out.println("Sirup: " + sirup + "  botol");
        System.out.println("Deterjen: " + deterjen + " bungkus");
        System.out.println("Mie Instan: " + mieinstan + " bungkus");

        int tambahSirup = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah sirup yang ditambahkan:"));
        int tambahDeterjen = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah deterjen yang ditambahkan:"));
        int tambahMieinstan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah mie instan yang ditambahkan:"));
        
        sirup += tambahSirup;
        deterjen += tambahDeterjen;
        mieinstan += tambahMieinstan;
        
        System.out.println("\nJumlah Barang Setelah Ditambahkan:");
        System.out.println("Sirup: " + sirup + "botol");
        System.out.println("Deterjen: " + deterjen + "bungkus");
        System.out.println("Mie Instan: " + mieinstan + "bungkus");
    






         

    }
}
    