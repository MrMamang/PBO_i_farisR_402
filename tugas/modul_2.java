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
                break;
            case 2:
                KelasMahasiswa mahasiswa = new KelasMahasiswa();
                while (!mahasiswa.login1()) {
                    System.out.println("silahkan coba kembali");
                }
                System.out.println("login berhasil");
                break;
            default:
                System.out.println("pilihan tidak valid");
        }

    }
}