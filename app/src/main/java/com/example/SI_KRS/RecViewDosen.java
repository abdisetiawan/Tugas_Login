package com.example.SI_KRS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.SI_KRS.Adapter.DosenAdapter;
import com.example.SI_KRS.Model.Dosen;


import java.util.ArrayList;

public class RecViewDosen extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DosenAdapter dosenAdapter;
    private ArrayList<Dosen> dosenList;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.create,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu){
            Intent intent = new Intent(RecViewDosen.this,CreateDosenActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rec_view_dosen);
        this.setTitle("SI-KRS - Hai Admin");
        tambahData();

        recyclerView = findViewById(R.id.recDosen);
        dosenAdapter = new DosenAdapter(dosenList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecViewDosen.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dosenAdapter);
    }

    private void tambahData(){
        dosenList = new ArrayList<>();
        dosenList.add(new Dosen("001","Jong Jek Siang", "s.kom,MM","jjs@staff.ukdw.ac.id","Jl. Raya",R.drawable.diri));
        dosenList.add(new Dosen("002","Yetli Oslan", "s,kom , MM","yetli@staff.ukdw.ac.id","Jl. Kenangan",R.drawable.diri));
    }
}
