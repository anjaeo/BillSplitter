package net.androidbootcamp.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Calculate extends AppCompatActivity {

    float result1;
    double t1;
    double t2;
    double t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        TextView result = (TextView) findViewById(R.id.txtResult);

        float billAmt = extras.getFloat("key1");
        float splits = extras.getFloat("key2");


        result1 = billAmt / splits;
        DecimalFormat currency = new DecimalFormat("$###,###.##");



        result.setText(currency.format(result1));

        Button btn15 = (Button) findViewById(R.id.btn15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tip15();
            }});

        Button btn20 = (Button) findViewById(R.id.btn20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tip20();
            }});

        Button btn25 = (Button) findViewById(R.id.btn25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tip25();
            }});


    }


    private void tip15() {
        TextView tip = (TextView) findViewById(R.id.txtTipResult);
        t1 = result1 + (result1 * 0.15);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        tip.setText(currency.format(t1));
    }

    private void tip20() {
        TextView tip = (TextView) findViewById(R.id.txtTipResult);
        t2 = result1 + (result1 * 0.20);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        tip.setText(currency.format(t2));
    }

    private void tip25() {
        TextView tip = (TextView) findViewById(R.id.txtTipResult);
        t3 = result1 + (result1 * 0.25);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        tip.setText(currency.format(t3));
    }



}
