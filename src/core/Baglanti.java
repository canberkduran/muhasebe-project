package core;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Baglanti {
    public static void main(String[] args) {
        try {
            // PostgreSQL veritabanı bağlantısı
            String url = "jdbc:postgresql://localhost:5432/vtys";
            String username = "postgres"; // PostgreSQL kullanıcı adı
            String password = "your_password"; // PostgreSQL şifresi

            // Bağlantıyı al
            Connection conn = DriverManager.getConnection(url, username, password);

            // Test olarak veritabanından basit bir sorgu çalıştırın
            Statement stmt = conn.createStatement();
            stmt.executeQuery("SELECT 1");

            System.out.println("Veritabanına bağlanıldı.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

