import java.time.LocalDate;
import java.util.Scanner;

public class CodeLab1 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            char autohurufkecil;
            System.out.println("masukkan nama anda: ");
            String nama = input.nextLine();

            do {
                System.out.println("Masukkan jenis kelamin (P/L): ");
                char gender = input.next().charAt(0);
                autohurufkecil = Character.toLowerCase(gender);
            } while(autohurufkecil != 'l' && autohurufkecil != 'p');

            LocalDate time = LocalDate.now();
            int tahunSekarang = time.getYear();

            System.out.println("masukkan tahun lahir: ");
            int tahunLahir = input.nextInt();
            int age = tahunSekarang - tahunLahir;
            System.out.println("Naama: " + nama);
            switch (autohurufkecil) {
                case 'l':
                    System.out.println("Jenis kelamin: laki-laki");
                    break;
                case 'p' :
                    System.out.println("Jenis Kelamin: Perempuan");
                    break;
                default :
                    System.out.println("anomali terdeteksi");
            }

            System.out.println("Umur: " + age);
        }
    }
}