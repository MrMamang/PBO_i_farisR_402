// Membuat class custom exception bernama StockTidakCukupException
// Kelas ini digunakan untuk menandai kondisi ketika stok barang tidak mencukupi
public class StockTidakCukupException extends RuntimeException {
  // Konstruktor yang menerima pesan error dan meneruskannya ke konstruktor RuntimeException
  public StockTidakCukupException(String message) {
    super(message);// Memanggil konstruktor superclass dengan pesan
  }
}
