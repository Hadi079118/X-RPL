import javax.swing.*;
public class tugas10 {
    public static void main(String[] args) {
        Guru guru = new Guru();
        guru.inputDataGuru();
        guru.info();

        Siswa siswa = new Siswa();
        siswa.inputDataSiswa();
        siswa.info();
    }
}
class Sekolah {
    private String nama;
    public Sekolah() {
    }
    public Sekolah(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void info() {
        JOptionPane.showMessageDialog(null, "Nama Sekolah: " + nama);
    }
}
class Guru extends Sekolah {
    private int nip;
    private String mapel;
    public Guru() {
    }
    public Guru(int nip, String nama, String mapel) {
        super(nama);
        this.nip = nip;
        this.mapel = mapel;
    }
    public int getNip() {
        return nip;
    }
    public void setNip(int nip) {
        this.nip = nip;
    }
    public String getMapel() {
        return mapel;
    }
    public void setMapel(String mapel) {
        this.mapel = mapel;
    }
    public void inputDataGuru() {
        nip = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIP: "));
        setNama(JOptionPane.showInputDialog("Masukkan nama: "));
        mapel = JOptionPane.showInputDialog("Masukkan mata pelajaran: ");
    }
    @Override
    public void info() {
        JOptionPane.showMessageDialog(null, "NIP: " + nip + "\nNama: " + getNama() + "\nMata Pelajaran: " + mapel);
    }
}
class Siswa extends Sekolah {
    private int nis;
    private int uts;
    private int uas;
    private double nilaiAkhir;
    public Siswa() {
    }
    public Siswa(int nis, String nama, int uts, int uas) {
        super(nama);
        this.nis = nis;
        this.uts = uts;
        this.uas = uas;
        this.nilaiAkhir = (uts + uas) / 2.0;
    }
    public int getNis() {
        return nis;
    }
    public void setNis(int nis) {
        this.nis = nis;
    }
    public int getUts() {
        return uts;
    }
    public void setUts(int uts) {
        this.uts = uts;
    }
    public int getUas() {
        return uas;
    }
    public void setUas(int uas) {
        this.uas = uas;
    }
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
    public void inputDataSiswa() {
        nis = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIS: "));
        setNama(JOptionPane.showInputDialog("Masukkan nama: "));
        uts = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai UTS: "));
        uas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai UAS: "));
        nilaiAkhir = (uts + uas) / 2.0;
    }
    @Override
    public void info() {
        JOptionPane.showMessageDialog(null, "NIS: " + nis + "\nNama: " + getNama() + "\nNilai Akhir: " + nilaiAkhir);
    }
}