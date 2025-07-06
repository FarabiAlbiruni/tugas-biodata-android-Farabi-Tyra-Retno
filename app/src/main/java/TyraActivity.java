package com.example.personalprofile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TyraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyra);

        // TextView Biodata
        TextView nama = findViewById(R.id.txtNamaTyra);
        TextView aktivitas = findViewById(R.id.txtAktivitas);
        TextView pendidikan = findViewById(R.id.txtPendidikan);

        nama.setText(getString(R.string.nama_tyra));
        aktivitas.setText(getString(R.string.aktivitas_tyra));
        pendidikan.setText(getString(R.string.pendidikan_tyra));

        // Tombol Instagram
        Button btnInstagram = findViewById(R.id.btnInstagram);
        btnInstagram.setOnClickListener(v -> {
            Intent igIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/tyara0208?igsh=MXQ3NmxnNWxuZGtvdw%3D%3D&utm_source=qr"));
            startActivity(igIntent);
        });

        // Tombol WhatsApp
        Button btnWhatsapp = findViewById(R.id.btnWhatsapp);
        btnWhatsapp.setOnClickListener(v -> {
            String phoneNumber = "6288290927839";
            String url = "https://wa.me/" + phoneNumber;
            Intent waIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(waIntent);
        });
    }
}
