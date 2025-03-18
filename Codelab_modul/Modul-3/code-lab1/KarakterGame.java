public abstract class KarakterGame {
    private String nama;
    private  int kesehatan;
    private final int damage;
    private final String skil;

    public KarakterGame(String nama, int kesehatan, int damage, String skil) {
        this.nama = nama;
        this.kesehatan = kesehatan;
        this.damage = damage;
        this.skil = skil;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public int getdamage(){
        return damage;
    }

    public String getSkil() {
        return skil;
    }

    public void serang(KarakterGame lawan){
       lawan.terimaDamage(damage);
    }

    public void terimaDamage(int kerusakan){
        kesehatan -= kerusakan;
    }

}
