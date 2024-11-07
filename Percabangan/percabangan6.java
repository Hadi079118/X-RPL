import java.util.Scanner;

public class percabangan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor :");
        String kodePlatNomor = scanner.nextLine().toUpperCase();
        String namaKota;

        switch (kodePlatNomor) {
            case "N":
            namaKota = "malang";
            break;

            case "B":
            namaKota = "bogor";
            break;

            case "J":
            namaKota = "jakarta";
            break;
            
            case "S":
            namaKota = "surabaya";
            break;

            case "P":
            namaKota ="Jember,  Banyuwangi, Bondowoso, Situbondo";
            break;

            case "Y":
            namaKota = "Yogyakarta";
            break;
            default:
                namaKota = "Kode plat tidak valid. Harap masukkan  kode plat yang benar.";
                }
            
            System.out.println("Kota :  " + namaKota);
            scanner.close();


        

        }

      
    }
