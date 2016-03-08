package com.example.appxone.electroniccalculatorsnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by APPXONE on 3/8/2016.
 */
public class Decibel_converter extends AppCompatActivity {

    Spinner qty, decibel_decimal;
    TextView decibel_value, ref_value,power_val, gain;
    RelativeLayout gain_rel, power_rel, decibel_rel, ref_rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decibel);
        decibel_value= (TextView) findViewById(R.id.decibel_value);

        ref_value= (TextView) findViewById(R.id.reference_value);
        power_val= (TextView) findViewById(R.id.power_value);
        gain= (TextView) findViewById(R.id.gain_value);



        gain_rel = (RelativeLayout) findViewById(R.id.gain_rel);

        power_rel = (RelativeLayout) findViewById(R.id.power_rel);


        decibel_rel = (RelativeLayout) findViewById(R.id.decibel_rel);


        ref_rel = (RelativeLayout) findViewById(R.id.refrence_rel);

        decibel_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });



        gain_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        power_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        ref_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
