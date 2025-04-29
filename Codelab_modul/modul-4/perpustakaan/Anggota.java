package perpustakaan;

public class Anggota implements Peminjaman{

     String nama, idAnggota;
     String judulDipinjam;

    public Anggota(String nama, String idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;

    }

    public void displayInfo(){
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
    }
    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul: " + judul);
        judulDipinjam = judul;
    }

    public void pinjamBuku(String judul, int durasi){
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
        judulDipinjam = judul;
    }

    @Override
    public void kembalikanBuku() {
        System.out.println(nama + " mengembalikan buku berjudul: " + judulDipinjam);
    }
}