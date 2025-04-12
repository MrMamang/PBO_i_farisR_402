import java.util.Scanner;

public class KelasMahasiswa {
    String nama = "Faris";
    String NIM = "202410370110402";
    public boolean login1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama1 = input.next();
        System.out.print("Masukkan NIM : ");
        String nim = input.next();

        if(!PeriksaLogin(nama1, nim)){
            System.out.println("login gagal");
            return false;
        }else{
            return true;
        }
    }
    public boolean PeriksaLogin(String nama1, String nim){
        return (nama1.equals(nama) && nim.equals(NIM));
    }
    public void DisplayINfo(){
        System.out.println("nama : " + nama);
        System.out.println("NIM : " + NIM);
    }
}
