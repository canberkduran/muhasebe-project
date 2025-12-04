# Muhasebe ve Fatura Yönetim Sistemi

Java Swing arayüz kütüphanesi ve JDBC veritabanı bağlantısı kullanılarak geliştirilmiş; gelir-gider takibi, faturalandırma ve cari hesap yönetimini sağlayan masaüstü uygulamasıdır.

### 🏗️ Yazılım Mimarisi ve Tasarım Kalıpları

Proje, kodun sürdürülebilirliğini ve modülerliğini sağlamak adına **MVC (Model-View-Controller)** mimari yapısı üzerine inşa edilmiştir. Geliştirme sürecinde aşağıdaki tasarım kalıpları (Design Patterns) aktif olarak kullanılmıştır:

* **Singleton Pattern:** Veritabanı bağlantı yönetimi (`Baglanti` sınıfı), sistem kaynaklarını verimli kullanmak ve gereksiz bağlantı yükünü önlemek amacıyla tek bir örnek (instance) üzerinden merkezi olarak yönetilmektedir.
* **Builder Pattern:** Çok sayıda parametre içeren karmaşık fatura nesnelerinin (`GelirFatura`, `GiderFatura`) oluşturulma süreci; kod okunabilirliğini artırmak ve nesne üretimini standartlaştırmak için Builder kalıbı ile kurgulanmıştır.

### 🛠️ Kullanılan Teknolojiler

* **Dil:** Java
* **Arayüz (UI):** Swing
* **Veritabanı:** PostgreSQL
* **Veri Erişimi:** JDBC
