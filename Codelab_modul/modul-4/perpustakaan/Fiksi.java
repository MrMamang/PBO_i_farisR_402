package perpustakaan;

public class Fiksi extends buku{
    public Fiksi(String judul, String penulis){
        super(judul, penulis);
    }

    @Override
    public void displayInfo(){
        System.out.println("Buku Fiksi: " + judul + " oleh " + penulis + " (Genre: Dongeng)");
    }
}
