package com.pratikum.users;
import java.util.Scanner;

import com.pratikum.action.MahasiswaAction;


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

    }

    @Override
    public void ViewReportItems() {
        System.out.println("Fitur Lihar laporan belum tersedia");

    }

    @Override
    public void logout() {
        System.out.println("keluar dari program");

    }

    @Override
    public boolean login(String InputNama, String InputPassword) {
        if(prosesLogin(InputNama, InputPassword)){
            displayAppMenu();
            return true;
        }else{
            System.out.println("login gagal coba lagi");
            return false;
        }
    }

    @Override
    protected boolean prosesLogin(String InputNama, String InputPassword) {
        InputNama = InputNama.trim();
        return (InputNama.equals(nama) && InputPassword.equals(Password));

    }

    @Override
    protected void displayAppMenu() {
        int pilihan;
        do {
            System.out.println("1. Laporkan barang temuan/hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. logout");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    ReportItem();
                    break;
                case 2:
                    ViewReportItems();
                    break;
                case 0:
                    logout();
                default:
                    System.out.println("pilihan tidak valid");

            }
        }while (pilihan !=0);
    }
}
