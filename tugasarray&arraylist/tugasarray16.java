import java.util.ArrayList;

public class tugasarray16 {
      public static void main(String[] args) {
        // Membuat ArrayList dengan tipe data Object
        ArrayList<Object> dataSiswa = new ArrayList<>();

        // Menambahkan nama dan umur siswa
        dataSiswa.add("Alice");
        dataSiswa.add(16);
        dataSiswa.add("Bob");
        dataSiswa.add(15);
        dataSiswa.add("Charlie");
        dataSiswa.add(17);

        // Menampilkan output
        System.out.println("Data siswa di kelas:");
        for (int i = 0; i < dataSiswa.size(); i++) {
            // Mengecek apakah elemen bertipe String (nama)
            if (dataSiswa.get(i) instanceof String) {
                System.out.print("Nama: " + dataSiswa.get(i) + ", ");
            }
            // Mengecek apakah elemen bertipe Integer (umur)
            if (dataSiswa.get(i) instanceof Integer) {
                System.out.println("Umur: " + dataSiswa.get(i));
            }
        }
    }
}
