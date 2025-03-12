public class Code2_main {
    public static void main(String[] args) {
        RekeningBank bank1 = new RekeningBank("202410370110402", "Faris", 2000000 );
        RekeningBank bank2 = new RekeningBank("202410370110434", "Aril", 1000000);

        bank1.tampilkanInfo();
        System.out.println();
        bank2.tampilkanInfo();

        System.out.println();
        bank1.setorUang(1000000);
        bank2.setorUang(500000);

        System.out.println();
        bank1.tarikUang(500000);
        bank2.tarikUang(2000000);

        System.out.println();
        bank1.tampilkanInfo();
        System.out.println();
        bank2.tampilkanInfo();

    }
}