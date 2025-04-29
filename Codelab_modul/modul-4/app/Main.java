package app;
import perpustakaan.*;

public class Main {
    public static void main(String[] args){

        nonFiksi nonfiksi = new nonFiksi("Madilog", "Tan Malaka");
        Fiksi fiksi = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu");

        Anggota anggota = new Anggota("Faris Ramadhan Riyanto", "I402");
        Anggota anggota1 = new Anggota("Lalu Irgi Nabil Farhan ", "I404");

        nonfiksi.displayInfo();
        fiksi.displayInfo();
        System.out.println();

        anggota.displayInfo();
        anggota1.displayInfo();
        System.out.println();

        anggota.pinjamBuku(nonfiksi.judul);
        anggota1.pinjamBuku(fiksi.judul,7);
        System.out.println();

        anggota.kembalikanBuku();
        anggota1.kembalikanBuku();

    }
}
