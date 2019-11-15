package com.example.SI_KRS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateDosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_dosen);
        this.setTitle("SI-KRS - Hai Admin");

        Button btnDaftarKrs = (Button)findViewById(R.id.btnSimpan);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateDosenActivity.this, menuAdmin.class);
                startActivity(intent);
            }
        });
    }
}
