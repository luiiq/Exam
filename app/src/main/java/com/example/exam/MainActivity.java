package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button1 = (Button) findViewById(R.id.compute);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }



    private void calculate() {
        EditText total = (EditText) findViewById(R.id.totalstudents);
        final EditText Astudents = (EditText) findViewById(R.id.Atotal);
        final EditText Bstudents = (EditText)findViewById(R.id.Btotal);
        final EditText Cstudents = (EditText) findViewById(R.id.Ctotal);
        final EditText Dstudents = (EditText) findViewById(R.id.DTotal);
        final EditText Fstudents = (EditText) findViewById(R.id.Ftotal);

        double resultA = Double.valueOf(Astudents.getText().toString());
        double resultB = Double.valueOf(Bstudents.getText().toString());
        double resultC = Double.valueOf(Cstudents.getText().toString());
        double resultD = Double.valueOf(Dstudents.getText().toString());
        double resultF = Double.valueOf(Fstudents.getText().toString());
        double resultTotal = Double.valueOf(total.getText().toString());
        double result1 = (resultA / resultTotal) * 100;
        double result2 = (resultB / resultTotal) * 100;
        double result3 = (resultC / resultTotal) * 100;
        double result4 = (resultD / resultTotal) * 100;
        double result5 = (resultF / resultTotal) * 100;


        Toast.makeText(this,"The percentage of grade distribution are: \n" + "A's "+ (Double) result1 +
                "%\nB's "+ result2+"%\nC's " + result3 +"%\nD's " + result4 +"%\nF's " + result5 +"%" , Toast.LENGTH_LONG).show();


        Intent yourIntent = new Intent(MainActivity.this, PlotActivity.class);
        Bundle b = new Bundle();
        b.putDouble("key1", result1);
        b.putDouble("key2", result2);
        b.putDouble("key3", result3);
        b.putDouble("key4", result4);
        b.putDouble("key5", result5);
        yourIntent.putExtras(b);
        startActivity(yourIntent);


    }
}







