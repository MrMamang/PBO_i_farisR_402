import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ManajemenStock {
    public static void main(String[] args){
        // Membuat daftar untuk menyimpan objek barang
        ArrayList<Barang>daftarBarang = new ArrayList<>();
        // Menambahkan barang awal
      Barang barang = new Barang("garam", 20);

        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        // Loop utama aplika
        while(ulang) {
            //menampilkan menu awal
            System.out.println("===== Menu Manajemen stock ====");
            System.out.println("1. Tambahkan barang baru");
            System.out.println("2. Tampilkan semua barang");
            System.out.println("3. Kurangi stock barang");
            System.out.println("0. keluar");
            System.out.print("Pilih Opsi: ");
            int pilih;
            //menghindari salah input selain angka
            try {
                pilih = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("input harus berupa angka");
                input.nextLine();
                continue;
            }
            input.nextLine();


            switch (pilih) {
                case 1:
                    //menambahkan barang baru
                    System.out.println("Masukkan nama barang: ");
                    String nama = input.nextLine();
                    System.out.println("masukna stock awal: ");
                    try {
                        int stok = input.nextInt();
                        if (stok < 0) {
                            System.out.println("input stok tidak boleh angka negatif");
                        } else {
                            daftarBarang.add(barang);
                            System.out.println("barang berhasil ditambahkan");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("input stock harus berupa angka");
                        input.nextLine();
                    }
                    break;
                case 2:
                    int index = 0;
                    //menampilkan semua barang
                    if (daftarBarang.isEmpty()) {
                        System.out.println("baragn tidak tersedia");
                    } else {
                        for (Barang barang1 : daftarBarang) {
                            System.out.println(index + ". Nama barang: " + barang.getNama() + "\t jumlah stok: " + barang.getStok());
                            index++;
                        }
                    }
                    break;

                case 3:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("baragn tidak ada");
                    } else {
                        for (int i = 0; i < daftarBarang.size(); i++) {
                            Barang barang1 = daftarBarang.get(i);
                            System.out.println(i + ". " + barang.getNama() + " Stock: " + barang.getStok());
                        }
                    }
                    try {
                        System.out.println("masukkan no indeks barang: ");
                        int indeks = input.nextInt();
                        Barang pilihBarang = daftarBarang.get(indeks);
                        System.out.println("masukkan jumlah stok yagn ingin diambil: ");
                        int ambilStock = input.nextInt();

                        if (ambilStock < 0) {
                            System.out.println("stok tidak mencukupi");
                            break;
                        }
                        if (ambilStock > pilihBarang.getStok()) {
                            throw new StockTidakCukupException("Stok untuk barang " + pilihBarang.getNama() + " tersisa " + pilihBarang.getStok());
                        }
                        //kurangin stok
                        pilihBarang.setStok(pilihBarang.getStok() - ambilStock);
                        System.out.println("stok barang " + pilihBarang.getNama() + "berhasil dikurangi.");
                        System.out.println("stok tersisa: " + pilihBarang.getStok());

                    } catch (InputMismatchException e) {
                        System.err.println("input indeks harus berupa angka");
                        input.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("indek barang tidak valid");
                    } catch (StockTidakCukupException e) {
                        System.out.println("eror " + e.getMessage());
                    }
                    break;

                case 0:
                    //keluar program
                    System.out.println("terimakasih sudah meemakai aplkikasi indo jaya");
                    ulang = false;
                    break;

                default:
                    System.out.println("pilihana tidak valid");
            }

        }
        input.close();
    }
}