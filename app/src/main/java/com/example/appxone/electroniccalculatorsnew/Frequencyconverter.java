package com.example.appxone.electroniccalculatorsnew;

import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.text.DecimalFormat;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by APPXONE on 3/8/2016.
 */
public class Frequencyconverter extends AppCompatActivity {
    TextView unit;
    TextView dialog_edidtext, dialog_header;
    Button diaog_cancel_button, dialog_ok_button;
    Dialog dialog_custom;
    //  TextView frequency_val, period_val;
    public static TextView wavvelocity_val, frequency_val, period_val;
    public static TextView wavelength_val;

    RelativeLayout frequency_rel, period_rel, wavvelocity_rel, wavelength_rel;
    TextView frq_unit, period_unit, wavevelocity_unit, wavelength_unit;
    public static TextView lamda2_value, lamda4_value, lamda8_value;
    TextView lamda2_unit, lamda4_unit, lamda8_unit, fre_unit;

    String fre, per, wavelength;
    public static String wavevelocity;
    Double OUTPUT_PERIOD, OUTPUT_WAVELENGTH, OUTPUT_fre;
    Typeface typeface;
    Double fre_double, per_double, wavevelocity_double, wavelength_double;

    DecimalFormat format;

    Double first_two_sub, final_sub, first_sub;

    String s1;
    Toast t;
    String publishteId, ad_Id;
    int check;

    private Spinner spinner1;
    public static Spinner unit_convertion;
    String collection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frequncyconverter);


        getSupportActionBar().hide();

        check = 0;
        addItemsOnSpinner2();

        collection = "";
        spinner1.setSelection(0);
        publishteId = "ca-app-pub-9381472359687969/2648882536";
        AdView mAdView = new AdView(getApplicationContext(), null);
        ad_Id = publishteId;
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.adLayout);
        linearLayout.addView(mAdView);
        mAdView.setAdUnitId(ad_Id);
        mAdView.setAdSize(AdSize.SMART_BANNER);
        com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

                linearLayout.setVisibility(View.VISIBLE);
                Log.e("load", "111");
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Log.e("failed", "111");
            }
        });

        t = Toast.makeText(Frequencyconverter.this, "Invalid Digit", Toast.LENGTH_SHORT);
        format = new DecimalFormat(".00");

        typeface = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTStd-Medium.otf");

        lamda2_value = (TextView) findViewById(R.id.lamda2_value);

        lamda4_value = (TextView) findViewById(R.id.lamda4_value_desc);

        lamda8_value = (TextView) findViewById(R.id.lamda8_value_desc);

        frequency_rel = (RelativeLayout) findViewById(R.id.gain_rel);

        period_rel = (RelativeLayout) findViewById(R.id.power_rel);
        wavvelocity_rel = (RelativeLayout) findViewById(R.id.wave_rel);

        wavelength_rel = (RelativeLayout) findViewById(R.id.wavelength_rel);


        frequency_val = (TextView) findViewById(R.id.gain_value);
        fre_unit = (TextView) findViewById(R.id.fre_unit);


        wavelength_unit= (TextView) findViewById(R.id.wavelength_unit);
        period_val = (TextView) findViewById(R.id.power_value);

        wavvelocity_val = (TextView) findViewById(R.id.wave_value);
        wavevelocity_unit = (TextView) findViewById(R.id.wavevelocity_unit);
        wavelength_val = (TextView) findViewById(R.id.wavelength_value);


        LayoutInflater inflator = getLayoutInflater();
        final View view = inflator.inflate(R.layout.dialog, null);
        dialog_header = (TextView) view.findViewById(R.id.header);
        dialog_edidtext = (TextView) view.findViewById(R.id.editText);
        diaog_cancel_button = (Button) view.findViewById(R.id.cancel_button);
        dialog_ok_button = (Button) view.findViewById(R.id.ok_button);
        //  unit = (TextView) view.findViewById(R.id.unit);
        unit_convertion = (Spinner) view.findViewById(R.id.unit_conversion);


        dialog_header.setTypeface(typeface);


        dialog_custom = new Dialog(Frequencyconverter.this);
        dialog_custom.setCancelable(true);
        dialog_custom.setContentView(view);

        addListenerOnSpinnerItemSelection();

        addListenerOnSpinnerItemSelectionUnit();

        frequency_rel.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {

                                                 // spinner1 = (Spinner) findViewById(R.id.spinner_quantity);
                                                 List<String> list = new ArrayList<String>();
                                                 list.add("Hz");
                                                 list.add("µHz");
                                                 list.add("mHz");


                                                 list.add("kHz");
                                                 list.add("MHz");
                                                 list.add("GHz");
                                                 ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Frequencyconverter.this
                                                         , android.R.layout.simple_spinner_item, list);
                                                 dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                                 unit_convertion.setAdapter(dataAdapter);


                                                 // unit.setText("hz");
                                                 dialog_header.setText("Insert the value of Frequency");
                                                 dialog_custom.show();
                                                 diaog_cancel_button.setOnClickListener(new View.OnClickListener() {
                                                     @Override
                                                     public void onClick(View v) {
                                                         dialog_custom.dismiss();
                                                     }
                                                 });


                                                 dialog_ok_button.setOnClickListener(new View.OnClickListener() {
                                                     @Override
                                                     public void onClick(View v) {

                                                         collection = "";
                                                         // fre = dialog_edidtext.getText().toString();

                                                         fre = dialog_edidtext.getText().toString();
                                                         int length = fre.length();
                                                         if (fre.contains(".")) {

                                                             for (int i = 0; fre.charAt(i) != '.'; i++) {
                                                                 collection += fre.charAt(i);
                                                             }

//                                                             Toast t=Toast.makeText(Frequencyconverter.this,collection.length()+"",Toast.LENGTH_SHORT);
//                                                             t.show();
                                                             if (UnitOnItemSelectedListener.unit_value == "Hz") {
                                                                 if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("Hz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (collection.length() == 4 || collection.length() == 5 || collection.length() == 6) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("kHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() == 7 || collection.length() == 8 || collection.length() == 9) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000;
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() == 10 || collection.length() == 11 || collection.length() == 12) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000000;
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }


                                                             } else if (UnitOnItemSelectedListener.unit_value == "mHz") {

                                                                 if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("mHz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (collection.length() == 4 || collection.length() == 5 || collection.length() == 6) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("Hz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() == 7 || collection.length() == 8 || collection.length() == 9) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000;
                                                                     fre_unit.setText("kHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() == 10 || collection.length() == 11 || collection.length() == 12) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000000;
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() >= 13) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / (Math.pow(10, 12));
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }


                                                             } else if (UnitOnItemSelectedListener.unit_value == "μHz") {

                                                                 if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("μHz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (collection.length() == 4 || collection.length() == 5 || collection.length() == 6) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("mHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() == 7 || collection.length() == 8 || collection.length() == 9) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000;
                                                                     fre_unit.setText("Hz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() == 10 || collection.length() == 11 || collection.length() == 12) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000000;
                                                                     fre_unit.setText("kHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() >= 13 || collection.length() >= 14 || collection.length() >= 15) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / (Math.pow(10, 12));
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() >= 16) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / (Math.pow(10, 15));
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }


                                                             } else if (UnitOnItemSelectedListener.unit_value == "kHz") {


                                                                 if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("kHz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (collection.length() == 4 || collection.length() == 5 || collection.length() == 6) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (collection.length() >= 7) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000;
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }

//


                                                             } else if (UnitOnItemSelectedListener.unit_value == "MHz") {

                                                                 if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (collection.length() >= 4) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }

                                                             }


//
                                                         } else {
                                                             if (UnitOnItemSelectedListener.unit_value == "Hz") {
                                                                 if (length == 1 || length == 2 || length == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("Hz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (length == 4 || length == 5 || length == 6) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("kHz");
                                                                     frequency_val.setText(fre_double.toString());
//                                                                     if(length == 4) {
//                                                                         frequency_val.setText(fre_double.toString().charAt(0) + "." + fre_double.toString().charAt(1) + fre_double.toString().charAt(2));
//                                                                     }
//                                                                     if(length == 5) {
//                                                                         frequency_val.setText(fre_double.toString().charAt(0) + fre_double.toString().charAt(1) + "." + fre_double.toString().charAt(2));
//                                                                     }
//                                                                     if(length == 6) {
//                                                                         frequency_val.setText(fre_double.toString().charAt(0) + fre_double.toString().charAt(1) + fre_double.toString().charAt(2) + "." + fre_double.toString().charAt(3));
//                                                                     }


                                                                 } else if (length == 7 || length == 8 || length == 9) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000;
                                                                     fre_unit.setText("MHz");
//                                                                     if(length == 7)
//                                                                         frequency_val.setText(fre_double.toString().charAt(0) + "." + fre_double.toString().charAt(1)+fre_double.toString().charAt(2));
//
//                                                                     if(length == 8)
//                                                                         frequency_val.setText(fre_double.toString().charAt(0)  + fre_double.toString().charAt(1)+ "."+fre_double.toString().charAt(2));
//
//                                                                     if(length == 9)
//                                                                         frequency_val.setText(fre_double.toString().charAt(0) + fre_double.toString().charAt(1)+fre_double.toString().charAt(2)+ "." + fre_double.toString().charAt(3));

                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length == 10 || length == 11 || length == 12) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000000;
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }


                                                             } else if (UnitOnItemSelectedListener.unit_value == "mHz") {

                                                                 if (length == 1 || length == 2 || length == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("mHz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (length == 4 || length == 5 || length == 6) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("Hz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length == 7 || length == 8 || length == 9) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000;
                                                                     fre_unit.setText("kHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length == 10 || length == 11 || length == 12) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000000;
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length >= 13) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / (Math.pow(10, 12));
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }


                                                             } else if (UnitOnItemSelectedListener.unit_value == "μHz") {

                                                                 if (length == 1 || length == 2 || length == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("μHz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (length == 4 || length == 5 || length == 6) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("mHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length == 7 || length == 8 || length == 9) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000;
                                                                     fre_unit.setText("Hz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length == 10 || length == 11 || length == 12) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000000;
                                                                     fre_unit.setText("kHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length >= 13 || length >= 14 || length >= 15) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / (Math.pow(10, 12));
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length >= 16) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / (Math.pow(10, 15));
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }


                                                             } else if (UnitOnItemSelectedListener.unit_value == "kHz") {


                                                                 if (length == 1 || length == 2 || length == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("kHz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (length == 4 || length == 5 || length == 6) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 } else if (length >= 7) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000000;
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }

//


                                                             } else if (UnitOnItemSelectedListener.unit_value == "MHz") {

                                                                 if (length == 1 || length == 2 || length == 3) {

                                                                     fre = dialog_edidtext.getText().toString();
                                                                     fre_unit.setText("MHz");
                                                                     frequency_val.setText(fre.toString());
                                                                 } else if (length >= 4) {
                                                                     fre_double = Double.parseDouble(fre);
                                                                     fre_double = fre_double / 1000;
                                                                     fre_unit.setText("GHz");
                                                                     frequency_val.setText(fre_double.toString());

                                                                 }

                                                             }
                                                         }

                                                         //else if (unit_value == "s" || unit_value == "ms" || unit_value == "μs" || unit_value == "ns" || unit_value == "ps") {


//                                                         if (fre.length()==3 ||)
//                                                         {
//
//                                                         }

                                                         // per = period_val.getText().toString();
                                                         check = 0;
                                                         for (int i = 0; i < fre.length(); i++) {
                                                             if (fre.charAt(i) == '.') {
                                                                 check++;
                                                             }
                                                         }
                                                         if (fre.equalsIgnoreCase("")) {
                                                             t.show();
                                                         } else if (check > 1) {
                                                             t.show();
                                                         } else if (fre.equalsIgnoreCase(".")) {
                                                             t.show();
                                                         } else {

                                                             wavevelocity = wavvelocity_val.getText().toString();
                                                             fre_double = Double.parseDouble(fre);
                                                             // per_double = Double.parseDouble(per);
                                                             wavevelocity_double = Double.parseDouble(wavevelocity);
                                                             OUTPUT_PERIOD = 1 / fre_double;

                                                             OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;


                                                             s1 = format.format(OUTPUT_PERIOD);

                                                             if (s1.charAt(0) == '.') {
                                                                 period_val.setText("0" + s1.toString());
                                                             } else {
                                                                 period_val.setText(s1.toString());
                                                             }

                                                             if (format.format(OUTPUT_WAVELENGTH).toString().charAt(0) == '.') {
                                                                 wavelength_val.setText("0" + format.format(OUTPUT_WAVELENGTH).toString());
                                                             } else {
                                                                 wavelength_val.setText(format.format(OUTPUT_WAVELENGTH).toString());
                                                             }
                                                             // t=1/f;

                                                             wavevelocity = wavelength_val.getText().toString();

                                                             wavevelocity_double = Double.parseDouble(wavevelocity);
                                                             first_sub = wavevelocity_double / 2;
                                                             if (format.format(first_sub).toString().charAt(0) == '.') {
                                                                 lamda2_value.setText("0" + format.format(first_sub).toString());
                                                             } else {
                                                                 lamda2_value.setText(format.format(first_sub).toString());
                                                             }
                                                             first_two_sub = first_sub - (wavevelocity_double / 4);

                                                             if (format.format(first_two_sub).toString().charAt(0) == '.') {
                                                                 lamda4_value.setText("0" + format.format(first_two_sub).toString());
                                                             } else {
                                                                 lamda4_value.setText(format.format(first_two_sub).toString());
                                                             }

                                                             final_sub = first_two_sub - (wavevelocity_double / 8);

                                                             if (format.format(final_sub).toString().charAt(0) == '.') {
                                                                 lamda8_value.setText("0" + format.format(final_sub).toString());
                                                             } else {
                                                                 lamda8_value.setText(format.format(final_sub).toString());
                                                             }

                                                             //   frequency_val.setText(fre.toString());
                                                         }
                                                         dialog_custom.dismiss();

                                                     }
                                                 });


                                             }
                                         }

        );

        wavvelocity_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<String> list = new ArrayList<String>();
                list.add("m/s");
                list.add("mm/s");
                list.add("km/s");

                list.add("Mm/s");
                list.add("µm/s");
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Frequencyconverter.this
                        , android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unit_convertion.setAdapter(dataAdapter);
                //  unit.setText("m/s");
                dialog_header.setText("Insert the value of wave Velocity");
                dialog_custom.show();
                diaog_cancel_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog_custom.dismiss();
                    }
                });


                dialog_ok_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        //fre = frequency_val.getText().toString();
                        //per = period_val.getText().toString();
                        wavevelocity = dialog_edidtext.getText().toString();

                        //   wavevelocity = dialog_edidtext.getText().toString();

                        collection = "";
                        fre="";
                        int length = wavevelocity.length();


                        fre = dialog_edidtext.getText().toString();
                        length = fre.length();

                        if (fre.contains(".")) {

                            for (int i = 0; fre.charAt(i) != '.'; i++) {
                                collection += fre.charAt(i);
                            }

                            if (UnitOnItemSelectedListener.unit_value == "m/s") {
                                if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("m/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (collection.length() == 4 || collection.length() == 5 || collection.length() == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("km/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() == 7 || collection.length() == 8 || collection.length() == 9) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() == 10 || collection.length() == 11 || collection.length() == 12) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000000;
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }


                            } else if (UnitOnItemSelectedListener.unit_value == "mm/s") {

                                if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("mm/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (collection.length() == 4 || collection.length() == 5 || collection.length() == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("m/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() == 7 || collection.length() == 8 || collection.length() == 9) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("km/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() == 10 || collection.length() == 11 || collection.length() == 12) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000000;
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() >= 13) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / (Math.pow(10, 12));
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }


                            } else if (UnitOnItemSelectedListener.unit_value == "km/s") {

                                if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("μm/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (collection.length() == 4 || collection.length() == 5 || collection.length() == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() == 7 || collection.length() == 8 || collection.length() == 9) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("m/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() == 10 || collection.length() == 11 || collection.length() == 12) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000000;
                                    wavevelocity_unit.setText("km/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() >= 13 || collection.length() >= 14 || collection.length() >= 15) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / (Math.pow(10, 12));
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() >= 16) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / (Math.pow(10, 15));
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }


                            } else if (UnitOnItemSelectedListener.unit_value == "Mm/s") {


                                if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("km/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (collection.length() == 4 || collection.length() == 5 || collection.length() == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (collection.length() >= 7) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }

//


                            } else if (UnitOnItemSelectedListener.unit_value == "µm/s") {

                                if (collection.length() == 1 || collection.length() == 2 || collection.length() == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (collection.length() >= 4) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }

                            }
                        } else {


                            if (UnitOnItemSelectedListener.unit_value == "m/s") {
                                if (length == 1 || length == 2 || length == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("m/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (length == 4 || length == 5 || length == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("km/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (length == 7 || length == 8 || length == 9) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (length >= 10 ) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000000;
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }


                            } else if (UnitOnItemSelectedListener.unit_value == "mm/s") {

                                if (length == 1 || length == 2 || length == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("mm/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (length == 4 || length == 5 || length == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("m/s");
                                    frequency_val.setText(fre_double.toString());

                                } else if (length == 7 || length == 8 || length == 9) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("km/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (length == 10 || length == 11 || length == 12) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000000;
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (length >= 13) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / (Math.pow(10, 12));
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }


                            } else if (UnitOnItemSelectedListener.unit_value == "km/s") {

                                if (length == 1 || length == 2 || length == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("km/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (length == 4 || length == 5 || length == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (length >= 7) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                               }
// else if (length == 10 || length == 11 || length == 12) {
//                                    fre_double = Double.parseDouble(fre);
//                                    fre_double = fre_double / 1000000000;
//                                    wavevelocity_unit.setText("km/s");
//                                    wavvelocity_val.setText(fre_double.toString());
//
//                                } else if (length >= 13 || length >= 14 || length >= 15) {
//                                    fre_double = Double.parseDouble(fre);
//                                    fre_double = fre_double / (Math.pow(10, 12));
//                                    wavevelocity_unit.setText("Mm/s");
//                                    wavvelocity_val.setText(fre_double.toString());
//
//                                } else if (length >= 16) {
//                                    fre_double = Double.parseDouble(fre);
//                                    fre_double = fre_double / (Math.pow(10, 15));
//                                    wavevelocity_unit.setText("Gm/s");
//                                    wavvelocity_val.setText(fre_double.toString());
//
//                                }


                            } else if (UnitOnItemSelectedListener.unit_value == "Mm/s") {


                                if (length == 1 || length == 2 || length == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (length == 4 || length == 5 || length == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                } else if (length >= 7) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }

//


                            } else if (UnitOnItemSelectedListener.unit_value == "µm/s") {

                                if (length == 1 || length == 2 || length == 3) {

                                    fre = dialog_edidtext.getText().toString();
                                    wavevelocity_unit.setText("µm/s");
                                    wavvelocity_val.setText(fre.toString());
                                } else if (length ==4 || length == 5 || length == 6) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000;
                                    wavevelocity_unit.setText("mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }

                                else if (length ==7|| length == 8 || length == 9) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000;
                                    wavevelocity_unit.setText("m/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }


                                else if (length ==10|| length == 11 || length == 12) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / 1000000000;
                                    wavevelocity_unit.setText("km/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }
                                else if (length ==13|| length == 14 || length == 15) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / (Math.pow(10, 12));
                                    wavevelocity_unit.setText("Mm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }


                                else if (length >15) {
                                    fre_double = Double.parseDouble(fre);
                                    fre_double = fre_double / (Math.pow(10, 15));
                                    wavevelocity_unit.setText("Gm/s");
                                    wavvelocity_val.setText(fre_double.toString());

                                }
                            }
                        }

                        // fre_double = Double.parseDouble(fre);
                        //per_double = Double.parseDouble(per);
                        //wavevelocity_double = Double.parseDouble(wavevelocity);

                        check = 0;
                        for (int i = 0; i < wavevelocity.length(); i++) {
                            if (wavevelocity.charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (wavevelocity.equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (wavevelocity.equalsIgnoreCase(".")) {
                            t.show();
                        } else {

                            fre = frequency_val.getText().toString();
                            per = period_val.getText().toString();
                            fre_double = Double.parseDouble(fre);
                            per_double = Double.parseDouble(per);
                            wavevelocity_double = Double.parseDouble(wavevelocity);
                            OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;

                            //  period_val.setText(OUTPUT_PERIOD.toString());
                            if (format.format(OUTPUT_WAVELENGTH).toString().charAt(0) == '.') {

                                wavelength_val.setText("0" + format.format(OUTPUT_WAVELENGTH).toString());
                            } else {
                                wavelength_val.setText(format.format(OUTPUT_WAVELENGTH).toString());
                            }
                            // t=1/f;


                            wavevelocity = dialog_edidtext.getText().toString();

                            wavevelocity_double = Double.parseDouble(wavevelocity);
                            first_sub = wavevelocity_double / 2;

                            if (format.format(first_sub).toString().charAt(0) == '.') {
                                lamda2_value.setText("0" + format.format(first_sub).toString());
                            } else {
                                lamda2_value.setText(format.format(first_sub).toString());
                            }
                            first_two_sub = first_sub - (wavevelocity_double / 4);

                            if (format.format(first_two_sub).toString().charAt(0) == '.') {
                                lamda4_value.setText("0" + format.format(first_two_sub).toString());

                            } else {
                                lamda4_value.setText(format.format(first_two_sub).toString());
                            }

                            final_sub = first_two_sub - (wavevelocity_double / 8);


                            if (format.format(final_sub).toString().charAt(0) == '.') {
                                lamda8_value.setText("0" + format.format(final_sub).toString());
                            } else {
                                lamda8_value.setText(format.format(final_sub).toString());
                            }

                            // wavvelocity_val.setText(wavevelocity.toString());
                        }
                        dialog_custom.dismiss();

                    }
                });


            }
        });
        period_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<String> list = new ArrayList<String>();
                list.add("s");
                list.add("ps");
                list.add("ns");
                list.add("µs");

                list.add("ms");

                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Frequencyconverter.this
                        , android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unit_convertion.setAdapter(dataAdapter);


                //     unit.setText("s");
                dialog_header.setText("Insert the value of Period");
                dialog_custom.show();
                diaog_cancel_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog_custom.dismiss();
                    }
                });


                dialog_ok_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //fre = frequency_val.getText().toString();

                        per = dialog_edidtext.getText().toString();

                        // per = dialog_edidtext.getText().toString();


                        // wavevelocity = wavvelocity_val.getText().toString();
                        //wavelength = wavelength_val.getText().toString();

                        //wavevelocity_double = Double.parseDouble(wavevelocity);
                        //wavelength_double = Double.parseDouble(wavelength);
                        // per_double = Double.parseDouble(per);

                        check = 0;
                        for (int i = 0; i < per.length(); i++) {
                            if (per.charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (per.equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (per.equalsIgnoreCase(".")) {
                            t.show();
                        } else {

                            fre = frequency_val.getText().toString();
                            wavevelocity = wavvelocity_val.getText().toString();
                            wavelength = wavelength_val.getText().toString();

                            wavevelocity_double = Double.parseDouble(wavevelocity);
                            wavelength_double = Double.parseDouble(wavelength);
                            per_double = Double.parseDouble(per);
                            OUTPUT_fre = 1 / per_double;
//
//                        OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;
                            if (format.format(OUTPUT_fre).toString().charAt(0) == '.') {
                                frequency_val.setText("0" + format.format(OUTPUT_fre).toString());
                            } else {
                                frequency_val.setText(format.format(OUTPUT_fre).toString());
                            }
                            //  period_val.setText(OUTPUT_PERIOD.toString());
                            // wavelength_val.setText(OUTPUT_WAVELENGTH.toString());
                            // t=1/f;


                            wavevelocity = wavelength_val.getText().toString();

                            wavevelocity_double = Double.parseDouble(wavevelocity);
                            first_sub = wavevelocity_double / 2;

                            if (format.format(first_sub).toString().charAt(0) == '.') {
                                lamda2_value.setText("0" + format.format(first_sub).toString());
                            } else {
                                lamda2_value.setText(format.format(first_sub).toString());
                            }
                            first_two_sub = first_sub - (wavevelocity_double / 4);

                            if (format.format(first_two_sub).toString().charAt(0) == '.') {
                                lamda4_value.setText("0" + format.format(first_two_sub).toString());
                            } else {
                                lamda4_value.setText(format.format(first_two_sub).toString());
                            }

                            final_sub = first_two_sub - (wavevelocity_double / 8);

                            if (format.format(final_sub).toString().charAt(0) == '.') {
                                lamda8_value.setText("0" + format.format(final_sub).toString());
                            } else {
                                lamda8_value.setText(format.format(final_sub).toString());
                            }

                            period_val.setText(per.toString());
                        }
                        dialog_custom.dismiss();

                    }
                });
            }
        });
        wavelength_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<String> list = new ArrayList<String>();
                list.add("m");
                list.add("mm");
                list.add("µm");

                list.add("km");
                list.add("Mm");
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Frequencyconverter.this
                        , android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                unit_convertion.setAdapter(dataAdapter);


                // unit.setText("m");


                dialog_header.setText("Insert the value of Wavelength");
                dialog_custom.show();
                diaog_cancel_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Frequencyconverter.this,
                                "OnClickListener : " +
                                        "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()),
                                Toast.LENGTH_SHORT).show();
                        dialog_custom.dismiss();
                    }
                });


                dialog_ok_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        //fre = frequency_val.getText().toString();
                        //per = period_val.getText().toString();
                        //wavevelocity = wavvelocity_val.getText().toString();


                        wavelength = dialog_edidtext.getText().toString();

                        // wavelength = dialog_edidtext.getText().toString();


                        //fre_double = Double.parseDouble(fre);
                        //per_double = Double.parseDouble(per);
                        //wavevelocity_double = Double.parseDouble(wavevelocity);


                        check = 0;
                        for (int i = 0; i < wavelength.length(); i++) {
                            if (wavelength.charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (wavelength.equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (wavelength.equalsIgnoreCase(".")) {
                            t.show();
                        } else {

                            fre = frequency_val.getText().toString();
                            per = period_val.getText().toString();
                            wavevelocity = wavvelocity_val.getText().toString();

                            fre_double = Double.parseDouble(fre);
                            per_double = Double.parseDouble(per);
                            wavevelocity_double = Double.parseDouble(wavevelocity);
                            OUTPUT_PERIOD = 1 / fre_double;

                            OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;


                            if (format.format(OUTPUT_PERIOD).toString().charAt(0) == '.') {
                                period_val.setText("0" + format.format(OUTPUT_PERIOD).toString());
                            } else {
                                period_val.setText(format.format(OUTPUT_PERIOD).toString());
                            }


                            if (format.format(OUTPUT_WAVELENGTH).toString().charAt(0) == '.') {
                                wavelength_val.setText("0" + format.format(OUTPUT_WAVELENGTH).toString());

                            } else {
                                wavelength_val.setText(format.format(OUTPUT_WAVELENGTH).toString());
                            }
                            // t=1/f;


                            wavevelocity = wavelength_val.getText().toString();

                            wavevelocity_double = Double.parseDouble(wavevelocity);
                            first_sub = wavevelocity_double / 2;


                            if (format.format(first_sub).toString().charAt(0) == '.') {

                                lamda2_value.setText("0" + format.format(first_sub).toString());
                            } else {
                                lamda2_value.setText(format.format(first_sub).toString());
                            }
                            first_two_sub = first_sub - (wavevelocity_double / 4);


                            if (format.format(first_two_sub).toString().charAt(0) == '.') {

                                lamda4_value.setText("0" + format.format(first_two_sub).toString());
                            } else {
                                lamda4_value.setText(format.format(first_two_sub).toString());
                            }

                            final_sub = first_two_sub - (wavevelocity_double / 8);


                            if (format.format(final_sub).toString().charAt(0) == '.') {

                                lamda8_value.setText("0" + format.format(final_sub).toString());
                            } else {
                                lamda8_value.setText(format.format(final_sub).toString());

                            }
                            wavelength_val.setText(wavelength.toString());
                        }
                        dialog_custom.dismiss();

                    }
                });
            }
        });

    }

    public void addItemsOnSpinner2() {

        spinner1 = (Spinner) findViewById(R.id.spinner_quantity);
        List<String> list = new ArrayList<String>();
        list.add("Custom");
        list.add("Light (air)");
        list.add("Light (water)");

        list.add("Sound (air)");
        list.add("Sound (water)");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);


    }

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner_quantity);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
//        Toast.makeText(Frequencyconverter.this,
//                "OnItemSelectedListener : " + CustomOnItemSelectedListener.values+"",
//                Toast.LENGTH_SHORT).show();

        // wavvelocity_val.setText(String.valueOf(CustomOnItemSelectedListener.values));


//
//        wavevelocity = wavvelocity_val.getText().toString();
//
//        fre = frequency_val.getText().toString();
//        per = period_val.getText().toString();
//        fre_double = Double.parseDouble(fre);
//        per_double = Double.parseDouble(per);
//        wavevelocity_double = Double.parseDouble(wavevelocity);
//        OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;
//        wavelength_val.setText(format.format(OUTPUT_WAVELENGTH).toString());


//        if (format.format(OUTPUT_WAVELENGTH).toString().charAt(0) == '.') {
//
//            wavelength_val.setText("0" + format.format(OUTPUT_WAVELENGTH).toString());
//        } else {
        //wavelength_val.setText(format.format(OUTPUT_WAVELENGTH).toString());
        //}
    }


    public void addListenerOnSpinnerItemSelectionUnit() {
        unit_convertion.setOnItemSelectedListener(new UnitOnItemSelectedListener());

    }
}
