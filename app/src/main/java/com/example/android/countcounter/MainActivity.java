package com.example.android.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int puntuacionEquipo1;
    int puntuacionEquipo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToZero();
    }

    private void setToZero(){
        puntuacionEquipo1 = 0;
        puntuacionEquipo2 = 0;
        mostrarPuntuacionEquipo(puntuacionEquipo1, (TextView) findViewById(R.id.label_puntuacion_equipo1));
        mostrarPuntuacionEquipo(puntuacionEquipo2, (TextView) findViewById(R.id.label_puntuacion_equipo2));

    }
    private void mostrarPuntuacionEquipo(int x, TextView y) {
        y.setText("" + x);
    }

    public void reset(View view){
        setToZero();
    }

    public void Incrementar_Puntuacion(View view){
        String cualBoton = getResources().getResourceEntryName(view.getId());

        switch (cualBoton){
            case "btn_1punto_equipo1":
                puntuacionEquipo1 = puntuacionEquipo1 +1;
                mostrarPuntuacionEquipo(puntuacionEquipo1, (TextView) findViewById(R.id.label_puntuacion_equipo1));
                break;
            case "btn_2puntos_equipo1":
                puntuacionEquipo1 = puntuacionEquipo1 +2;
                mostrarPuntuacionEquipo(puntuacionEquipo1, (TextView) findViewById(R.id.label_puntuacion_equipo1));
                break;
            case "btn_3puntos_equipo1":
                puntuacionEquipo1 = puntuacionEquipo1 +3;
                mostrarPuntuacionEquipo(puntuacionEquipo1, (TextView) findViewById(R.id.label_puntuacion_equipo1));
                break;
            case "btn_1punto_equipo2":
                puntuacionEquipo2 = puntuacionEquipo2 +1;
                mostrarPuntuacionEquipo(puntuacionEquipo2, (TextView) findViewById(R.id.label_puntuacion_equipo2));
                break;
            case "btn_2puntos_equipo2":
                puntuacionEquipo2 = puntuacionEquipo2 +2;
                mostrarPuntuacionEquipo(puntuacionEquipo2, (TextView) findViewById(R.id.label_puntuacion_equipo2));
                break;
            case "btn_3puntos_equipo2":
                puntuacionEquipo2 = puntuacionEquipo2 +3;
                mostrarPuntuacionEquipo(puntuacionEquipo2, (TextView) findViewById(R.id.label_puntuacion_equipo2));
                break;
        }

    }



}
