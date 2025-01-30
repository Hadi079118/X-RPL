public class tugas3 {

    public static void main(String[] args) {
        // Deklarasi array dua dimensi untuk menyimpan jawaban siswa
        String[][] jawabanSiswa = {
                {"A", "B", "A", "C", "C", "D", "D", "A", "B", "B"},
                {"D", "B", "C", "B", "C", "B", "C", "A", "C", "B"},
                {"A", "A", "A", "C", "C", "D", "D", "A", "C", "B"},
                {"B", "B", "A", "B", "C", "A", "D", "A", "B", "B"},
                {"A", "A", "A", "B", "C", "D", "C", "B", "A", "B"}
        };

        // Deklarasi array string untuk menyimpan kunci jawaban
        String[] kunciJawaban = {"B", "B", "A", "D", "C", "B", "D", "A", "B", "B"};

        // Looping untuk menilai jawaban setiap siswa
        for (int i = 0; i < jawabanSiswa.length; i++) {
            int nilai = 0;
            // Looping untuk menilai jawaban setiap pertanyaan
            for (int j = 0; j < jawabanSiswa[i].length; j++) {
                if (jawabanSiswa[i][j].equals(kunciJawaban[j])) {
                    nilai += 10;
                }
            }
            // Menampilkan hasil penilaian
            System.out.println("Siswa " + (i + 1) + ": Nilai = " + nilai);
            if (nilai >= 70) {
                System.out.println("Status: LULUS");
            } else {
                System.out.println("Status: GAGAL");
            }
        }
    }
}