import java.util.Scanner;
public class modul_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("pilih menu login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                KelasAdmin admin = new KelasAdmin();

                while (!admin.login()) {
                    System.out.println("silahkan coba lagi");
                }
                System.out.println("login berhasil");
                admin.DisplayInfo();
                break;
            case 2:
                KelasMahasiswa mahasiswa = new KelasMahasiswa();
                while (!mahasiswa.login1()) {
                    System.out.println("silahkan coba kembali");
                }
                System.out.println("login berhasil");
                mahasiswa.DisplayINfo();
                break;
            default:
                System.out.println("pilihan tidak valid");
        }

    }

    public static class modul_3_LoginSystem {
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
                   admin Admin = new admin();

                   Admin.setNama("admin402");
                   Admin.setPassword("pass402");

                   while (!suksesLogin) {
                       System.out.print("masukkan nama : ");
                       String nama = input.nextLine();
                       System.out.print("masukkan password anda: ");
                       String pass = input.nextLine();
                       suksesLogin = Admin.proccesLogin(nama, pass);
                   }
                    break;
                case 2:
                    mahasiswa Mahasiswa = new mahasiswa();

                    Mahasiswa.setNama("Faris");
                    Mahasiswa.setPassword("202410370110402");

                    while(!suksesLogin){
                       System.out.print("masukkan nama mahasiswa: ");
                       String inputNama = input.nextLine();
                       System.out.print("Mauskkan NIM anda: ");
                       String InputNIM = input.nextLine();
                       suksesLogin = Mahasiswa.ProccesLoigin(inputNama, InputNIM);
                    }
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        }

          static class admin extends Users {
            public admin(){
                super(" ", "");
            }
            @Override
            public boolean login(String namaInput, String passwordInput){
                return super.login(namaInput, passwordInput);
            }
            public boolean proccesLogin(String nama1, String password1){
                if(login(nama1, password1)){
                    displayInfo();
                    return true;
                }else{
                    System.out.println("loigin gagal");
                    return  false;
                }
            }
             @Override
              public void displayInfo(){
                System.out.println("Login berhasil");
                System.out.println("Nama: " + getNama());
                System.out.println("Passwrod: " + getPassword());

            }
        }
        static class mahasiswa extends Users{
            mahasiswa() {
                super("", "");
            }
            @Override
            public boolean login (String inputNama, String InputnNIM){
            return super.login(inputNama, InputnNIM);
            }

            public boolean ProccesLoigin(String inputName, String inputNIM){
                if(login(inputName, inputNIM)){
                   displayInfo();
                    return true;
                }else{
                    System.out.println("gagak login ");
                    return false;
                }
            }
            @Override
            public void displayInfo (){
                System.out.println("Login berhasil");
                System.out.println("Nama : " + getNama());
                System.out.println("NIM: " + getPassword());
            }
        }
    }

    public abstract static class Users {
        private String nama, Password;

        Users(String nama, String Password){
            this.nama = nama;
            this.Password = Password;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNama() {
            return nama;
        }

        public void setPassword(String password) {
            this.Password = password;
        }

        public String getPassword() {
            return Password;
        }


        public boolean login(String inputnama, String inputpass){
            return (inputnama.equals(nama) && inputpass.equals(Password));
        }


        public void displayInfo(){

        }

    }
}