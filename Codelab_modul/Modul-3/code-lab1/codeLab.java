public class codeLab {
    public void displayInfo(){
        Pahlawan pahlawan = new Pahlawan("budi", 100, 20, "pistol");
        Vilain vilain = new Vilain("abangda", 80, 15, "pisau");

        pahlawan.setNama("Arthur Morgan");
        pahlawan.setKesehatan(200);

        vilain.setNama("Micah");
        vilain.setKesehatan(150);

        System.out.println("Status awal");
        System.out.println( pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan() );
        System.out.println(vilain.getNama() + " memiliki kesehatan: " + vilain.getKesehatan());
        System.out.println();

        pahlawan.serang(vilain);
        vilain.serang(pahlawan);

    }
    //subclass pahlawan
    static class Pahlawan extends KarakterGame{
        public Pahlawan(String nama, int kesehatan, int damage, String skil){
            super(nama, kesehatan, damage, skil);
        }

        @Override
        public void serang(KarakterGame lawan){

            super.serang(lawan);

            System.out.println(getNama() + " gunslingger menyerang dengan " + getSkil());
            System.out.println(lawan.getNama() + " serkarang memiliki kesehatan " + lawan.getKesehatan());
        }
    }
    //sub classs vilain
    static class  Vilain extends KarakterGame{
        public Vilain(String nama, int kesehatan, int damage, String skil){
            super(nama, kesehatan, damage, skil);
        }

        @Override
        public void serang(KarakterGame lawan) {
            super.serang(lawan);
            System.out.println(getNama() + " vilian menyerang dengnan " + getSkil());
            System.out.println(lawan.getNama() + " ,sekarang memiliki kesehatan " + lawan.getKesehatan());
        }
    }
    public static void main(String[] args){
        codeLab main = new codeLab();

        main.displayInfo();
    }
}