package com.boken.bokengames;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class Skins extends AppCompatActivity {

    BarChart barChart;
    BarData barData;
    BarDataSet barDataSet;
    ArrayList barEntriesArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skins);

        barChart = findViewById(R.id.idBarChart);

        getBarEntries();

        barDataSet = new BarDataSet(barEntriesArrayList, "Ventas de Skins por Semana");

        barData = new BarData(barDataSet);

        barChart.setData(barData);

        barDataSet.setColors(Color.parseColor("#F14B2C"));

        barDataSet.setValueTextColor(Color.BLACK);

        barDataSet.setValueTextSize(16f);
        barChart.getDescription().setEnabled(false);
    }

    private void getBarEntries() {

        barEntriesArrayList = new ArrayList<>();

        barEntriesArrayList.add(new BarEntry(1f, 7));
        barEntriesArrayList.add(new BarEntry(2f, 5));
        barEntriesArrayList.add(new BarEntry(3f, 8));
        barEntriesArrayList.add(new BarEntry(4f, 4));
        barEntriesArrayList.add(new BarEntry(5f, 9));
        barEntriesArrayList.add(new BarEntry(6f, 10));
    }
}