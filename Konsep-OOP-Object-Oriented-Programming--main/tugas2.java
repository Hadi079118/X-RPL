class Mobil {
    private int kecepatan;
    private int roda;
    private String tipe;

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public int getRoda() {
        return roda;
    }

    public String getTipe() {
        return tipe;
    }
}

public class tugas2 {
    public static void main(String[] args) {
        // Membuat objek Mobil Avanza
        Mobil avanza = new Mobil();
        avanza.setKecepatan(270);
        avanza.setRoda(4);
        avanza.setTipe("CUV");

        // Mencetak informasi objek Mobil Avanza
        System.out.println("Kecepatan: " + avanza.getKecepatan() + " km/h");
        System.out.println("Roda: " + avanza.getRoda());
        System.out.println("Tipe: " + avanza.getTipe());
    }
}