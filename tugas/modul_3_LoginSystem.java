import java.util.Scanner;
public class modul_3_LoginSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.println("Pilih menu login ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                Users admin = new Users("Admin402", "Pas402");


        }

    }
     static class admin extends Users{
        public admin(String nama, String Password){
            super(nama, Password);
        }
        @Override
        public void login(Users periksa){

        }

    }
}
