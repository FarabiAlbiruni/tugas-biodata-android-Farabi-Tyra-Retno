package com.example.personalprofile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RetnoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retno);

        // TextView Biodata
        TextView nama = findViewById(R.id.txtNamaRetno);
        TextView aktivitas = findViewById(R.id.txtAktivitas);
        TextView pendidikan = findViewById(R.id.txtPendidikan);

        nama.setText(getString(R.string.nama_retno));
        aktivitas.setText(getString(R.string.aktivitas_retno));
        pendidikan.setText(getString(R.string.pendidikan_retno));

        // Tombol Instagram
        Button btnInstagram = findViewById(R.id.btnInstagram);
        btnInstagram.setOnClickListener(v -> {
            Intent igIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/retttzzz_?igsh=aTJibXFmejVxaDFu"));
            startActivity(igIntent);
        });

        // Tombol WhatsApp
        Button btnWhatsapp = findViewById(R.id.btnWhatsapp);
        btnWhatsapp.setOnClickListener(v -> {
            String phoneNumber = "6285693521574"; // Nomor WA Retno (format udah 62)
            String url = "https://wa.me/" + phoneNumber;
            Intent waIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(waIntent);
        });
    }
}
