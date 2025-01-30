import javax.swing.JOptionPane;

public class tugas5 {
    private int kesehatan;
    private int kekuatan;
    private int pengalaman;

    public tugas5() {
        this.kesehatan = 0;
        this.kekuatan = 0;
        this.pengalaman = 0;
    }

    public void makan() {
        kesehatan += 2;
        kekuatan += 3;
        pengalaman += 0;
    }

    public void berjalan() {
        kesehatan -= 1;
        kekuatan -= 1;
        pengalaman += 2;
    }

    public void bertarung() {
        kesehatan -= 2;
        kekuatan -= 3;
        pengalaman -= 3;
    }

    public void minum() {
        kesehatan += 1;
        kekuatan += 1;
        pengalaman -= 0;
    }

    public String status() {
        return "Kesehatan: " + kesehatan + "\nKekuatan: " + kekuatan + "\nPengalaman: " + pengalaman;
    }

    public static void main(String[] args) {
        tugas5 kuraKura = new tugas5();
        String[] options = {"Makan", "Minum", "Berjalan", "Bertarung", "Status", "Keluar"};

        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Pilih tindakan untuk Kura-kura:", "Game Tamagochi",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == -1 || choice == 5) {
                break; // keluar dari program
            }

            switch (choice) {
                case 0:
                    kuraKura.makan();
                    break;
                case 1:
                    kuraKura.minum();
                    break;
                case 2:
                    kuraKura.berjalan();
                    break;
                case 3:
                    kuraKura.bertarung();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, kuraKura.status(), "Status Kura-kura", JOptionPane.INFORMATION_MESSAGE);
                    continue;
            }

            JOptionPane.showMessageDialog(null, "Tindakan berhasil dilakukan!\n" + kuraKura.status(), "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}