import java.util.Scanner;
public class modul_3_LoginSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.println("Pilih menu login ");
        int pilihan = input.nextInt();
        boolean suksesLogin = false;
        input.nextLine();

        switch (pilihan){
            case 1:
               admin admin = new admin("admin402", "pass402");
               while (!suksesLogin) {
                   System.out.print("masukkan nama : ");
                   String nama = input.nextLine().trim();
                   System.out.print("masukkan password anda: ");
                   String pass = input.nextLine().trim();
                   suksesLogin = admin.proccesLogin(nama, pass);
               }
                break;
            case 2:
                while(!suksesLogin){
                   mahasiswa mahasiswa = new mahasiswa("Faris", "202410370110402");
                   System.out.print("masukkan nama mahasiswa: ");
                   String inputNama = input.nextLine();
                   System.out.print("Mauskkan NIM anda: ");
                   String InputNIM = input.nextLine();
                   suksesLogin = mahasiswa.ProccesLoigin(inputNama, InputNIM);
                }
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
    static class mahasiswa extends Users{
        mahasiswa(String nama, String password) {
            super(nama, password);
        }
        @Override
        public boolean login (String inputNama, String InputnNIM){
        return super.login(inputNama, InputnNIM);
        }
        public boolean ProccesLoigin(String inputName, String inputNIM){
            if(login(inputName, inputNIM)){
                System.out.println("login berhasil");
                super.displayInfo();
                return true;
            }else{
                System.out.println("gagak login ");
                return false;
            }
        }
    }
}