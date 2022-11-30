package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivityHome extends AppCompatActivity implements View.OnClickListener{

    ImageView caravan, detour, nomad, catfons, cooh, picketts, tgtg, decat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        caravan = findViewById(R.id.caravan);
        detour = findViewById(R.id.detour);
        nomad = findViewById(R.id.nomad);
        catfons = findViewById(R.id.catfons);
        cooh = findViewById(R.id.cooh);
        picketts = findViewById(R.id.picketts);
        tgtg = findViewById(R.id.tgtg);
        decat = findViewById(R.id.decat);



       caravan.setOnClickListener(this);
       detour.setOnClickListener(this);
       nomad.setOnClickListener(this);
       catfons.setOnClickListener(this);
       cooh.setOnClickListener(this);
       picketts.setOnClickListener(this);
       tgtg.setOnClickListener(this);
       decat.setOnClickListener(this);




    }

    public void startDetailActivity(int type){
        Intent startIntent = new Intent(this, MainActivity2.class);
        startIntent.putExtra("Type", type);
        startActivity(startIntent);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.caravan:
                startDetailActivity(1);
                break;
            case R.id.detour:
                startDetailActivity(2);
                break;
            case R.id.nomad:
                startDetailActivity(3);
                break;
            case R.id.catfons:
                startDetailActivity(4);
                break;
            case R.id.cooh:
                startDetailActivity(5);
                break;
            case R.id.picketts:
                startDetailActivity(6);
                break;
            case R.id.tgtg:
                startDetailActivity(7);
                break;
            case R.id.decat:
                startDetailActivity(8);
                break;
        }

    }
}