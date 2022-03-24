package com.boken.bokengames;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class Descargas extends AppCompatActivity {

    private BarChart chart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descargas);
        showBarChart();
    }

    private void showBarChart() {
        setTitle("BarChartActivity");

        chart = findViewById(R.id.barChart_view);
        ArrayList<Double> valueList = new ArrayList<Double>();
        ArrayList<BarEntry> entries = new ArrayList<>();
        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.parseColor("#F14B2C"));
        String title = "Ventas por semana";

        for (int i = 1; i < 8; i++) {
            valueList.add(i * 5.0);
        }

        //fit the data into a bar
        for (int i = 1; i < valueList.size(); i++) {
            BarEntry barEntry = new BarEntry(i, valueList.get(i).floatValue());
            entries.add(barEntry);
        }

        BarDataSet barDataSet = new BarDataSet(entries, title);
        barDataSet.setColors(colors);
        BarData data = new BarData(barDataSet);
        chart.setData(data);
        chart.invalidate();
    }
}
