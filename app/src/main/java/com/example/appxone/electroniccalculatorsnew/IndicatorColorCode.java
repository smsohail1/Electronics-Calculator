package com.example.appxone.electroniccalculatorsnew;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;

/**
 * Created by APPXONE on 1/28/2016.
 */
public class IndicatorColorCode extends AppCompatActivity {


    RelativeLayout relative;
    ImageView row0_0, row0_1, row0_2, row0_3, row1_0, row1_1, row1_2, row1_3, row2_0, row2_1, row2_2, row2_3, row3_0, row3_1, row3_2, row3_3;
    ImageView row4_0, row4_1, row4_2, row4_3, row5_0, row5_1, row5_3, row6_0, row6_1, row6_2, row6_3, row7_0, row7_1, row7_2, row7_3;
    ImageView row8_0, row8_1, row8_2, row8_3, row9_0, row9_1, row9_2, row9_3, row10_0, row10_1, row10_2, row10_3, row11_0, row11_1, row11_2, row11_3;
    TextView band_value, tolerance;
    // public static TextView row5_2;
    HashMap<String, String> color_Coding_band1 = new HashMap<>();
    public static HashMap<String, String> color_Coding_band3 = new HashMap<>();
    HashMap<String, String> color_Coding_band4 = new HashMap<>();

    HashMap<String, String> standard_20 = new HashMap<>();
    HashMap<String, String> standard_10 = new HashMap<>();
    HashMap<String, String> standard_5 = new HashMap<>();
    HashMap<String, String> standard_2 = new HashMap<>();
    HashMap<String, String> standard_1 = new HashMap<>();
    HashMap<String, String> standard_combine = new HashMap<>();

    public static String color_Value = "5";
    Toast toast;
    String second_band_value = "4";
    public static String third_band_value = "1";

    public static String fourth_band_value = "2%";

    int second_value_int, fourth_value_int;
    ImageView first_band, second_band, third_band, fourth_band, standard_non_standard;
    TextView tolerance1;
    public static TextView combine_values;
    String check = "";

    Long third_value_int;
    TextView header_indicator;

    double third_value_float;
    public static long combine_first_second;

    IndicatorFormat IndicatorFormat;
    Typeface typeface;
    public static String check_zero;
    String publishteId,ad_Id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indicatorcolorcode);



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




        typeface = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTStd-Medium.otf");

        check_zero = "15";
        combine_values = (TextView) findViewById(R.id.combine);
        tolerance1 = (TextView) findViewById(R.id.tolrence1);

        IndicatorFormat = new IndicatorFormat();


        header_indicator = (TextView) findViewById(R.id.header);
        first_band = (ImageView) findViewById(R.id.first_band);
        second_band = (ImageView) findViewById(R.id.second_band);
        third_band = (ImageView) findViewById(R.id.third_band);
        fourth_band = (ImageView) findViewById(R.id.fourth_band);
        header_indicator.setTypeface(typeface);
        //  standard_non_standard = (ImageView) findViewById(standard_non);
        check = color_Value + second_band_value;


        combine_first_second = Long.parseLong(check);


        third_value_float = Double.parseDouble(third_band_value);

        Long myBI = new Long(check);
        Double d = third_value_float;
        BigDecimal bd = new BigDecimal(myBI);
        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
        combine_first_second = Long.valueOf(bd.longValue());


        //third_value_int = Long.parseLong(third_band_value);

//                Integer.parseInt(third_band_value);
        // fourth_value_int = Integer.parseInt(fourth_band_value);

        //  combine_first_second = combine_first_second * third_value_int;

        first_band.setImageResource(R.drawable.green);

        second_band.setImageResource(R.drawable.yellow);

        third_band.setImageResource(R.drawable.black);
        fourth_band.setImageResource(R.drawable.red);

        combine_values.setText(String.valueOf(combine_first_second + " μ"));
        tolerance1.setText(fourth_band_value);


//        combine_first_second =combine_first_second+second_value_int;


        color_Coding_band1.put("black", "0");
        color_Coding_band1.put("brown", "1");
        color_Coding_band1.put("red", "2");
        color_Coding_band1.put("orange", "3");
        color_Coding_band1.put("yellow", "4");
        color_Coding_band1.put("green", "5");
        color_Coding_band1.put("blue", "6");
        color_Coding_band1.put("voilet", "7");
        color_Coding_band1.put("grey", "8");
        color_Coding_band1.put("white", "9");


        //  color_Coding_band1.put("gold", "");
        //color_Coding_band1.put("silver", "");


        color_Coding_band3.put("black", "1");
        color_Coding_band3.put("brown", "10");
        color_Coding_band3.put("red", "100");
        color_Coding_band3.put("orange", "1000");
        color_Coding_band3.put("yellow", "10000");
        color_Coding_band3.put("green", "1");
        color_Coding_band3.put("blue", "1");
        color_Coding_band3.put("voilet", "1");
        color_Coding_band3.put("grey", "1");
        color_Coding_band3.put("white", "1");
        color_Coding_band3.put("gold", "0.1");
        color_Coding_band3.put("silver", "0.01");


        color_Coding_band4.put("black", "20%");
        color_Coding_band4.put("brown", "1%");
        color_Coding_band4.put("red", "2%");
        color_Coding_band4.put("orange", "3%");
        color_Coding_band4.put("yellow", "4%");
        color_Coding_band4.put("green", "");
        color_Coding_band4.put("blue", "");
        color_Coding_band4.put("voilet", "");
        color_Coding_band4.put("grey", "");
        color_Coding_band4.put("white", "");
        color_Coding_band4.put("gold", "5%");
        color_Coding_band4.put("silver", "10%");


        row0_0 = (ImageView) findViewById(R.id.imageView1);
        row0_1 = (ImageView) findViewById(R.id.imageView2);
        row0_2 = (ImageView) findViewById(R.id.imageView3);
        row0_3 = (ImageView) findViewById(R.id.imageView4);

        row1_0 = (ImageView) findViewById(R.id.imageView5);
        row1_1 = (ImageView) findViewById(R.id.imageView6);
        row1_2 = (ImageView) findViewById(R.id.imageView7);
        row1_3 = (ImageView) findViewById(R.id.imageView8);


        row2_0 = (ImageView) findViewById(R.id.imageView9);
        row2_1 = (ImageView) findViewById(R.id.imageView10);
        row2_2 = (ImageView) findViewById(R.id.imageView11);
        row2_3 = (ImageView) findViewById(R.id.imageView12);


        row3_0 = (ImageView) findViewById(R.id.imageView13);
        row3_1 = (ImageView) findViewById(R.id.imageView14);
        row3_2 = (ImageView) findViewById(R.id.imageView15);
        row3_3 = (ImageView) findViewById(R.id.imageView16);


        row4_0 = (ImageView) findViewById(R.id.imageView17);
        row4_1 = (ImageView) findViewById(R.id.imageView18);
        row4_2 = (ImageView) findViewById(R.id.imageView19);
        row4_3 = (ImageView) findViewById(R.id.imageView20);


        row5_0 = (ImageView) findViewById(R.id.imageView21);
        row5_1 = (ImageView) findViewById(R.id.imageView22);
        //row5_2 = (TextView) findViewById(R.id.imageView23);
        row5_3 = (ImageView) findViewById(R.id.imageView24);


        row6_0 = (ImageView) findViewById(R.id.imageView25);
        row6_1 = (ImageView) findViewById(R.id.imageView26);
        row6_2 = (ImageView) findViewById(R.id.imageView27);
        row6_3 = (ImageView) findViewById(R.id.imageView28);


        row7_0 = (ImageView) findViewById(R.id.imageView29);
        row7_1 = (ImageView) findViewById(R.id.imageView30);
        row7_2 = (ImageView) findViewById(R.id.imageView31);
        row7_3 = (ImageView) findViewById(R.id.imageView32);


        row8_0 = (ImageView) findViewById(R.id.imageView33);
        row8_1 = (ImageView) findViewById(R.id.imageView34);
        row8_2 = (ImageView) findViewById(R.id.imageView35);
        row8_3 = (ImageView) findViewById(R.id.imageView36);


        row9_0 = (ImageView) findViewById(R.id.imageView37);
        row9_1 = (ImageView) findViewById(R.id.imageView38);
        row9_2 = (ImageView) findViewById(R.id.imageView39);
        row9_3 = (ImageView) findViewById(R.id.imageView40);


        row10_0 = (ImageView) findViewById(R.id.imageView41);
        row10_1 = (ImageView) findViewById(R.id.imageView42);
        row10_2 = (ImageView) findViewById(R.id.imageView43);
        row10_3 = (ImageView) findViewById(R.id.imageView44);


        row11_0 = (ImageView) findViewById(R.id.imageView45);
        row11_1 = (ImageView) findViewById(R.id.imageView46);
        row11_2 = (ImageView) findViewById(R.id.imageView47);
        row11_3 = (ImageView) findViewById(R.id.imageView48);


        row0_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check_zero = "0";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("black")) {
//                        second_band_value = entry1.getValue();
//                        check = color_Value + second_band_value;
//
//                        combine_first_second = Long.parseLong(check);
//
//
//                        third_value_float = Double.parseDouble(third_band_value);
//
//                        Long myBI = new Long(check);
//                        Double d = third_value_float;
//                        BigDecimal bd = new BigDecimal(myBI);
//                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
//                        combine_first_second = Long.valueOf(bd.longValue());
//
////                        third_value_int = Long.parseLong(third_band_value);
////
////                        combine_first_second = combine_first_second * third_value_int;
//
//
//                        tolerance1.setText(fourth_band_value);
//
//                        //combine_values.setText(String.valueOf(combine_first_second));
//
//                        second_band.setImageResource(R.drawable.black);
//
//
//                        IndicatorFormat.format_check();


                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());
//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));

                        first_band.setImageResource(R.drawable.black);


                        IndicatorFormat.format_check();


                    }
                }
            }
        });


        row0_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "0";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("black")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));

                        second_band.setImageResource(R.drawable.black);


                        IndicatorFormat.format_check();


                    }
                }
            }
        });


        row1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("brown")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));

                        second_band.setImageResource(R.drawable.brown);


                        IndicatorFormat.format_check();


                    }
                }
            }
        });


        row2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("red")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());


//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        second_band.setImageResource(R.drawable.red);


                        IndicatorFormat.format_check();


                    }
                }
            }
        });


        row3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("orange")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());
//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        second_band.setImageResource(R.drawable.orange);


                        IndicatorFormat.format_check();

                    }
                }
            }
        });

        row4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("yellow")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        second_band.setImageResource(R.drawable.yellow);


                        IndicatorFormat.format_check();

                    }
                }
            }
        });


        row5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("green")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        second_band.setImageResource(R.drawable.green);


                        IndicatorFormat.format_check();

                    }
                }
            }
        });


        row6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("blue")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());


//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        second_band.setImageResource(R.drawable.blue);


                        IndicatorFormat.format_check();


                    }
                }
            }
        });


        row7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("voilet")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        second_band.setImageResource(R.drawable.voilet);


                        IndicatorFormat.format_check();


                    }
                }
            }
        });


        row8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("grey")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

//                        combine_first_second =  Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());


                        // third_value_int = Long.parseLong(third_band_value);


                        // combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        second_band.setImageResource(R.drawable.grey);


                        IndicatorFormat.format_check();


                    }
                }
            }
        });


        row9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_zero = "15";
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("white")) {
                        second_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());


//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        second_band.setImageResource(R.drawable.white);


                        IndicatorFormat.format_check();

                    }
                }
            }
        });


        row0_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("black")) {
                        third_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//
//                        combine_first_second = combine_first_second * third_value_int;


                        //combine_values.setText(String.valueOf(combine_first_second));


                        third_band.setImageResource(R.drawable.black);

                        tolerance1.setText(fourth_band_value);


                        IndicatorFormat.format_check();
                    }
                }


            }
        });


        row1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("brown")) {
                        third_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());
//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        //combine_values.setText(String.valueOf(combine_first_second));


                        third_band.setImageResource(R.drawable.brown);

                        tolerance1.setText(fourth_band_value);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });


        row2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("red")) {
                        third_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        //combine_values.setText(String.valueOf(combine_first_second));


                        third_band.setImageResource(R.drawable.red);

                        tolerance1.setText(fourth_band_value);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });


        row3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("orange")) {
                        third_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());
//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        //combine_values.setText(String.valueOf(combine_first_second));


                        third_band.setImageResource(R.drawable.orange);

                        tolerance1.setText(fourth_band_value);


                        IndicatorFormat.format_check();

                    }
                }


            }
        });


        row4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("yellow")) {
                        third_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//
//                        combine_first_second = combine_first_second * third_value_int;
//


                        //combine_values.setText(String.valueOf(combine_first_second));


                        third_band.setImageResource(R.drawable.yellow);

                        tolerance1.setText(fourth_band_value);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });


//        row5_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
//                    if (entry1.getKey().equalsIgnoreCase("green")) {
//                        third_band_value = entry1.getValue();
//                        check = color_Value + second_band_value;
//
//                        combine_first_second = Long.parseLong(check);
//
//
//                        third_value_float = Double.parseDouble(third_band_value);
//
//                        Long myBI = new Long(check);
//                        Double d = third_value_float;
//                        BigDecimal bd = new BigDecimal(myBI);
//                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
//                        combine_first_second = Long.valueOf(bd.longValue());
//
////                        third_value_int = Long.parseLong(third_band_value);
////                        combine_first_second = combine_first_second * third_value_int;
//
//
//                        //combine_values.setText(String.valueOf(combine_first_second));
//
//
//                        third_band.setImageResource(R.drawable.green);
//
//                        tolerance1.setText(fourth_band_value);
//
//
//                        IndicatorFormat.format_check();
//
//
//                    }
//                }
//
//
//            }
//        });


//        row6_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
//                    if (entry1.getKey().equalsIgnoreCase("blue")) {
//                        third_band_value = entry1.getValue();
//                        check = color_Value + second_band_value;
//
//                        combine_first_second = Long.parseLong(check);
//
//
//                        third_value_float = Double.parseDouble(third_band_value);
//
//                        Long myBI = new Long(check);
//                        Double d = third_value_float;
//                        BigDecimal bd = new BigDecimal(myBI);
//                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
//                        combine_first_second = Long.valueOf(bd.longValue());
////                        third_value_int = Long.parseLong(third_band_value);
////                        combine_first_second = combine_first_second * third_value_int;
//
//
//                        //combine_values.setText(String.valueOf(combine_first_second));
//
//
//                        third_band.setImageResource(R.drawable.blue);
//
//                        tolerance1.setText(fourth_band_value);
//
//
//                        IndicatorFormat.format_check();
//
//
//                    }
//                }
//
//
//            }
//        });


//        row7_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
//                    if (entry1.getKey().equalsIgnoreCase("voilet")) {
//                        third_band_value = entry1.getValue();
//                        check = color_Value + second_band_value;
//
//                        combine_first_second = Long.parseLong(check);
//
//                        third_value_float = Double.parseDouble(third_band_value);
//
//                        Long myBI = new Long(check);
//                        Double d = third_value_float;
//                        BigDecimal bd = new BigDecimal(myBI);
//                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
//                        combine_first_second = Long.valueOf(bd.longValue());
////                        third_value_int = Long.parseLong(third_band_value);
////                        combine_first_second = combine_first_second * third_value_int;
//
//
//                        //combine_values.setText(String.valueOf(combine_first_second));
//
//
//                        third_band.setImageResource(R.drawable.voilet);
//
//                        tolerance1.setText(fourth_band_value);
//
//
//                        IndicatorFormat.format_check();
//                    }
//                }
//
//
//            }
//        });


//        row8_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
//                    if (entry1.getKey().equalsIgnoreCase("grey")) {
//                        third_band_value = entry1.getValue();
//                        check = color_Value + second_band_value;
//
//                        combine_first_second = Long.parseLong(check);
//
//                        third_value_float = Double.parseDouble(third_band_value);
//
//                        Long myBI = new Long(check);
//                        Double d = third_value_float;
//                        BigDecimal bd = new BigDecimal(myBI);
//                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
//                        combine_first_second = Long.valueOf(bd.longValue());
////                        third_value_int = Long.parseLong(third_band_value);
////                        combine_first_second = combine_first_second * third_value_int;
//
//
//                        //combine_values.setText(String.valueOf(combine_first_second));
//
//
//                        third_band.setImageResource(R.drawable.grey);
//
//                        tolerance1.setText(fourth_band_value);
//
//
//                        IndicatorFormat.format_check();
//
//                    }
//                }
//
//
//            }
//        });


//        row9_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
//                    if (entry1.getKey().equalsIgnoreCase("white")) {
//                        third_band_value = entry1.getValue();
//                        check = color_Value + second_band_value;
//
//                        combine_first_second = Long.parseLong(check);
//
//                        third_value_float = Double.parseDouble(third_band_value);
//
//                        Long myBI = new Long(check);
//                        Double d = third_value_float;
//                        BigDecimal bd = new BigDecimal(myBI);
//                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
//                        combine_first_second = Long.valueOf(bd.longValue());
////                        third_value_int = Long.parseLong(third_band_value);
////                        combine_first_second = combine_first_second * third_value_int;
//
//
//                        //combine_values.setText(String.valueOf(combine_first_second));
//
//
//                        third_band.setImageResource(R.drawable.white);
//
//                        tolerance1.setText(fourth_band_value);
//
//
//                        IndicatorFormat.format_check();
//
//                    }
//                }
//
//
//            }
//        });

        row10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("gold")) {
                        third_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        //   third_value_float =Long.parseLong(third_band_value);


                        third_value_float = Double.parseDouble(third_band_value); //Long.parseLong(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

                        // third_value_int =(long)third_value_float;
                        //  combine_first_second = combine_first_second * third_value_int;

                        //combine_first_second = combine_first_second * third_value_float;


                        third_band.setImageResource(R.drawable.gold);

                        tolerance1.setText(fourth_band_value);


                    }
                }

                IndicatorFormat.format_check();

            }
        });


        row11_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("silver")) {
                        third_band_value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);
                        //Long.parseLong(third_band_value);

                        //combine_first_second=  Math.round((double)(combine_first_second * third_value_float));
                        //third_value_int =(long)third_value_float;
                        // combine_first_second = combine_first_second * third_value_int;


                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());


                        //combine_values.setText(String.valueOf(combine_first_second));


                        third_band.setImageResource(R.drawable.silver);

                        tolerance1.setText(fourth_band_value);


                        IndicatorFormat.format_check();

                    }
                }


            }
        });


        row0_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "20%";
                tolerance1.setText(fourth_band_value);
                fourth_band.setImageResource(R.drawable.black);


            }
        });

        row1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "1%";
                tolerance1.setText(fourth_band_value);
                fourth_band.setImageResource(R.drawable.brown);


            }
        });


        row2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "2%";
                tolerance1.setText(fourth_band_value);
                fourth_band.setImageResource(R.drawable.red);


            }
        });

        row3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "3%";
                tolerance1.setText(fourth_band_value);
                fourth_band.setImageResource(R.drawable.orange);


            }
        });


        row4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "4%";
                tolerance1.setText(fourth_band_value);
                fourth_band.setImageResource(R.drawable.yellow);


            }
        });
//        row5_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                fourth_band_value = "0.5%";
//                tolerance1.setText(fourth_band_value);
//
//                fourth_band.setImageResource(R.drawable.green);
//
//
//            }
//        });


//        row6_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                fourth_band_value = "0.25%";
//                tolerance1.setText(fourth_band_value);
//
//                fourth_band.setImageResource(R.drawable.blue);
//
//
//            }
//        });


//        row7_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                fourth_band_value = "0.1%";
//                tolerance1.setText(fourth_band_value);
//
//                fourth_band.setImageResource(R.drawable.voilet);
//
//
//            }
//        });

//        row8_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                fourth_band_value = "0.05%";
//                tolerance1.setText(fourth_band_value);
//                fourth_band.setImageResource(R.drawable.grey);
//
//
//            }
//        });


        row10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "5%";
                tolerance1.setText(fourth_band_value);

                fourth_band.setImageResource(R.drawable.gold);


            }
        });


        row11_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "10%";
                tolerance1.setText(fourth_band_value);

                //  tolerance1.setText(String.valueOf(combine_first_second));

                fourth_band.setImageResource(R.drawable.silver);


            }
        });


        row1_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("brown")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());
//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.brown);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });


        row2_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("red")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;
//

                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.red);


                        IndicatorFormat.format_check();

                    }
                }


            }
        });


        row3_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("orange")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());
//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.orange);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });

        row4_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("yellow")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.yellow);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });

        row5_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("green")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());
//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.green);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });


        row6_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("blue")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.blue);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });


        row7_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("voilet")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);


                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());
//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.voilet);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });


        row8_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("grey")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.grey);


                        IndicatorFormat.format_check();


                    }
                }


            }
        });


        row9_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Map.Entry<String, String> entry1 : color_Coding_band1.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("white")) {
                        color_Value = entry1.getValue();
                        check = color_Value + second_band_value;

                        combine_first_second = Long.parseLong(check);

                        third_value_float = Double.parseDouble(third_band_value);

                        Long myBI = new Long(check);
                        Double d = third_value_float;
                        BigDecimal bd = new BigDecimal(myBI);
                        BigDecimal result = bd.multiply(BigDecimal.valueOf(d));
                        combine_first_second = Long.valueOf(bd.longValue());

//                        third_value_int = Long.parseLong(third_band_value);
//                        combine_first_second = combine_first_second * third_value_int;


                        tolerance1.setText(fourth_band_value);

                        //combine_values.setText(String.valueOf(combine_first_second));
                        first_band.setImageResource(R.drawable.white);


                        IndicatorFormat.format_check();

                    }
                }

            }
        });


    }
}
