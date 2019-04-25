package com.example.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PlotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot);
        BarChart chart = findViewById(R.id.barchart);



        ArrayList NoOfEmp = new ArrayList();
        Bundle b = getIntent().getExtras();
        double result = b.getDouble("key1");
        double result2 = b.getDouble("key2");
        double result3 = b.getDouble("key3");
        double result4 = b.getDouble("key4");
        double result5 = b.getDouble("key5");

        NoOfEmp.add(new BarEntry((float) result, 0));

        NoOfEmp.add(new BarEntry((float) result2, 1));

        NoOfEmp.add(new BarEntry((float) result3, 2));

        NoOfEmp.add(new BarEntry((float) result4, 3));

        NoOfEmp.add(new BarEntry((float) result5, 4));


        ArrayList year = new ArrayList();

        year.add("A");
        year.add("B");
        year.add("C");
        year.add("D");
        year.add("F");


        BarDataSet bardataset = new BarDataSet(NoOfEmp, "Students");
        chart.animateY(5000);
        BarData data = new BarData(year, bardataset);
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        chart.setData(data);
    }
}
