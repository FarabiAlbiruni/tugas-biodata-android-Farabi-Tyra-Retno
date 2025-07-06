package com.example.personalprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DaftarAnggotaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_anggota);

        Button btnFarabi = findViewById(R.id.btnFarabi);
        Button btnRetno = findViewById(R.id.btnRetno);
        Button btnTyra = findViewById(R.id.btnTyra);

        btnFarabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaftarAnggotaActivity.this, FarabiActivity.class));
            }
        });

        btnRetno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaftarAnggotaActivity.this, RetnoActivity.class));
            }
        });

        btnTyra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DaftarAnggotaActivity.this, TyraActivity.class));
            }
        });
    }
}
