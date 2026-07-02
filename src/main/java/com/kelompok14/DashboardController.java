package com.kelompok14;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class DashboardController {

    // Menyambungkan kolom input dari Scene Builder
    @FXML
    private TextField inputUkuranSepatu;

    // Menyambungkan teks hasil (label) dari Scene Builder
    @FXML
    private Label labelHasilAi;

    // Fungsi ini yang akan dieksekusi saat tombol diklik
    @FXML
    public void klikTombolTanyaAi(ActionEvent event) {
        // 1. Ambil teks (angka ukuran) yang diketik oleh user
        String ukuran = inputUkuranSepatu.getText();

        // Cek jika user lupa mengisi kolom tapi langsung pencet tombol
        if (ukuran == null || ukuran.trim().isEmpty()) {
            labelHasilAi.setText("Masukkan ukuran sepatu terlebih dahulu!");
            return;
        }

        // Memberikan efek visual bahwa AI sedang berpikir
        labelHasilAi.setText("AI sedang menganalisis data...");

        // 2. Minta jawaban dari Python (menggunakan class Service tadi)
        String jawabanAi = AiIntegrationService.tanyaAiRestock(ukuran);

        // 3. Tampilkan balasan dari Python ke layar JavaFX
        labelHasilAi.setText(jawabanAi);
    }
}