import java.util.Scanner;
public class modul_3_LoginSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.println("Pilih menu login ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan){
            case 1:
               admin admin = new admin("admin402", "pass402");
               boolean suksesLogin = false;
               while (!suksesLogin) {
                   System.out.print("masukkan nama : ");
                   String nama = input.nextLine().trim();
                   System.out.print("masukkan password anda: ");
                   String pass = input.nextLine().trim();
                   suksesLogin = admin.proccesLogin(nama, pass);
               }
                break;
            case 2:

                break;
            default:
                System.out.println("pilihan tidak valid");
        }
    }

      static class admin extends Users{
        public admin(String nama, String Password){
            super(nama, Password);

        }
        @Override
        public boolean login(String namaInput, String passwordInput){
            return super.login(namaInput, passwordInput);
        }
        public boolean proccesLogin(String nama1, String password1){
            if(login(nama1, password1)){
                System.out.println("login berhasuil");
                super.displayInfo();
                return true;
            }else{
                System.out.println("loigin gagal");
                return  false;
            }
        }

    }
}
