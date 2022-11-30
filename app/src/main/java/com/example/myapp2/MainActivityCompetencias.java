package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivityCompetencias<adapter2> extends AppCompatActivity {

    TextInputLayout textinputLayout11;
    AutoCompleteTextView autoCompleteTextView11;

    TextInputLayout textinputLayout22;
    AutoCompleteTextView autoCompleteTextView22;

    TextInputEditText textinputLayout33;
    TextView text;


    Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_competencias);

        textinputLayout11 = findViewById(R.id.TextInputLayout11);
        autoCompleteTextView11 = findViewById(R.id.autoCompleteTextView11);

        registrar = findViewById(R.id.Registrar);


        //Crear array de profesiones para el adaptador del autocompletetextview
        String[] competencias = new String[]{
                "Motivación",
                "Resolutivo",
                "Liderazgo",
                "Dinámico",
                "Otros"
        };
        // Crear arrayadapter y configurarlo
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(
                MainActivityCompetencias.this,
                R.layout.dropdown_tiem2,
                competencias
        );
        //Setear el adapter al autocompletetextview
        autoCompleteTextView11.setAdapter(adapter2);


        textinputLayout22 = findViewById(R.id.TextInputLayout22);
        autoCompleteTextView22 = findViewById(R.id.autoCompleteTextView22);

        //Crear array de profesiones para el adaptador del autocompletetextview
        String[] habilidades = new String[]{
                "Autonomía",
                "Empatico",
                "Gestión del tiempo",
                "Cohesión de equipo",
                "Orientado a resultados"

        };

        // Crear arrayadapter y configurarlo
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(
                MainActivityCompetencias.this,
                R.layout.dropdown_tiem2,
                habilidades
        );
        //Setear el adapter al autocompletetextview
        autoCompleteTextView22.setAdapter(adapter3);

        textinputLayout33 = findViewById(R.id.TextInputLayout33);
        text = findViewById(R.id.text);




        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textFromUser = textinputLayout33.getText().toString();
                text.setText(textFromUser);
                Toast.makeText(getApplicationContext(), "Registro formalizado", Toast.LENGTH_LONG).show();
                Intent IntentLogin = new Intent(MainActivityCompetencias.this, MainActivityHome.class);
                startActivity(IntentLogin);





            }
        });


    }
}