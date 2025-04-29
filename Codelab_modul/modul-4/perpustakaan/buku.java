package perpustakaan;

public abstract class buku {
    public String judul, penulis;

    public buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    public abstract void displayInfo();
}
