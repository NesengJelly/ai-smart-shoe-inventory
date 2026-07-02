module com.kelompok14 {
    requires javafx.controls;
    requires javafx.fxml;

    // Tambahkan baris ini agar aplikasi diizinkan mengakses REST API
    requires java.net.http;

    opens com.kelompok14 to javafx.fxml;
    exports com.kelompok14;
}