package com.example.appxone.electroniccalculatorsnew;


import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by APPXONE on 3/8/2016.
 */
public class CustomOnItemSelectedListener implements OnItemSelectedListener {

    public static long values;
    DecimalFormat format;
    Double fre_double, wavevelocity_double, per_double, OUTPUT_WAVELENGTH;
    String wavevelocity, fre, per;
Double first_sub,first_two_sub,final_sub;
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
//        Toast.makeText(parent.getContext(),
//                "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
//                Toast.LENGTH_SHORT).show();
        format = new DecimalFormat(".00");
        if (pos == 0) {
            values = 300000000;
        } else if (pos == 1) {

            values = 300000000;
        } else if (pos == 2) {

            values = 225000000;
        } else if (pos == 3) {

            values = 343;
        } else if (pos == 4) {

            values = 1600;
        }
        Frequencyconverter.wavvelocity_val.setText(String.valueOf(values));


        wavevelocity = Frequencyconverter.wavvelocity_val.getText().toString();

        fre = Frequencyconverter.frequency_val.getText().toString();
        per = Frequencyconverter.period_val.getText().toString();
        fre_double = Double.parseDouble(fre);
        per_double = Double.parseDouble(per);
        wavevelocity_double = Double.parseDouble(wavevelocity);
        OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;

        Frequencyconverter.wavelength_val.setText(format.format(OUTPUT_WAVELENGTH).toString());

       // wavelength = Frequencyconverter.wavelength_val.getText().toString();


        wavevelocity = Frequencyconverter.wavelength_val.getText().toString();

        wavevelocity_double = Double.parseDouble(wavevelocity);
        first_sub = wavevelocity_double / 2;


        if (format.format(first_sub).toString().charAt(0) == '.') {

            Frequencyconverter.lamda2_value.setText("0" + format.format(first_sub).toString());
        } else {
            Frequencyconverter.lamda2_value.setText(format.format(first_sub).toString());
        }
        first_two_sub = first_sub - (wavevelocity_double / 4);


        if (format.format(first_two_sub).toString().charAt(0) == '.') {

            Frequencyconverter.lamda4_value.setText("0" + format.format(first_two_sub).toString());
        } else {
            Frequencyconverter.lamda4_value.setText(format.format(first_two_sub).toString());
        }

        final_sub = first_two_sub - (wavevelocity_double / 8);


        if (format.format(final_sub).toString().charAt(0) == '.') {

            Frequencyconverter.lamda8_value.setText("0" + format.format(final_sub).toString());
        } else {
            Frequencyconverter.lamda8_value.setText(format.format(final_sub).toString());

        }


//
//        Frequencyconverter.wavevelocity = Frequencyconverter.wavvelocity_val.getText().toString();
//
//        fre = Frequencyconverter.frequency_val.getText().toString();
//        per = Frequencyconverter.period_val.getText().toString();
//        Frequencyconverter.fre_double = Double.parseDouble(Frequencyconverter.fre);
//        Frequencyconverter.per_double = Double.parseDouble(Frequencyconverter.per);
//        wavevelocity_double = Double.parseDouble(Frequencyconverter.wavevelocity);
//        OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;
//        wavelength_val.setText(format.format(OUTPUT_WAVELENGTH).toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}