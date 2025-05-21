package com.pratikum.main;
import com.pratikum.users.*;
import java.util.*;
import com.pratikum.data.Item;


public class LoginSystem {
    public static ArrayList<Item> reportedItem = new ArrayList<>();
    public static ArrayList<Users> usersList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean suksesLogin = false;

        usersList.add(new Admin("Faris402", "402"));
        usersList.add(new Admin("pace434", "434"));
        usersList.add(new Mahasiswa("Faris Ramadhan riyanto", "202410370110402"));
        usersList.add(new Mahasiswa("ariel ardiansyah", "202410370110434"));

        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("pilih: ");
        int pilih;
        while (true) {
            try {
                pilih = input.nextInt();
                input.nextLine();
                if (pilih == 1 || pilih == 2) {
                    break;
                } else {
                    System.out.println("pilihan harus 1 atau 2.\n coba lagi");
                }
            } catch (InputMismatchException e) {
                System.out.println("input harus berupa angka");
                input.nextLine();
            }
        }


        switch (pilih) {
            case 1:
                while (!suksesLogin) {
                    System.out.println("Nama: ");
                    String nama = input.nextLine();

                    System.out.println("Password: ");
                    String Password = input.nextLine();

                    if (usersList != null && !usersList.isEmpty()) {
                        for (Users user : usersList) {
                            if (user instanceof Admin && user.login(nama, Password)) {
                                System.out.println("berhasill login sebagaiu admin");
                                suksesLogin = true;
                                ((Admin) user).displayAppMenu();
                            }
                        }
                    }
                }
                break;

            case 2:
                while (!suksesLogin) {
                    System.out.println("Nama: ");
                    String nama = input.nextLine();
                    System.out.println("Password: ");
                    String Password = input.nextLine();

                    if(usersList !=null && !usersList.isEmpty()) {
                        for (Users user : usersList) {
                            if (user instanceof Mahasiswa && user.login(nama, Password)) {
                                System.out.println("login mahasiswa berhasil");
                                suksesLogin = true;
                                ((Mahasiswa) user).displayAppMenu();
                            }
                        }
                    }
                }
                break;
                default:
                    System.out.println("pilihana anda tidak valiid");
        }
    }
}