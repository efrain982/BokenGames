package com.boken.bokengames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
}