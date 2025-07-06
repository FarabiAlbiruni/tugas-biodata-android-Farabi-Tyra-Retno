package com.example.personalprofile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FarabiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farabi);

        // TextView Biodata
        TextView nama = findViewById(R.id.txtNamaFarabi);
        TextView aktivitas = findViewById(R.id.txtAktivitas);
        TextView pendidikan = findViewById(R.id.txtPendidikan);

        nama.setText(getString(R.string.nama_farabi));
        aktivitas.setText(getString(R.string.aktivitas_farabi));
        pendidikan.setText(getString(R.string.pendidikan_farabi));

        // Tombol Instagram
        Button btnInstagram = findViewById(R.id.btnInstagram);
        btnInstagram.setOnClickListener(v -> {
            Intent igIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/_syadiidaaa?igsh=bmZvMHhlZzM5aWZt&utm_source=qr"));
            startActivity(igIntent);
        });

        // Tombol WhatsApp
        Button btnWhatsapp = findViewById(R.id.btnWhatsapp);
        btnWhatsapp.setOnClickListener(v -> {
            String phoneNumber = "6287841287511"; // No WA Farabi
            String url = "https://wa.me/" + phoneNumber;
            Intent waIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(waIntent);
        });
    }
}
