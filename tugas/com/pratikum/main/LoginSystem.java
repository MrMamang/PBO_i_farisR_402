package com.pratikum.main;
import com.pratikum.users.*;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean suksesLogin = false;

        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("pilih: ");
        int pilih = input.nextInt();
        input.nextLine();


        switch (pilih){
            case 1:
                while(!suksesLogin){
                    Admin admin = new Admin("Faris 402","402");
                    System.out.println("Nama: ");
                    String nama = input.nextLine();

                    System.out.println("Password: ");
                    String Password = input.nextLine();

                    suksesLogin = admin.login(nama, Password);
                }
                break;

            case 2:
                Mahasiswa mahasiswa = new Mahasiswa("Faris Ramadhan Riyanto", "202410370110402");
                while (!suksesLogin){
                    System.out.println("Nama: ");
                    String nama = input.nextLine();
                    System.out.println("Password: ");
                    String Password = input.nextLine();

                    suksesLogin = mahasiswa.login(nama, Password);
                }
                break;
            default:
                System.out.println("pilihana anda tidak valiid");
        }
        input.close();

    }

}
