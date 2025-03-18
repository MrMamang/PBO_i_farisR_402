public class codeLab {
    public void displayInfo(){
        Pahlawan pahlawan = new Pahlawan("Arthur", 100, 20, "pistol");
        Vilain vilain = new Vilain("Micah", 80, 15, "pisau");

        pahlawan.setNama("budi");
        pahlawan.setKesehatan(200);

        vilain.setNama("adit");
        vilain.setKesehatan(150);

        System.out.println("Status awal");
        System.out.println( pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan() );
        System.out.println(vilain.getNama() + " memiliki kesehatan: " + vilain.getKesehatan());
        System.out.println();

        pahlawan.serang(vilain);
        System.out.println(vilain.getNama() + " terkena damage " + pahlawan.getdamage() + " ,sekarang memiliki kesehatan " + vilain.getKesehatan());

        vilain.serang(pahlawan);
        System.out.println(pahlawan.getNama() + " serkarang memiliki kesehatan " + pahlawan.getKesehatan());

    }
    static class Pahlawan extends KarakterGame{
        public Pahlawan(String nama, int kesehatan, int damage, String skil){
            super(nama, kesehatan, damage, skil);
        }

        @Override
        public void serang(KarakterGame lawan){
            System.out.println(super.getNama() + " gunslingger menyerang dengan " + getSkil());
            super.serang(lawan);

        }
    }
    static class  Vilain extends KarakterGame{
        public Vilain(String nama, int kesehatan, int damage, String skil){
            super(nama, kesehatan, damage, skil);
        }

        @Override
        public void serang(KarakterGame lawan) {
            System.out.println(getNama() + " vilian menyerang degnan " + getSkil());
            super.serang(lawan);

        }
    }
    public static void main(String[] args){
        codeLab main = new codeLab();

        main.displayInfo();
    }
}
