package com.example.personalprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFarabi = findViewById(R.id.btnFarabi);
        Button btnRetno = findViewById(R.id.btnRetno);
        Button btnTyra = findViewById(R.id.btnTyra);

        btnFarabi.setOnClickListener(v -> openProfile("Farabi"));
        btnRetno.setOnClickListener(v -> openProfile("Retno"));
        btnTyra.setOnClickListener(v -> openProfile("Tyra"));
    }

    private void openProfile(String name) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("NAMA", name);
        startActivity(intent);
    }
}
