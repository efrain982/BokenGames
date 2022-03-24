package com.boken.bokengames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainMenu extends AppCompatActivity {

    private TextView fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main_menu);
        super.onCreate(savedInstanceState);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd - MMM - yyyy");
        String formattedDate = df.format(c.getTime());

        fecha = (TextView) findViewById(R.id.Fecha);
        fecha.setText(formattedDate);

    }
    public void openDescargas(View v) {
        Intent intent = new Intent(this, Descargas.class);
        startActivity(intent);
    }
    public void openVentas(View v) {
        Intent intent = new Intent(this, Ventas.class);
        startActivity(intent);
    }
    public void openSkins(View v) {
        Intent intent = new Intent(this, Skins.class);
        startActivity(intent);
    }
    public void openMapas(View v) {
        Intent intent = new Intent(this, Mapas.class);
        startActivity(intent);
    }
    public void openInstrucciones(View v) {
        Intent intent = new Intent(this, Instrucciones.class);
        startActivity(intent);
    }
}