public class RekeningBank {
    String Norekening, namapemilik;
    double saldo;
    void tampilkanInfo(){
        System.out.println("Nomor rekening: " + Norekening);
        System.out.println("Nama pemilik: " + namapemilik);
        System.out.println("Saldo: " + saldo);
    }
    RekeningBank (String Norekening, String namapemilik, double saldo){
        this.Norekening = Norekening;
        this.namapemilik = namapemilik;
        this.saldo = saldo;
    }

    void setorUang(double jumlah){
        if(jumlah > 0){
            saldo += jumlah;
            System.out.println(namapemilik + " menyetor " + jumlah + " saldo sekarang " + saldo );
        }else{
            System.out.println("harus menyetor duid lebih dari 0");
        }
    }

    void tarikUang(double jumlah){
        if(jumlah > 0 && jumlah < saldo){
            saldo -= jumlah;
            System.out.println(namapemilik + " menarik " + jumlah + " (berhasil) saldo sekarang:  " + saldo);
        }else{
            System.out.println(namapemilik + " menarik " + jumlah + " (gagal, saldo tidak mencukupi) saldo saat ini:  "+ saldo);
        }
    }
}
