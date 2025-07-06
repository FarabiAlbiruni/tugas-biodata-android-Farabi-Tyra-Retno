package com.example.personalprofile;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView tvNama, tvBiodata, tvAktivitas, tvPendidikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvNama = findViewById(R.id.tvNama);
        tvBiodata = findViewById(R.id.tvBiodata);
        tvAktivitas = findViewById(R.id.tvAktivitas);
        tvPendidikan = findViewById(R.id.tvPendidikan);

        String nama = getIntent().getStringExtra("NAMA");
        tvNama.setText(nama);

        switch (nama) {
            case "Farabi":
                tvBiodata.setText("Biodata: Farabi Albiruni Syadida\nLahir: Jakarta,02,Juni,2007\nAlamat: Jakarta Selatan");
                tvAktivitas.setText("03:04 - Sholat melaksanakan sholat\ntahajud 06:30 - Antar adik\n07:30 - Bekerja\n13:30 - Kuliah\n20:00 - Belajar");
                tvPendidikan.setText("SDN 01 Jakarta\nSMPN 05 Jakarta\nSMAN 03 Jakarta\nUniversitas Yatsi Madani - Ilmu Komputer");
                break;
            case "Retno":
                tvBiodata.setText("Biodata: Retno\nLahir: Jakarta,05,Mei,2004\nAlamat: Bandung");
                tvAktivitas.setText("07:00 - Belanja\n09:00 - Masak\n13:00 - Belajar\n18:00 - Istirahat");
                tvPendidikan.setText("SDN 02 Tangerang\nSMPN 06 Bandung\nSMAN 02 Bandung\nUniversitas Yatsi Madani - Ilmu Komputer");
                break;
            case "Tyra":
                tvBiodata.setText("Biodata: Tyra\nLahir:Sukoharjo,02,agustus,2005\nAlamat: Sukohargo");
                tvAktivitas.setText("06:00 - Jogging\n08:00 - Kerja\n16:00 - Kuliah\n21:00 - Santai");
                tvPendidikan.setText("SDN 03 Sukoharjo\nSMPN 09 Sukoharjo\nSMAN 05 Tangerang\nUniversitas Yatsi Madani - Ilmu Komputer");
                break;
        }
    }
}
