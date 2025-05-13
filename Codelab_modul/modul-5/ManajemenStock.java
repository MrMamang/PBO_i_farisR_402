import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ManajemenStock {
    public static void main(String[] args){
        ArrayList<Barang>daftarBarang = new ArrayList<>();
        daftarBarang.add(new Barang("garam", 10));

        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        while(ulang) {
            System.out.println("===== Menu Manajemen stock ====");
            System.out.println("1. Tambahkan barang baru");
            System.out.println("2. Tampilkan semua barang");
            System.out.println("3. Kurangi stock barang");
            System.out.println("0. keluar");
            int pilih;
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
                    System.out.println("Masukkan nama barang: ");
                    String nama = input.nextLine();
                    System.out.println("masukna stock awal: ");
                    try {
                        int stok = input.nextInt();
                        if (stok < 0) {
                            System.out.println("input stok tidak boleh angka negatif");
                        } else {
                            daftarBarang.add(new Barang(nama, stok));
                            System.out.println("barang berhasil ditambahkan");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("input stock harus berupa angka");
                        input.nextLine();
                    }
                    break;
                case 2:
                    int index = 0;
                    if (daftarBarang.isEmpty()) {
                        System.out.println("baragn tidak tersedia");
                    } else {
                        for (Barang barang : daftarBarang) {
                            System.out.println(index + ". Nama barang: " + barang.getNama() + " jumlah stok: " + barang.getStok());
                            index++;

                        }
                    }
                    break;

                case 3:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("baragn tidak ada");
                    } else {
                        for (int i = 0; i < daftarBarang.size(); i++) {
                            Barang barang = daftarBarang.get(i);
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
                            System.out.println("ambilnyha jagnan negatif ya");
                            break;
                        }
                        if (ambilStock > pilihBarang.getStok()) {
                            throw new StockTidakCukupException("Stok untuk barang " + pilihBarang.getNama() + " tersisa " + pilihBarang.getStok());
                        }
                        pilihBarang.setStok(pilihBarang.getStok() - ambilStock);
                        System.out.println("stok barang " + pilihBarang.getNama() + "berhasil dikurangi.");
                        System.out.println("stok tersisa: " + pilihBarang.getStok());

                    } catch (InputMismatchException e) {
                        System.out.println("input indeks haruws berupa angka");
                        input.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("indek barang tidak valid");
                    } catch (StockTidakCukupException e) {
                        System.out.println("eror " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("terimakasih sudah meemakai aplkikasi kami");
                    ulang = false;
                    break;

                default:
                    System.out.println("pilihana tidak valid");
            }

        }

    }
}
