package perpustakaan;

public class nonFiksi extends buku{

    public nonFiksi(String judul, String penulis){
        super(judul, penulis);
    }

    @Override
    public void displayInfo(){
        System.out.println("Buku non-Fiksi: " + judul + " oleh " + penulis + " (Bidang : Sejarah & Ilmu Pengetahuan)");
    }
}
