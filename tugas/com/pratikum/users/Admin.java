package com.pratikum.users;
import java.util.Scanner;

import com.pratikum.action.AdminAction;

public  class Admin extends Users implements AdminAction {

    Scanner input = new Scanner(System.in);

    public Admin(String nama, String Password){
       super(nama, Password);
    }

    @Override
    public void ManageItems() {
        System.out.println("\nFitur kelola barang belum tersedia\n");
    }

    @Override
    public void ManageUsers() {
        System.out.println("Fitur kelola Mahasiswa belum tersedia ");

    }
    @Override
    public void displayAppMenu(){
        int pilihan;
        do {
            System.out.println("1. Kelola laporan barang");
            System.out.println("2. Kelola Data mahasiswa");
            System.out.println("0. logout");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    ManageItems();
                    break;
                case 2:
                    ManageUsers();
                    break;
                case 0:
                    logout();
                    break;
                default:
                    System.out.println("pilihasn tidak valid");
            }
        }while (pilihan !=0);

    }

    @Override
    protected void logout() {
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
}
