package com.example.myapp2;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout textinputLayout;
    AutoCompleteTextView autoCompleteTextView;

    TextInputLayout textinputLayout2;
    AutoCompleteTextView autoCompleteTextView2;

    TextInputLayout textinputLayout3;
    AutoCompleteTextView autoCompleteTextView3;

    Button siguiente;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textinputLayout = findViewById(R.id.TextInputLayout);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        textinputLayout2 = findViewById(R.id.TextInputLayout2);
        autoCompleteTextView2 = findViewById(R.id.autoCompleteTextView2);
        siguiente = findViewById(R.id.Siguiente);


        //Crear array de profesiones para el adaptador del autocompletetextview
        String[] profesiones = new String[]{
                "Compañero de estudios",
                "Compañero de trabajo",
                "Jefe",
                "Profesor",
                "Otros"
          };

        // Crear arrayadapter y configurarlo
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this,
                R.layout.dropdown_item,
                profesiones
        );
        //Setear el adapter al autocompletetextview
        autoCompleteTextView.setAdapter(adapter);

        textinputLayout3 = findViewById(R.id.TextInputLayout3);
        autoCompleteTextView3 = findViewById(R.id.autoCompleteTextView3);

        //Crear array de profesiones para el adaptador del autocompletetextview
        String[] empresas = new String[]{
                "Caravan Made",
                "Detour",
                "Too Good To Go",
                "Decathlon",
                "VespresUb",
                "Catfons",
                "Picketts Deli",
                "Cooh"
        };

        // Crear arrayadapter y configurarlo
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(
                MainActivity.this,
                R.layout.dropdown_item,
                empresas
        );
        //Setear el adapter al autocompletetextview
        autoCompleteTextView3.setAdapter(adapter2);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, MainActivityCompetencias.class);
                startActivity(intent5);


            }
        });



    }

}