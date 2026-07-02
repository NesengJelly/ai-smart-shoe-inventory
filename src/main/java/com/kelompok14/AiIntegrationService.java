package com.kelompok14;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AiIntegrationService {

    // Perhatikan: void diganti menjadi String
    public static String tanyaAiRestock(String ukuranSepatu) {
        try {
            String apiUrl = "http://localhost:5000/api/predict_restock?ukuran=" + ukuranSepatu;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Kembalikan teks asli dari Python
            return response.body();

        } catch (Exception e) {
            return "Error: Gagal menghubungi AI. Pastikan server Python menyala.";
        }
    }
}