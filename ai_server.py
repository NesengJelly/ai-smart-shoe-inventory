from flask import Flask, jsonify, request

app = Flask(__name__)

# Endpoint untuk menerima permintaan prediksi restock dari JavaFX
@app.route('/api/predict_restock', methods=['GET'])
def predict_restock():
    # Mengambil parameter ukuran dari JavaFX (default: ukuran 39)
    ukuran = request.args.get('ukuran', '39')
    
    # Nanti bagian ini diganti dengan model prediksi LSTM yang sebenarnya
    hasil_prediksi = {
        "status": "success",
        "pesan": f"AI merekomendasikan restock 15 pasang untuk sepatu ukuran {ukuran}.",
        "confidence_score": 0.88
    }
    
    return jsonify(hasil_prediksi)

if __name__ == '__main__':
    print("Server AI berjalan di http://localhost:5000")
    app.run(port=5000, debug=True)