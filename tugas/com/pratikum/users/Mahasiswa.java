package com.pratikum.users;
import java.util.List;
import java.util.Scanner;
import com.pratikum.action.MahasiswaAction;
import com.pratikum.data.Item;
import com.pratikum.main.LoginSystem;
import java.util.InputMismatchException;


public  class Mahasiswa extends Users implements MahasiswaAction {

    Scanner input = new Scanner(System.in);

    public Mahasiswa(String nama, String Password){
        super(nama, Password);
    }
    @Override
    public  void ReportItem() {
        System.out.println("Nama barang:  ");
        String NamaBarang = input.nextLine();
        System.out.println("Deskripsi barang: ");
        String DesrikpsiBarang = input.nextLine();
        System.out.println(" Lokasi terakhir/ditemukan : ");
        String LokasiTerkhir = input.nextLine();

        Item item = new Item(NamaBarang, DesrikpsiBarang, LokasiTerkhir, "Report item");
        LoginSystem.reportedItem.add(item);

    }

    @Override
    public void ViewReportItems() {
        List<Item> items = LoginSystem.reportedItem;
        if(items.isEmpty()){
            System.out.println("data belum ada");
        }
        System.out.println("-----daftar barng laporan------");
        for(Item it : items){
            if("Report item".equals(it.getStatus())){
                System.out.println("Nama: "+ it.getName() + "| Deskripsi barang: "+ it.getDescription() + "| Lokasi terakhir: " + it.getLocation());
            }

        }

    }

    @Override
    public void logout() {
        System.out.println("keluar dari program");
    }

    @Override
    public boolean login(String InputNama, String InputPassword) {
        if(prosesLogin(InputNama, InputPassword)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    protected boolean prosesLogin(String InputNama, String InputPassword) {
        InputNama = InputNama.trim();
        return (InputNama.equals(nama) && InputPassword.equals(Password));

    }

    @Override
    public void displayAppMenu() {
        int pilihan;
        do{
            System.out.println("1. Laporkan barang temuan/hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. logout");

            try {
            pilihan = input.nextInt();
            input.nextLine();
            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("harus angka");
                return;
            }

            switch (pilihan) {
                case 1:
                    ReportItem();
                    break;
                case 2:
                    ViewReportItems();
                    break;
                case 0:
                    logout();
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;

            }
        }while (pilihan !=0);
    }
}
