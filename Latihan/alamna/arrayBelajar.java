public class arrayBelajar {
    public static int total(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] angka= {1,2, 3, 4, 5, 6};
        int hasil = total(angka);
        System.out.println("jumlah arr: "+ hasil);
    }

}
