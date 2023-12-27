import java.io.FileInputStream;  // FileInputStream sınıfını import et, dosya okuma için kullanılır
import java.io.FileOutputStream; // FileOutputStream sınıfını import et, dosya yazma için kullanılır
import java.io.IOException;      // IOException sınıfını import et, hata yönetimi için kullanılır

public class Main {
    public static void main(String[] args) {
        String filePath = "demo.txt"; // Dosyanın yolu, bu örnekte "demo.txt" adında bir dosya
        
        // Dosyayı FileInputStream kullanarak oku
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int data; // Okunan veriyi tutmak için değişken
            while ((data = fis.read()) != -1) { // Dosyanın sonuna kadar oku
                // Okunan veriyi ekrana yaz (char olarak dönüştürerek)
                System.out.print((char) data);
            }
        } catch (IOException e) { // Dosya okuma sırasında hata oluşursa
            e.printStackTrace();  // Hatayı konsola yazdır
        }
        
        // Dosyayı FileOutputStream kullanarak yaz (Dosyanın içeriğini siler ve yeniden yazar)
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String content = "Hello, World!"; // Yazılacak içerik
            fos.write(content.getBytes());    // İçeriği byte'a çevir ve dosyaya yaz
        } catch (IOException e) { // Dosya yazma sırasında hata oluşursa
            e.printStackTrace();  // Hatayı konsola yazdır
        }
    }
}
