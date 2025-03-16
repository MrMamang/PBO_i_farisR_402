import java.util.Scanner;

public class modul_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");

        System.out.println("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan){
            case 1:
                String username = "Admin402";
                String password = "Password402";
                System.out.print("masukkan username: ");
                String name = input.nextLine();
                System.out.println("masukkan passwaord: ");
                String pass = input.nextLine();

                if(name.equals(username)  && pass.equals(password)){
                    System.out.println("Login anda berhasil");
                }else{
                    System.out.println("Login gagal! Username atau password salah");
                }
                break;
            case 2:
                String nama ="Faris Ramadhan Riyanto";
                String NIM = "202410370110402";
                System.out.print("masukkan nama: ");
                String name1 = input.nextLine();
                System.out.print("Masukk NIM: ");
                String nim = input.nextLine();

                if(name1.equals(nama) && nim.equals(NIM)){
                    System.out.println("login berhasil");
                }else{
                    System.out.println("login gagal! nama atau nim salah");
                }
                break;
            default:
                System.out.println("pilihan tidak valid");
        }
        input.close();
    }
}