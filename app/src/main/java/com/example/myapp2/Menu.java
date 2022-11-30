package com.example.myapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class Menu extends Fragment {
    ImageView home, fav, circulo, happy;
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        rootView = inflater.inflate(R.layout.menu, container, false);
        home = rootView.findViewById(R.id.home);
        fav = rootView.findViewById(R.id.fav);
        circulo = rootView.findViewById(R.id.acount);
        happy = rootView.findViewById(R.id.happy);


        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivityHome.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(), MainActivityStart.class);
                startActivity(intent2);

            }
        });

        circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getActivity(), MainActivityAcount.class);
                startActivity(intent3);

            }
        });

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getActivity(), MainActivity.class);
                startActivity(intent4);


            }
        });

        return rootView;
    }



}
