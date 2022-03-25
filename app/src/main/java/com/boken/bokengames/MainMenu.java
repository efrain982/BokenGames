package com.boken.bokengames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainMenu extends AppCompatActivity {

    private TextView fecha;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main_menu);
        super.onCreate(savedInstanceState);

        imageView = findViewById(R.id.imageViewLogout);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd - MMM - yyyy");
        String formattedDate = df.format(c.getTime());

        fecha = (TextView) findViewById(R.id.Fecha);
        fecha.setText(formattedDate);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(MainMenu.this,
                        "Sesión Cerrada",
                        Toast.LENGTH_SHORT).show();
                goLoging();
            }
        });

    }

    private void goLoging() {
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
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
    public void openHistoria(View v) {
        Intent intent = new Intent(this, Historia.class);
        startActivity(intent);
    }
}