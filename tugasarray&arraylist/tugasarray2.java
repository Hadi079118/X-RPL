import javax.swing.JOptionPane;

public class tugasarray2 {
    public static void main(String[] args) {
        String[] namaSiswa = new String[5];

        for (int i = 0; i < namaSiswa.length; i++) {
            namaSiswa[i] = JOptionPane.showInputDialog(null, 
                "Masukkan nama siswa ke-" + (i + 1) + ":", 
                "Input Nama Siswa", JOptionPane.QUESTION_MESSAGE);
        }

        StringBuilder hasil = new StringBuilder("Nama-nama siswa:\n");
        for (int i = 0; i < namaSiswa.length; i++) {
            hasil.append((i + 1)).append(". ").append(namaSiswa[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, hasil.toString(), 
            "Daftar Nama Siswa", JOptionPane.INFORMATION_MESSAGE);
    }  
}
