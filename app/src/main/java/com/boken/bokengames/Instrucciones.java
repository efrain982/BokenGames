package com.boken.bokengames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.shuhart.stepview.StepView;

public class Instrucciones extends AppCompatActivity {

    StepView stepView;
    TextView stepTextView;
    TextView descripcionTextView;

    int stepIndex = 0;
    String[] stepsTexts = {"Brincar", "Moverse", "Correr", "Disparar"};
    String[] descripcionText = {
            "Utilizamos la Tecla 'Space' para ejecutar la acción de poder brincar",
            "Utilizamos las Teclas '<-' & '->' para poder movernos en el mapa",
            "Utilizamos la Tecla 'Z' para correr",
            "Utilizamos la Tecla 'X' para disparar",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);

        stepTextView = findViewById(R.id.stepTextView);
        descripcionTextView = findViewById(R.id.descriptionTextView);
        stepView = findViewById(R.id.step_view);
        stepView.getState()
                .animationType(StepView.ANIMATION_ALL)
                .stepsNumber(4)
                .animationDuration(getResources().getInteger(android.R.integer.config_shortAnimTime))
                .commit();
        nextStep();
    }

    public void nextStep() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                stepIndex++;

                if (stepIndex < stepsTexts.length) {
                    stepTextView.setText(stepsTexts[stepIndex]);
                    descripcionTextView.setText(descripcionText[stepIndex]);
                    stepView.go(stepIndex, true);
                    nextStep();
                }
            }
        }, 3000);
    }
}