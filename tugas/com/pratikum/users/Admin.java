package com.pratikum.users;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.pratikum.action.AdminAction;
import com.pratikum.data.Item;
import com.pratikum.main.LoginSystem;

public  class Admin extends Users implements AdminAction {

    Scanner input = new Scanner(System.in);

    public Admin(String nama, String Password){
       super(nama, Password);
    }

    @Override
    public void ManageItems() {
        List<Item> items = LoginSystem.reportedItem;
        System.out.println("1. lihat semua laporan");
        System.out.println("2. Tandai barang telah diambil\n choice: ");
        int pilih;
        try {
            pilih = input.nextInt();
            input.nextLine();
        }catch (InputMismatchException e){
            input.nextLine();
            System.out.println("inputan harus berupa angka");
            return;
        }

        if( pilih == 1){
            System.out.println("===daftar laporan===");
            for(Item item : items){
                System.out.printf("Nama: %s|| Deskripsi: %s|| Lokasi: %s|| status: %s",
                        item.getName(), item.getDescription(), item.getLocation(), item.getStatus());
            }
        } else if (pilih == 2) {
            System.out.println("=== Tandai barang diam bil===");
            int index = 0;
            for(Item item : items){
                System.out.printf("%d. Nama: %s|| Deskripsi: %s|| Lokasi: %s|| status: %s", index,
                        item.getName(), item.getDescription(), item.getLocation(), item.getStatus());
                index++;
            }

            try {

            System.out.println("tandai barang no: ");
            int tandai =input.nextInt();
            input.nextLine();
            Item diambil = items.get(tandai);
            diambil.setStatus("claimed");

            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("input harus berupa angka");
            }catch (IndexOutOfBoundsException e){
                System.out.println("pilihan tidak valid");
            }

        }
    }

    @Override
    public void ManageUsers() {
        System.out.println("1. Tambahkan mahasiswa");
        System.out.println("2. Hapus Mahasiswa");
        int pilih;
        try{
            pilih = input.nextInt();
            input.nextLine();
        }catch (InputMismatchException e){
            input.nextLine();
            System.out.println("input harus angka");
            return;
        }

        if(pilih ==1){
            System.out.print("Masukkan nama mahasiswa: ");
            String nama =input.nextLine();
            System.out.println("Masukkan NIM: ");
            String NIM =input.nextLine();

            Mahasiswa mahasiswa =new Mahasiswa(nama, NIM);

            LoginSystem.usersList.add(mahasiswa);

        } else if (pilih == 2) {
            System.out.println("masukkan NIM: ");
            String target = input.nextLine();
            Iterator<Users> iterator = LoginSystem.usersList.iterator();
            boolean ketemu = false;

            while ((iterator.hasNext())){
                Users users = iterator.next();
                if(users instanceof Mahasiswa){
                    Mahasiswa mahasiswa = (Mahasiswa) users;

                    if(mahasiswa.getPassword().equals(target)){
                        iterator.remove();
                        System.out.println("data berhasil dihapus");
                        ketemu =true;
                        break;
                    }
                }
            }
            if(!ketemu){
                System.out.println("data tidak ketemu");
            }

        }

    }
    @Override
    public void displayAppMenu(){
        int pilihan;
        do {
            System.out.println("1. Kelola laporan barang");
            System.out.println("2. Kelola Data mahasiswa");
            System.out.println("0. logout");

            try {
            pilihan = input.nextInt();
            input.nextLine();
            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("harusn angka");
                return;
            }

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
            if (prosesLogin(InputNama, InputPassword)) {
                return true;
            } else {
                return false;
            }
    }

    @Override
    protected boolean prosesLogin(String InputNama, String InputPassword) {
        InputNama = InputNama.trim();
        return (InputNama.equals(nama) && InputPassword.equals(Password));
    }
}