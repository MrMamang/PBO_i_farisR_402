public class Barang {
    private String nama;
    private int stok;

    public Barang (String nama, int stok){
        this.nama = nama;
        this.stok = stok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getStok() {
        return stok;
    }

}
