public class Barang {
    // Variabel instance untuk menyimpan nama barang dan jumlah stok
    private String nama;
    private int stok;

    // Konstruktor untuk menginisialisasi objek Barang dengan nama dan stok
    public Barang (String nama, int stok){
        this.nama = nama;
        this.stok = stok;
    }

    // Method setter untuk mengubah nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method getter untuk mengambil nama barang
    public String getNama() {
        return nama;
    }

    // Method setter untuk mengubah jumlah stok
    public void setStok(int stok) {
        this.stok = stok;
    }
    // Method getter untuk mengambil stok
    public int getStok() {
        return stok;
    }

}
