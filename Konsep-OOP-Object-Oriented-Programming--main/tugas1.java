public class tugas1 {
    private int id;
    private String judul;
    private int jumlah;

    public tugas1(int id, String judul, int jumlah) {
        this.id = id;
        this.judul = judul;
        this.jumlah = jumlah;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int  getId() {
        return id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getJumlah() {
        return jumlah;
    }

   
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Judul: " + getJudul());
        System.out.println("Jumlah: " + getJumlah());
    }

    public static void main(String[] args) {
        tugas1 buku = new tugas1(101, "Habis Gelap Terbitlah Terang", 10);

        buku.displayInfo();
    }
}