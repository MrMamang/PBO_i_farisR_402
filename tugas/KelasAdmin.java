import java.util.Scanner;
public class KelasAdmin {
    String nama = "Admin402";
    String password = "password402";
    public boolean login(){

        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama1 = input.next();
        System.out.print("Password: ");
        String pass = input.next();

        if(!PeriksaLogin(nama1, pass)){
            System.out.println("login gagal");
            return false;
        }else{
            return true;
        }
    }
    public boolean PeriksaLogin(String nama1, String pass){
       return (nama1.equals(nama) && pass.equals(password));
    }
}
