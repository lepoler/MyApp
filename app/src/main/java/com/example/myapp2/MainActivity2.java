package com.example.myapp2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    TextView web, web1, web2, web3, web4, web5, web6, web7, web8;

    ScrollView scroll;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        web = findViewById(R.id.web);
        web2 = findViewById(R.id.web2);
        web3 = findViewById(R.id.web3);
        web4 = findViewById(R.id.web4);
        web5 = findViewById(R.id.web5);
        web6 = findViewById(R.id.web6);
        web7 = findViewById(R.id.web7);
        web8 = findViewById(R.id.web8);


        web.setOnClickListener(this);
        web2.setOnClickListener(this);
        web3.setOnClickListener(this);
        web4.setOnClickListener(this);
        web5.setOnClickListener(this);
        web6.setOnClickListener(this);
        web7.setOnClickListener(this);
        web8.setOnClickListener(this);

        scroll = findViewById(R.id.scroll);
        int type = getIntent().getIntExtra("Type", 0);
        scrollTo(type);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.web:
                Intent caravan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.caravanmade.com/"));
                startActivity(caravan);
                break;

            case R.id.web2:
                Intent detour = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/detour_studio/?hl=es"));
                startActivity(detour);
                break;

            case R.id.web3:
                Intent nomad = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nomadcoffee.es/"));
                startActivity(nomad);
                break;

            case R.id.web4:
                Intent catfons = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cat-fons.com/"));
                startActivity(catfons);
                break;

            case R.id.web5:
                Intent cooh = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bourkeroad.cooh.com.au/"));
                startActivity(cooh);
                break;

            case R.id.web6:
                Intent picketts = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pickettsdeli.com/"));
                startActivity(picketts);
                break;

            case R.id.web7:
                Intent tgtg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://toogoodtogo.es/es"));
                startActivity(tgtg);
                break;

            case R.id.web8:
                Intent decat = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.decathlon.es/es/?_adin=02021864894"));
                startActivity(decat);
                break;




        }

    }
    public void scrollTo(int type){
        if(type == 0)
            return;

        if(type == 1){
            //First argument is x, second is y. Test around a bit with the x value
            scroll.smoothScrollTo(10, 0); //Use this if you want no animation

        } else if (type == 2){
            scroll.smoothScrollTo(10, 20);

        } else if (type == 3){
            scroll.smoothScrollTo(10, 50);

        } else if (type == 4){
            scroll.smoothScrollTo(10, 0);

        } else if (type == 5){
            scroll.smoothScrollTo(10, 0);

        } else if (type == 6){
            scroll.smoothScrollTo(10, 0);

        } else if (type == 7){
            scroll.smoothScrollTo(10, 0);

        } else if (type == 8){
            scroll.smoothScrollTo(10, 0);

        }






        //add more if you want
    }
}



