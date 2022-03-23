package com.boken.bokengames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import cn.pedant.SweetAlert.SweetAlertDialog;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user = (EditText) findViewById(R.id.username_input);
        EditText password = (EditText) findViewById(R.id.pass);
        TextView txtLogin = (TextView) findViewById(R.id.btnLogin);

        Intent intent = new Intent(MainActivity.this, MainMenu.class);

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user.getText().toString().equals(".") && password.getText().toString().equals(".")){
                    startActivity(intent);
                }else{
                    new SweetAlertDialog(MainActivity.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Oops...")
                            .setContentText("Ocurrió un error")
                            .show();
                }
            }
        });
    }


}