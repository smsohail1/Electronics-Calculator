package com.example.appxone.electroniccalculatorsnew;

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

import static com.example.appxone.electroniccalculatorsnew.R.id.standard_non;

//
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;

public class ResistorColorCode extends AppCompatActivity {

    RelativeLayout relative;
    ImageView row0_0, row0_1, row0_2, row0_3, row1_0, row1_1, row1_2, row1_3, row2_0, row2_1, row2_2, row2_3, row3_0, row3_1, row3_2, row3_3;
    ImageView row4_0, row4_1, row4_2, row4_3, row5_0, row5_1, row5_2, row5_3, row6_0, row6_1, row6_2, row6_3, row7_0, row7_1, row7_2, row7_3;
    ImageView row8_0, row8_1, row8_2, row8_3, row9_0, row9_1, row9_2, row9_3, row10_0, row10_1, row10_2, row10_3, row11_0, row11_1, row11_2, row11_3;
    TextView band_value, tolerance;
    HashMap<String, String> color_Coding_band1 = new HashMap<>();
    public static HashMap<String, String> color_Coding_band3 = new HashMap<>();
    HashMap<String, String> color_Coding_band4 = new HashMap<>();

    HashMap<String, String> standard_20 = new HashMap<>();
    HashMap<String, String> standard_10 = new HashMap<>();
    HashMap<String, String> standard_5 = new HashMap<>();
    HashMap<String, String> standard_2 = new HashMap<>();
    HashMap<String, String> standard_1 = new HashMap<>();
    HashMap<String, String> standard_combine = new HashMap<>();

    String color_Value = "5";
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


    double third_value_float;
    public static long combine_first_second;

    ResisitorFormat ResisitorFormat;
    String publishteId,ad_Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resistorlcolorcode);



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

//first_value_int=1;
//        second_value_int=1;
//        third_value_int=1;
//        fourth_value_int=10;

//        AdView mAdView = (AdView) findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);


        combine_values = (TextView) findViewById(R.id.combine);
        tolerance1 = (TextView) findViewById(R.id.tolrence1);

        ResisitorFormat = new ResisitorFormat();

        first_band = (ImageView) findViewById(R.id.first_band);
        second_band = (ImageView) findViewById(R.id.second_band);
        third_band = (ImageView) findViewById(R.id.third_band);
        fourth_band = (ImageView) findViewById(R.id.fourth_band);
        standard_non_standard = (ImageView) findViewById(standard_non);
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

        combine_values.setText(String.valueOf(combine_first_second + " "));
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
        color_Coding_band3.put("green", "100000");
        color_Coding_band3.put("blue", "1000000");
        color_Coding_band3.put("voilet", "10000000");
        color_Coding_band3.put("grey", "100000000");
        color_Coding_band3.put("white", "1000000000");
        color_Coding_band3.put("gold", "0.1");
        color_Coding_band3.put("silver", "0.01");


        color_Coding_band4.put("black", "");
        color_Coding_band4.put("brown", "1%");
        color_Coding_band4.put("red", "2%");
        color_Coding_band4.put("orange", "");
        color_Coding_band4.put("yellow", "");
        color_Coding_band4.put("green", "0.5%");
        color_Coding_band4.put("blue", "0.25%");
        color_Coding_band4.put("voilet", "0.1%");
        color_Coding_band4.put("grey", "");
        color_Coding_band4.put("white", "");
        color_Coding_band4.put("gold", "5%");
        color_Coding_band4.put("silver", "10%");


        standard_20.put("1", "");

        standard_20.put("10", "");

        standard_20.put("100", "");

        standard_20.put("1000", "");
        standard_20.put("10000", "");
        standard_20.put("100000", "");
        standard_20.put("1000000", "");
        standard_20.put("1.5", "");
        standard_20.put("15", "");
        standard_20.put("150", "");
        standard_20.put("15000", "");
        standard_20.put("150000", "");
        standard_20.put("1500000", "");

        standard_20.put("2.2", "");
        standard_20.put("22", "");
        standard_20.put("220", "");
        standard_20.put("2200", "");
        standard_20.put("22000", "");
        standard_20.put("220000", "");
        standard_20.put("2200000", "");


        standard_20.put("3.3", "");
        standard_20.put("33", "");
        standard_20.put("330", "");
        standard_20.put("3300", "");
        standard_20.put("33000", "");
        standard_20.put("330000", "");
        standard_20.put("3300000", "");

        standard_20.put("4.7", "");
        standard_20.put("47", "");
        standard_20.put("470", "");
        standard_20.put("4700", "");
        standard_20.put("47000", "");
        standard_20.put("470000", "");
        standard_20.put("4700000", "");


        standard_20.put("6.8", "");
        standard_20.put("68", "");
        standard_20.put("680", "");
        standard_20.put("6800", "");
        standard_20.put("68000", "");
        standard_20.put("680000", "");
        standard_20.put("6800000", "");


        standard_10.put("1", "");
        standard_10.put("10", "");
        standard_10.put("100", "");
        standard_10.put("1000", "");
        standard_10.put("10000", "");
        standard_10.put("100000", "");
        standard_10.put("1000000", "");


        standard_10.put("1.2", "");
        standard_10.put("12", "");
        standard_10.put("120", "");
        standard_10.put("1200", "");
        standard_10.put("12000", "");
        standard_10.put("120000", "");
        standard_10.put("1200000", "");

        standard_10.put("1.5", "");
        standard_10.put("15", "");
        standard_10.put("150", "");
        standard_10.put("1500", "");
        standard_10.put("15000", "");
        standard_10.put("150000", "");
        standard_10.put("1500000", "");


        standard_10.put("1.8", "");
        standard_10.put("18", "");
        standard_10.put("180", "");
        standard_10.put("1800", "");
        standard_10.put("18000", "");
        standard_10.put("180000", "");
        standard_10.put("1800000", "");

        standard_10.put("2.2", "");
        standard_10.put("22", "");
        standard_10.put("220", "");
        standard_10.put("2200", "");
        standard_10.put("22000", "");
        standard_10.put("220000", "");
        standard_10.put("2200000", "");


        standard_10.put("2.7", "");
        standard_10.put("27", "");
        standard_10.put("270", "");
        standard_10.put("2700", "");
        standard_10.put("27000", "");
        standard_10.put("270000", "");
        standard_10.put("2700000", "");


        standard_10.put("3.3", "");
        standard_10.put("33", "");
        standard_10.put("330", "");
        standard_10.put("3300", "");
        standard_10.put("33000", "");
        standard_10.put("330000", "");
        standard_10.put("3300000", "");

        standard_10.put("3.9", "");
        standard_10.put("39", "");
        standard_10.put("390", "");
        standard_10.put("3900", "");
        standard_10.put("39000", "");
        standard_10.put("390000", "");
        standard_10.put("3900000", "");

        standard_10.put("4.7", "");
        standard_10.put("47", "");
        standard_10.put("470", "");
        standard_10.put("4700", "");
        standard_10.put("47000", "");
        standard_10.put("470000", "");
        standard_10.put("4700000", "");


        standard_10.put("5.6", "");
        standard_10.put("56", "");
        standard_10.put("560", "");
        standard_10.put("5600", "");
        standard_10.put("56000", "");
        standard_10.put("560000", "");
        standard_10.put("5600000", "");


        standard_10.put("6.8", "");
        standard_10.put("68", "");
        standard_10.put("680", "");
        standard_10.put("6800", "");
        standard_10.put("68000", "");
        standard_10.put("680000", "");
        standard_10.put("6800000", "");

        standard_10.put("8.2", "");
        standard_10.put("82", "");
        standard_10.put("820", "");
        standard_10.put("8200", "");
        standard_10.put("82000", "");
        standard_10.put("820000", "");
        standard_10.put("8200000", "");


        standard_5.put("1", "");
        standard_5.put("10", "");
        standard_5.put("100", "");
        standard_5.put("1000", "");
        standard_5.put("10000", "");
        standard_5.put("100000", "");
        standard_5.put("1000000", "");


        standard_5.put("1.1", "");
        standard_5.put("11", "");
        standard_5.put("110", "");
        standard_5.put("1100", "");
        standard_5.put("11000", "");
        standard_5.put("110000", "");
        standard_5.put("1100000", "");


        standard_5.put("1.2", "");
        standard_5.put("12", "");
        standard_5.put("120", "");
        standard_5.put("1200", "");
        standard_5.put("12000", "");
        standard_5.put("120000", "");
        standard_5.put("1200000", "");


        standard_5.put("1.3", "");
        standard_5.put("13", "");
        standard_5.put("130", "");
        standard_5.put("1300", "");
        standard_5.put("13000", "");
        standard_5.put("130000", "");
        standard_5.put("1300000", "");


        standard_5.put("1.5", "");
        standard_5.put("15", "");
        standard_5.put("150", "");
        standard_5.put("1500", "");
        standard_5.put("15000", "");
        standard_5.put("150000", "");
        standard_5.put("1500000", "");

        standard_5.put("1.6", "");
        standard_5.put("16", "");
        standard_5.put("160", "");
        standard_5.put("1600", "");
        standard_5.put("16000", "");
        standard_5.put("160000", "");
        standard_5.put("1600000", "");


        standard_5.put("1.8", "");
        standard_5.put("18", "");
        standard_5.put("180", "");
        standard_5.put("1800", "");
        standard_5.put("18000", "");
        standard_5.put("180000", "");
        standard_5.put("1800000", "");

        standard_5.put("2", "");
        standard_5.put("20", "");
        standard_5.put("200", "");
        standard_5.put("2000", "");
        standard_5.put("20000", "");
        standard_5.put("200000", "");
        standard_5.put("2000000", "");


        standard_5.put("2.2", "");
        standard_5.put("22", "");
        standard_5.put("220", "");
        standard_5.put("2200", "");
        standard_5.put("22000", "");
        standard_5.put("220000", "");
        standard_5.put("2200000", "");

        standard_5.put("2.4", "");
        standard_5.put("24", "");
        standard_5.put("240", "");
        standard_5.put("2400", "");
        standard_5.put("24000", "");
        standard_5.put("240000", "");
        standard_5.put("2400000", "");

        standard_5.put("2.7", "");
        standard_5.put("27", "");
        standard_5.put("270", "");
        standard_5.put("2700", "");
        standard_5.put("27000", "");
        standard_5.put("270000", "");
        standard_5.put("2700000", "");

        standard_5.put("3", "");
        standard_5.put("30", "");
        standard_5.put("300", "");
        standard_5.put("3000", "");
        standard_5.put("30000", "");
        standard_5.put("300000", "");
        standard_5.put("3000000", "");


        standard_5.put("3.3", "");
        standard_5.put("33", "");
        standard_5.put("330", "");
        standard_5.put("3300", "");
        standard_5.put("33000", "");
        standard_5.put("330000", "");
        standard_5.put("3300000", "");


        standard_5.put("3.6", "");
        standard_5.put("36", "");
        standard_5.put("360", "");
        standard_5.put("3600", "");
        standard_5.put("36000", "");
        standard_5.put("360000", "");
        standard_5.put("3600000", "");

        standard_5.put("3.9", "");
        standard_5.put("39", "");
        standard_5.put("390", "");
        standard_5.put("3900", "");
        standard_5.put("39000", "");
        standard_5.put("390000", "");
        standard_5.put("3900000", "");


        standard_5.put("4.3", "");
        standard_5.put("43", "");
        standard_5.put("430", "");
        standard_5.put("4300", "");
        standard_5.put("43000", "");
        standard_5.put("430000", "");
        standard_5.put("4300000", "");


        standard_5.put("4.7", "");
        standard_5.put("47", "");
        standard_5.put("470", "");
        standard_5.put("4700", "");
        standard_5.put("47000", "");
        standard_5.put("470000", "");
        standard_5.put("4700000", "");

        standard_5.put("5.1", "");
        standard_5.put("51", "");
        standard_5.put("510", "");
        standard_5.put("5100", "");
        standard_5.put("51000", "");
        standard_5.put("510000", "");
        standard_5.put("5100000", "");

        standard_5.put("5.6", "");
        standard_5.put("56", "");
        standard_5.put("560", "");
        standard_5.put("5600", "");
        standard_5.put("56000", "");
        standard_5.put("560000", "");
        standard_5.put("5600000", "");

        standard_5.put("6.2", "");
        standard_5.put("62", "");
        standard_5.put("620", "");
        standard_5.put("6200", "");
        standard_5.put("62000", "");
        standard_5.put("620000", "");
        standard_5.put("6200000", "");


        standard_5.put("6.8", "");
        standard_5.put("68", "");
        standard_5.put("680", "");
        standard_5.put("6800", "");
        standard_5.put("68000", "");
        standard_5.put("680000", "");
        standard_5.put("6800000", "");


        standard_5.put("7.5", "");
        standard_5.put("75", "");
        standard_5.put("750", "");
        standard_5.put("7500", "");
        standard_5.put("75000", "");
        standard_5.put("750000", "");
        standard_5.put("7500000", "");

        standard_5.put("8.2", "");
        standard_5.put("82", "");
        standard_5.put("820", "");
        standard_5.put("8200", "");
        standard_5.put("82000", "");
        standard_5.put("820000", "");
        standard_5.put("8200000", "");

        standard_5.put("9.1", "");
        standard_5.put("91", "");
        standard_5.put("910", "");
        standard_5.put("9100", "");
        standard_5.put("91000", "");
        standard_5.put("910000", "");
        standard_5.put("9100000", "");


        standard_2.put("1", "");
        standard_2.put("10", "");
        standard_2.put("100", "");
        standard_2.put("1000", "");
        standard_2.put("10000", "");
        standard_2.put("100000", "");
        standard_2.put("1000000", "");

        standard_2.put("1.05", "");
        standard_2.put("10.5", "");
        standard_2.put("105", "");
        standard_2.put("1050", "");
        standard_2.put("10500", "");
        standard_2.put("105000", "");
        standard_2.put("1050000", "");


        standard_2.put("1.1", "");
        standard_2.put("11", "");
        standard_2.put("110", "");
        standard_2.put("1100", "");
        standard_2.put("11000", "");
        standard_2.put("110000", "");
        standard_2.put("1100000", "");


        standard_2.put("1.15", "");
        standard_2.put("11.5", "");
        standard_2.put("115", "");
        standard_2.put("1150", "");
        standard_2.put("11500", "");
        standard_2.put("115000", "");
        standard_2.put("1150000", "");


        standard_2.put("1.21", "");
        standard_2.put("12.1", "");
        standard_2.put("121", "");
        standard_2.put("1210", "");
        standard_2.put("12100", "");
        standard_2.put("121000", "");
        standard_2.put("1210000", "");


        standard_2.put("1.27", "");
        standard_2.put("12.7", "");
        standard_2.put("127", "");
        standard_2.put("1270", "");
        standard_2.put("12700", "");
        standard_2.put("127000", "");
        standard_2.put("1270000", "");

        standard_2.put("1.33", "");
        standard_2.put("13.3", "");
        standard_2.put("133", "");
        standard_2.put("1330", "");
        standard_2.put("13300", "");
        standard_2.put("133000", "");
        standard_2.put("1330000", "");


        standard_2.put("1.4", "");
        standard_2.put("14", "");
        standard_2.put("140", "");
        standard_2.put("1400", "");
        standard_2.put("14000", "");
        standard_2.put("140000", "");
        standard_2.put("1400000", "");


        standard_2.put("1.47", "");
        standard_2.put("14.7", "");
        standard_2.put("147", "");
        standard_2.put("1470", "");
        standard_2.put("14700", "");
        standard_2.put("147000", "");
        standard_2.put("1470000", "");

        standard_2.put("1.54", "");
        standard_2.put("15.4", "");
        standard_2.put("154", "");
        standard_2.put("1540", "");
        standard_2.put("15400", "");
        standard_2.put("154000", "");
        standard_2.put("1540000", "");


        standard_2.put("1.62", "");
        standard_2.put("16.2", "");
        standard_2.put("162", "");
        standard_2.put("1620", "");
        standard_2.put("16200", "");
        standard_2.put("162000", "");
        standard_2.put("1620000", "");


        standard_2.put("1.69", "");
        standard_2.put("16.9", "");
        standard_2.put("169", "");
        standard_2.put("1690", "");
        standard_2.put("16900", "");
        standard_2.put("169000", "");
        standard_2.put("1690000", "");


        standard_2.put("1.78", "");
        standard_2.put("17.8", "");
        standard_2.put("178", "");
        standard_2.put("1780", "");
        standard_2.put("17800", "");
        standard_2.put("178000", "");
        standard_2.put("1780000", "");


        standard_2.put("1.87", "");
        standard_2.put("18.8", "");
        standard_2.put("187", "");
        standard_2.put("1870", "");
        standard_2.put("18700", "");
        standard_2.put("187000", "");
        standard_2.put("1870000", "");


        standard_2.put("1.96", "");
        standard_2.put("19.6", "");
        standard_2.put("196", "");
        standard_2.put("1960", "");
        standard_2.put("19600", "");
        standard_2.put("196000", "");
        standard_2.put("1960000", "");


        standard_2.put("2.05", "");
        standard_2.put("20.5", "");
        standard_2.put("205", "");
        standard_2.put("2050", "");
        standard_2.put("20500", "");
        standard_2.put("205000", "");
        standard_2.put("2050000", "");


        standard_2.put("2.15", "");
        standard_2.put("21.5", "");
        standard_2.put("215", "");
        standard_2.put("2150", "");
        standard_2.put("21500", "");
        standard_2.put("215000", "");
        standard_2.put("2150000", "");

        standard_2.put("2.26", "");
        standard_2.put("22.6", "");
        standard_2.put("226", "");
        standard_2.put("2260", "");
        standard_2.put("22600", "");
        standard_2.put("226000", "");
        standard_2.put("2260000", "");


        standard_2.put("2.37", "");
        standard_2.put("23.7", "");
        standard_2.put("237", "");
        standard_2.put("2370", "");
        standard_2.put("23700", "");
        standard_2.put("237000", "");
        standard_2.put("2370000", "");


        standard_2.put("2.49", "");
        standard_2.put("24.9", "");
        standard_2.put("249", "");
        standard_2.put("2490", "");
        standard_2.put("24900", "");
        standard_2.put("249000", "");
        standard_2.put("2490000", "");

        standard_2.put("2.61", "");
        standard_2.put("26.1", "");
        standard_2.put("261", "");
        standard_2.put("2610", "");
        standard_2.put("26100", "");
        standard_2.put("261000", "");
        standard_2.put("2610000", "");


        standard_2.put("2.74", "");
        standard_2.put("27.4", "");
        standard_2.put("274", "");
        standard_2.put("2740", "");
        standard_2.put("27400", "");
        standard_2.put("274000", "");
        standard_2.put("2740000", "");

        standard_2.put("2.87", "");
        standard_2.put("28.7", "");
        standard_2.put("287", "");
        standard_2.put("2870", "");
        standard_2.put("28700", "");
        standard_2.put("287000", "");
        standard_2.put("2870000", "");

        standard_2.put("3.01", "");
        standard_2.put("30.1", "");
        standard_2.put("301", "");
        standard_2.put("3010", "");
        standard_2.put("30100", "");
        standard_2.put("301000", "");
        standard_2.put("3010000", "");


        standard_2.put("3.16", "");
        standard_2.put("31.6", "");
        standard_2.put("316", "");
        standard_2.put("3160", "");
        standard_2.put("31600", "");
        standard_2.put("316000", "");
        standard_2.put("3160000", "");


        standard_2.put("3.32", "");
        standard_2.put("33.2", "");
        standard_2.put("332", "");
        standard_2.put("3320", "");
        standard_2.put("33200", "");
        standard_2.put("332000", "");
        standard_2.put("3320000", "");

        standard_2.put("3.48", "");
        standard_2.put("34.8", "");
        standard_2.put("348", "");
        standard_2.put("3480", "");
        standard_2.put("34800", "");
        standard_2.put("348000", "");
        standard_2.put("3480000", "");


        standard_2.put("3.65", "");
        standard_2.put("36.5", "");
        standard_2.put("365", "");
        standard_2.put("3650", "");
        standard_2.put("36500", "");
        standard_2.put("365000", "");
        standard_2.put("3650000", "");

        standard_2.put("3.83", "");
        standard_2.put("38.3", "");
        standard_2.put("383", "");
        standard_2.put("3830", "");
        standard_2.put("38300", "");
        standard_2.put("383000", "");
        standard_2.put("3830000", "");

        standard_2.put("4.02", "");
        standard_2.put("40.2", "");
        standard_2.put("402", "");
        standard_2.put("4020", "");
        standard_2.put("40200", "");
        standard_2.put("402000", "");
        standard_2.put("4020000", "");


        standard_2.put("4.22", "");
        standard_2.put("42.2", "");
        standard_2.put("422", "");
        standard_2.put("4220", "");
        standard_2.put("42200", "");
        standard_2.put("422000", "");
        standard_2.put("4220000", "");


        standard_2.put("4.42", "");
        standard_2.put("44.2", "");
        standard_2.put("442", "");
        standard_2.put("4420", "");
        standard_2.put("44200", "");
        standard_2.put("442000", "");
        standard_2.put("4420000", "");


        standard_2.put("4.64", "");
        standard_2.put("46.4", "");
        standard_2.put("464", "");
        standard_2.put("4640", "");
        standard_2.put("46400", "");
        standard_2.put("464000", "");
        standard_2.put("4640000", "");


        standard_2.put("4.87", "");
        standard_2.put("48.7", "");
        standard_2.put("487", "");
        standard_2.put("4870", "");
        standard_2.put("48700", "");
        standard_2.put("487000", "");
        standard_2.put("4870000", "");


        standard_2.put("5.11", "");
        standard_2.put("51.1", "");
        standard_2.put("511", "");
        standard_2.put("5110", "");
        standard_2.put("51100", "");
        standard_2.put("511000", "");
        standard_2.put("5110000", "");

        standard_2.put("5.36", "");
        standard_2.put("53.6", "");
        standard_2.put("536", "");
        standard_2.put("5360", "");
        standard_2.put("53600", "");
        standard_2.put("536000", "");
        standard_2.put("5360000", "");


        standard_2.put("5.62", "");
        standard_2.put("56.2", "");
        standard_2.put("562", "");
        standard_2.put("5620", "");
        standard_2.put("56200", "");
        standard_2.put("562000", "");
        standard_2.put("5620000", "");

        standard_2.put("5.9", "");
        standard_2.put("59", "");
        standard_2.put("590", "");
        standard_2.put("5900", "");
        standard_2.put("59000", "");
        standard_2.put("590000", "");
        standard_2.put("5900000", "");


        standard_2.put("6.19", "");
        standard_2.put("61.9", "");
        standard_2.put("619", "");
        standard_2.put("6190", "");
        standard_2.put("61900", "");
        standard_2.put("619000", "");
        standard_2.put("6190000", "");


        standard_2.put("6.49", "");
        standard_2.put("64.9", "");
        standard_2.put("649", "");
        standard_2.put("6490", "");
        standard_2.put("64900", "");
        standard_2.put("649000", "");
        standard_2.put("6490000", "");


        standard_2.put("6.81", "");
        standard_2.put("68.1", "");
        standard_2.put("681", "");
        standard_2.put("6810", "");
        standard_2.put("68100", "");
        standard_2.put("681000", "");
        standard_2.put("6810000", "");


        standard_2.put("7.15", "");
        standard_2.put("71.5", "");
        standard_2.put("715", "");
        standard_2.put("7150", "");
        standard_2.put("71500", "");
        standard_2.put("715000", "");
        standard_2.put("7150000", "");

        standard_2.put("7.5", "");
        standard_2.put("75", "");
        standard_2.put("750", "");
        standard_2.put("7500", "");
        standard_2.put("75000", "");
        standard_2.put("750000", "");
        standard_2.put("7500000", "");

        standard_2.put("7.87", "");
        standard_2.put("78.7", "");
        standard_2.put("787", "");
        standard_2.put("7870", "");
        standard_2.put("78700", "");
        standard_2.put("787000", "");
        standard_2.put("7870000", "");

        standard_2.put("8.25", "");
        standard_2.put("82.5", "");
        standard_2.put("825", "");
        standard_2.put("8250", "");
        standard_2.put("82500", "");
        standard_2.put("825000", "");
        standard_2.put("8250000", "");


        standard_2.put("8.66", "");
        standard_2.put("86.6", "");
        standard_2.put("866", "");
        standard_2.put("8660", "");
        standard_2.put("86600", "");
        standard_2.put("866000", "");
        standard_2.put("8660000", "");

        standard_2.put("9.09", "");
        standard_2.put("90.9", "");
        standard_2.put("909", "");
        standard_2.put("9090", "");
        standard_2.put("90900", "");
        standard_2.put("909000", "");
        standard_2.put("9090000", "");


        standard_2.put("9.53", "");
        standard_2.put("95.3", "");
        standard_2.put("953", "");
        standard_2.put("9530", "");
        standard_2.put("95300", "");
        standard_2.put("953000", "");
        standard_2.put("9530000", "");


        standard_1.put("1", "");
        standard_1.put("10", "");
        standard_1.put("100", "");
        standard_1.put("1000", "");
        standard_1.put("10000", "");
        standard_1.put("100000", "");
        standard_1.put("1000000", "");

        standard_1.put("1.02", "");
        standard_1.put("10.2", "");
        standard_1.put("102", "");
        standard_1.put("1020", "");
        standard_1.put("10200", "");
        standard_1.put("102000", "");
        standard_1.put("1020000", "");

        standard_1.put("1.05", "");
        standard_1.put("10.5", "");
        standard_1.put("105", "");
        standard_1.put("1050", "");
        standard_1.put("10500", "");
        standard_1.put("105000", "");
        standard_1.put("1050000", "");


        standard_1.put("1.07", "");
        standard_1.put("10.7", "");
        standard_1.put("107", "");
        standard_1.put("1070", "");
        standard_1.put("10700", "");
        standard_1.put("107000", "");
        standard_1.put("1070000", "");


        standard_1.put("1.1", "");
        standard_1.put("11", "");
        standard_1.put("110", "");
        standard_1.put("1100", "");
        standard_1.put("11000", "");
        standard_1.put("110000", "");
        standard_1.put("1100000", "");


        standard_1.put("1.13", "");
        standard_1.put("11.3", "");
        standard_1.put("113", "");
        standard_1.put("1130", "");
        standard_1.put("11300", "");
        standard_1.put("113000", "");
        standard_1.put("1130000", "");

        standard_1.put("1.15", "");
        standard_1.put("11.5", "");
        standard_1.put("115", "");
        standard_1.put("1150", "");
        standard_1.put("11500", "");
        standard_1.put("115000", "");
        standard_1.put("1150000", "");


        standard_1.put("1.18", "");
        standard_1.put("11.8", "");
        standard_1.put("118", "");
        standard_1.put("1180", "");
        standard_1.put("11800", "");
        standard_1.put("118000", "");
        standard_1.put("1180000", "");


        standard_1.put("1.21", "");
        standard_1.put("12.1", "");
        standard_1.put("121", "");
        standard_1.put("1210", "");
        standard_1.put("12100", "");
        standard_1.put("121000", "");
        standard_1.put("1210000", "");

        standard_1.put("1.24", "");
        standard_1.put("12.4", "");
        standard_1.put("124", "");
        standard_1.put("1240", "");
        standard_1.put("12400", "");
        standard_1.put("124000", "");
        standard_1.put("1240000", "");


        standard_1.put("1.27", "");
        standard_1.put("12.7", "");
        standard_1.put("127", "");
        standard_1.put("1270", "");
        standard_1.put("12700", "");
        standard_1.put("127000", "");
        standard_1.put("1270000", "");

        standard_1.put("1.3", "");
        standard_1.put("13", "");
        standard_1.put("130", "");
        standard_1.put("1300", "");
        standard_1.put("13000", "");
        standard_1.put("130000", "");
        standard_1.put("1300000", "");


        standard_1.put("1.33", "");
        standard_1.put("13.3", "");
        standard_1.put("133", "");
        standard_1.put("1330", "");
        standard_1.put("13300", "");
        standard_1.put("133000", "");
        standard_1.put("1330000", "");


        standard_1.put("1.37", "");
        standard_1.put("13.7", "");
        standard_1.put("137", "");
        standard_1.put("1370", "");
        standard_1.put("13700", "");
        standard_1.put("137000", "");
        standard_1.put("1370000", "");


        standard_1.put("1.4", "");
        standard_1.put("14", "");
        standard_1.put("140", "");
        standard_1.put("1400", "");
        standard_1.put("14000", "");
        standard_1.put("140000", "");
        standard_1.put("1400000", "");


        standard_1.put("1.43", "");
        standard_1.put("14.3", "");
        standard_1.put("143", "");
        standard_1.put("1430", "");
        standard_1.put("14300", "");
        standard_1.put("143000", "");
        standard_1.put("1430000", "");


        standard_1.put("1.47", "");
        standard_1.put("14.7", "");
        standard_1.put("147", "");
        standard_1.put("1470", "");
        standard_1.put("14700", "");
        standard_1.put("147000", "");
        standard_1.put("1470000", "");


        standard_1.put("1.5", "");
        standard_1.put("15", "");
        standard_1.put("150", "");
        standard_1.put("1500", "");
        standard_1.put("15000", "");
        standard_1.put("150000", "");
        standard_1.put("1500000", "");


        standard_1.put("1.54", "");
        standard_1.put("15.4", "");
        standard_1.put("154", "");
        standard_1.put("1540", "");
        standard_1.put("15400", "");
        standard_1.put("154000", "");
        standard_1.put("1540000", "");

        standard_1.put("1.58", "");
        standard_1.put("15.8", "");
        standard_1.put("158", "");
        standard_1.put("1580", "");
        standard_1.put("15800", "");
        standard_1.put("158000", "");
        standard_1.put("1580000", "");


        standard_1.put("1.62", "");
        standard_1.put("16.2", "");
        standard_1.put("162", "");
        standard_1.put("1620", "");
        standard_1.put("16200", "");
        standard_1.put("162000", "");
        standard_1.put("1620000", "");


        standard_1.put("1.65", "");
        standard_1.put("16.5", "");
        standard_1.put("165", "");
        standard_1.put("1650", "");
        standard_1.put("16500", "");
        standard_1.put("165000", "");
        standard_1.put("1650000", "");


        standard_1.put("1.69", "");
        standard_1.put("16.9", "");
        standard_1.put("169", "");
        standard_1.put("1690", "");
        standard_1.put("16900", "");
        standard_1.put("169000", "");
        standard_1.put("1690000", "");

        standard_1.put("1.74", "");
        standard_1.put("17.4", "");
        standard_1.put("174", "");
        standard_1.put("1740", "");
        standard_1.put("17400", "");
        standard_1.put("174000", "");
        standard_1.put("1740000", "");


        standard_1.put("1.78", "");
        standard_1.put("17.8", "");
        standard_1.put("178", "");
        standard_1.put("1780", "");
        standard_1.put("17800", "");
        standard_1.put("178000", "");
        standard_1.put("1780000", "");

        standard_1.put("1.82", "");
        standard_1.put("18.2", "");
        standard_1.put("182", "");
        standard_1.put("1820", "");
        standard_1.put("18200", "");
        standard_1.put("182000", "");
        standard_1.put("1820000", "");


        standard_1.put("1.87", "");
        standard_1.put("18.8", "");
        standard_1.put("187", "");
        standard_1.put("1870", "");
        standard_1.put("18700", "");
        standard_1.put("187000", "");
        standard_1.put("1870000", "");


        standard_1.put("1.91", "");
        standard_1.put("19.1", "");
        standard_1.put("191", "");
        standard_1.put("1910", "");
        standard_1.put("19100", "");
        standard_1.put("191000", "");
        standard_1.put("1910000", "");


        standard_1.put("1.96", "");
        standard_1.put("19.6", "");
        standard_1.put("196", "");
        standard_1.put("1960", "");
        standard_1.put("19600", "");
        standard_1.put("196000", "");
        standard_1.put("1960000", "");


        standard_1.put("2", "");
        standard_1.put("20", "");
        standard_1.put("200", "");
        standard_1.put("2000", "");
        standard_1.put("20000", "");
        standard_1.put("200000", "");
        standard_1.put("2000000", "");


        standard_1.put("2.05", "");
        standard_1.put("20.5", "");
        standard_1.put("205", "");
        standard_1.put("2050", "");
        standard_1.put("20500", "");
        standard_1.put("205000", "");
        standard_1.put("2050000", "");


        standard_1.put("2.1", "");
        standard_1.put("21", "");
        standard_1.put("210", "");
        standard_1.put("2100", "");
        standard_1.put("21000", "");
        standard_1.put("210000", "");
        standard_1.put("2100000", "");


        standard_1.put("2.15", "");
        standard_1.put("21.5", "");
        standard_1.put("215", "");
        standard_1.put("2150", "");
        standard_1.put("21500", "");
        standard_1.put("215000", "");
        standard_1.put("2150000", "");


        standard_1.put("2.21", "");
        standard_1.put("22.1", "");
        standard_1.put("221", "");
        standard_1.put("2210", "");
        standard_1.put("22100", "");
        standard_1.put("221000", "");
        standard_1.put("2210000", "");


        standard_1.put("2.26", "");
        standard_1.put("22.6", "");
        standard_1.put("226", "");
        standard_1.put("2260", "");
        standard_1.put("22600", "");
        standard_1.put("226000", "");
        standard_1.put("2260000", "");


        standard_1.put("2.32", "");
        standard_1.put("23.2", "");
        standard_1.put("232", "");
        standard_1.put("2320", "");
        standard_1.put("23200", "");
        standard_1.put("232000", "");
        standard_1.put("2320000", "");

        standard_1.put("2.37", "");
        standard_1.put("23.7", "");
        standard_1.put("237", "");
        standard_1.put("2370", "");
        standard_1.put("23700", "");
        standard_1.put("237000", "");
        standard_1.put("2370000", "");


        standard_1.put("2.43", "");
        standard_1.put("24.3", "");
        standard_1.put("243", "");
        standard_1.put("2430", "");
        standard_1.put("24300", "");
        standard_1.put("243000", "");
        standard_1.put("2430000", "");


        standard_1.put("2.49", "");
        standard_1.put("24.9", "");
        standard_1.put("249", "");
        standard_1.put("2490", "");
        standard_1.put("24900", "");
        standard_1.put("249000", "");
        standard_1.put("2490000", "");


        standard_1.put("2.55", "");
        standard_1.put("25.5", "");
        standard_1.put("255", "");
        standard_1.put("2550", "");
        standard_1.put("25500", "");
        standard_1.put("255000", "");
        standard_1.put("2550000", "");

        standard_1.put("2.61", "");
        standard_1.put("26.1", "");
        standard_1.put("261", "");
        standard_1.put("2610", "");
        standard_1.put("26100", "");
        standard_1.put("261000", "");
        standard_1.put("2610000", "");

        standard_1.put("2.67", "");
        standard_1.put("26.7", "");
        standard_1.put("267", "");
        standard_1.put("2670", "");
        standard_1.put("26700", "");
        standard_1.put("267000", "");
        standard_1.put("2670000", "");


        standard_1.put("2.74", "");
        standard_1.put("27.4", "");
        standard_1.put("274", "");
        standard_1.put("2740", "");
        standard_1.put("27400", "");
        standard_1.put("274000", "");
        standard_1.put("2740000", "");

        standard_1.put("2.8", "");
        standard_1.put("28", "");
        standard_1.put("280", "");
        standard_1.put("2800", "");
        standard_1.put("28000", "");
        standard_1.put("280000", "");
        standard_1.put("2800000", "");

        standard_1.put("2.87", "");
        standard_1.put("28.7", "");
        standard_1.put("287", "");
        standard_1.put("2870", "");
        standard_1.put("28700", "");
        standard_1.put("287000", "");
        standard_1.put("2870000", "");

        standard_1.put("2.94", "");
        standard_1.put("29.4", "");
        standard_1.put("294", "");
        standard_1.put("2940", "");
        standard_1.put("29400", "");
        standard_1.put("294000", "");
        standard_1.put("2940000", "");


        standard_1.put("3.01", "");
        standard_1.put("30.1", "");
        standard_1.put("301", "");
        standard_1.put("3010", "");
        standard_1.put("30100", "");
        standard_1.put("301000", "");
        standard_1.put("3010000", "");

        standard_1.put("3.09", "");
        standard_1.put("30.9", "");
        standard_1.put("309", "");
        standard_1.put("3090", "");
        standard_1.put("30900", "");
        standard_1.put("309000", "");
        standard_1.put("3090000", "");


        standard_1.put("3.16", "");
        standard_1.put("31.6", "");
        standard_1.put("316", "");
        standard_1.put("3160", "");
        standard_1.put("31600", "");
        standard_1.put("316000", "");
        standard_1.put("3160000", "");

        standard_1.put("3.24", "");
        standard_1.put("32.4", "");
        standard_1.put("324", "");
        standard_1.put("3240", "");
        standard_1.put("32400", "");
        standard_1.put("324000", "");
        standard_1.put("3240000", "");


        standard_1.put("3.32", "");
        standard_1.put("33.2", "");
        standard_1.put("332", "");
        standard_1.put("3320", "");
        standard_1.put("33200", "");
        standard_1.put("332000", "");
        standard_1.put("3320000", "");


        standard_1.put("3.4", "");
        standard_1.put("34", "");
        standard_1.put("340", "");
        standard_1.put("3400", "");
        standard_1.put("34000", "");
        standard_1.put("340000", "");
        standard_1.put("3400000", "");


        standard_1.put("3.48", "");
        standard_1.put("34.8", "");
        standard_1.put("348", "");
        standard_1.put("3480", "");
        standard_1.put("34800", "");
        standard_1.put("348000", "");
        standard_1.put("3480000", "");

        standard_1.put("3.57", "");
        standard_1.put("35.7", "");
        standard_1.put("357", "");
        standard_1.put("3570", "");
        standard_1.put("35700", "");
        standard_1.put("357000", "");
        standard_1.put("3570000", "");


        standard_1.put("3.65", "");
        standard_1.put("36.5", "");
        standard_1.put("365", "");
        standard_1.put("3650", "");
        standard_1.put("36500", "");
        standard_1.put("365000", "");
        standard_1.put("3650000", "");

        standard_1.put("3.74", "");
        standard_1.put("37.4", "");
        standard_1.put("374", "");
        standard_1.put("3740", "");
        standard_1.put("37400", "");
        standard_1.put("374000", "");
        standard_1.put("3740000", "");

        standard_1.put("3.83", "");
        standard_1.put("38.3", "");
        standard_1.put("383", "");
        standard_1.put("3830", "");
        standard_1.put("38300", "");
        standard_1.put("383000", "");
        standard_1.put("3830000", "");

        standard_1.put("3.92", "");
        standard_1.put("39.2", "");
        standard_1.put("392", "");
        standard_1.put("3290", "");
        standard_1.put("39200", "");
        standard_1.put("392000", "");
        standard_1.put("3920000", "");

        standard_1.put("4.02", "");
        standard_1.put("40.2", "");
        standard_1.put("402", "");
        standard_1.put("4020", "");
        standard_1.put("40200", "");
        standard_1.put("402000", "");
        standard_1.put("4020000", "");

        standard_1.put("4.12", "");
        standard_1.put("41.2", "");
        standard_1.put("412", "");
        standard_1.put("4120", "");
        standard_1.put("41200", "");
        standard_1.put("412000", "");
        standard_1.put("4120000", "");


        standard_1.put("4.22", "");
        standard_1.put("42.2", "");
        standard_1.put("422", "");
        standard_1.put("4220", "");
        standard_1.put("42200", "");
        standard_1.put("422000", "");
        standard_1.put("4220000", "");

        standard_1.put("4.32", "");
        standard_1.put("43.2", "");
        standard_1.put("432", "");
        standard_1.put("4320", "");
        standard_1.put("43200", "");
        standard_1.put("432000", "");
        standard_1.put("4320000", "");


        standard_1.put("4.42", "");
        standard_1.put("44.2", "");
        standard_1.put("442", "");
        standard_1.put("4420", "");
        standard_1.put("44200", "");
        standard_1.put("442000", "");
        standard_1.put("4420000", "");

        standard_1.put("4.53", "");
        standard_1.put("45.3", "");
        standard_1.put("453", "");
        standard_1.put("4530", "");
        standard_1.put("45300", "");
        standard_1.put("453000", "");
        standard_1.put("4530000", "");


        standard_1.put("4.64", "");
        standard_1.put("46.4", "");
        standard_1.put("464", "");
        standard_1.put("4640", "");
        standard_1.put("46400", "");
        standard_1.put("464000", "");
        standard_1.put("4640000", "");


        standard_1.put("4.75", "");
        standard_1.put("47.5", "");
        standard_1.put("475", "");
        standard_1.put("4750", "");
        standard_1.put("47500", "");
        standard_1.put("475000", "");
        standard_1.put("4750000", "");


        standard_1.put("4.87", "");
        standard_1.put("48.7", "");
        standard_1.put("487", "");
        standard_1.put("4870", "");
        standard_1.put("48700", "");
        standard_1.put("487000", "");
        standard_1.put("4870000", "");

        standard_1.put("4.99", "");
        standard_1.put("49.9", "");
        standard_1.put("499", "");
        standard_1.put("4990", "");
        standard_1.put("49900", "");
        standard_1.put("499000", "");
        standard_1.put("4990000", "");

        standard_1.put("5.11", "");
        standard_1.put("51.1", "");
        standard_1.put("511", "");
        standard_1.put("5110", "");
        standard_1.put("51100", "");
        standard_1.put("511000", "");
        standard_1.put("5110000", "");


        standard_1.put("5.23", "");
        standard_1.put("52.3", "");
        standard_1.put("523", "");
        standard_1.put("5230", "");
        standard_1.put("52300", "");
        standard_1.put("523000", "");
        standard_1.put("5230000", "");


        standard_1.put("5.36", "");
        standard_1.put("53.6", "");
        standard_1.put("536", "");
        standard_1.put("5360", "");
        standard_1.put("53600", "");
        standard_1.put("536000", "");
        standard_1.put("5360000", "");

        standard_1.put("5.49", "");
        standard_1.put("54.9", "");
        standard_1.put("549", "");
        standard_1.put("5490", "");
        standard_1.put("54900", "");
        standard_1.put("549000", "");
        standard_1.put("5490000", "");

        standard_1.put("5.62", "");
        standard_1.put("56.2", "");
        standard_1.put("562", "");
        standard_1.put("5620", "");
        standard_1.put("56200", "");
        standard_1.put("562000", "");
        standard_1.put("5620000", "");

        standard_1.put("5.76", "");
        standard_1.put("57.6", "");
        standard_1.put("576", "");
        standard_1.put("5760", "");
        standard_1.put("57600", "");
        standard_1.put("576000", "");
        standard_1.put("5760000", "");

        standard_1.put("5.9", "");
        standard_1.put("59", "");
        standard_1.put("590", "");
        standard_1.put("5900", "");
        standard_1.put("59000", "");
        standard_1.put("590000", "");
        standard_1.put("5900000", "");


        standard_1.put("6.04", "");
        standard_1.put("60.4", "");
        standard_1.put("604", "");
        standard_1.put("6040", "");
        standard_1.put("60400", "");
        standard_1.put("604000", "");
        standard_1.put("6040000", "");


        standard_1.put("6.19", "");
        standard_1.put("61.9", "");
        standard_1.put("619", "");
        standard_1.put("6190", "");
        standard_1.put("61900", "");
        standard_1.put("619000", "");
        standard_1.put("6190000", "");


        standard_1.put("6.34", "");
        standard_1.put("63.4", "");
        standard_1.put("634", "");
        standard_1.put("6340", "");
        standard_1.put("63400", "");
        standard_1.put("634000", "");
        standard_1.put("6340000", "");


        standard_1.put("6.49", "");
        standard_1.put("64.9", "");
        standard_1.put("649", "");
        standard_1.put("6490", "");
        standard_1.put("64900", "");
        standard_1.put("649000", "");
        standard_1.put("6490000", "");

        standard_1.put("6.65", "");
        standard_1.put("66.5", "");
        standard_1.put("665", "");
        standard_1.put("6650", "");
        standard_1.put("66500", "");
        standard_1.put("665000", "");
        standard_1.put("6650000", "");


        standard_1.put("6.81", "");
        standard_1.put("68.1", "");
        standard_1.put("681", "");
        standard_1.put("6810", "");
        standard_1.put("68100", "");
        standard_1.put("681000", "");
        standard_1.put("6810000", "");


        standard_1.put("6.98", "");
        standard_1.put("69.8", "");
        standard_1.put("698", "");
        standard_1.put("6980", "");
        standard_1.put("69800", "");
        standard_1.put("698000", "");
        standard_1.put("6980000", "");


        standard_1.put("7.15", "");
        standard_1.put("71.5", "");
        standard_1.put("715", "");
        standard_1.put("7150", "");
        standard_1.put("71500", "");
        standard_1.put("715000", "");
        standard_1.put("7150000", "");

        standard_1.put("7.32", "");
        standard_1.put("73.2", "");
        standard_1.put("732", "");
        standard_1.put("7320", "");
        standard_1.put("73200", "");
        standard_1.put("732000", "");
        standard_1.put("7320000", "");


        standard_1.put("7.5", "");
        standard_1.put("75", "");
        standard_1.put("750", "");
        standard_1.put("7500", "");
        standard_1.put("75000", "");
        standard_1.put("750000", "");
        standard_1.put("7500000", "");

        standard_1.put("7.68", "");
        standard_1.put("76.8", "");
        standard_1.put("768", "");
        standard_1.put("7680", "");
        standard_1.put("76800", "");
        standard_1.put("768000", "");
        standard_1.put("7680000", "");


        standard_1.put("7.87", "");
        standard_1.put("78.7", "");
        standard_1.put("787", "");
        standard_1.put("7870", "");
        standard_1.put("78700", "");
        standard_1.put("787000", "");
        standard_1.put("7870000", "");

        standard_1.put("8.06", "");
        standard_1.put("80.6", "");
        standard_1.put("806", "");
        standard_1.put("8060", "");
        standard_1.put("80600", "");
        standard_1.put("806000", "");
        standard_1.put("8060000", "");


        standard_1.put("8.25", "");
        standard_1.put("82.5", "");
        standard_1.put("825", "");
        standard_1.put("8250", "");
        standard_1.put("82500", "");
        standard_1.put("825000", "");
        standard_1.put("8250000", "");

        standard_1.put("8.45", "");
        standard_1.put("84.5", "");
        standard_1.put("845", "");
        standard_1.put("8450", "");
        standard_1.put("84500", "");
        standard_1.put("845000", "");
        standard_1.put("8450000", "");


        standard_1.put("8.66", "");
        standard_1.put("86.6", "");
        standard_1.put("866", "");
        standard_1.put("8660", "");
        standard_1.put("86600", "");
        standard_1.put("866000", "");
        standard_1.put("8660000", "");

        standard_1.put("8.87", "");
        standard_1.put("88.7", "");
        standard_1.put("887", "");
        standard_1.put("8870", "");
        standard_1.put("88700", "");
        standard_1.put("887000", "");
        standard_1.put("8870000", "");


        standard_1.put("9.09", "");
        standard_1.put("90.9", "");
        standard_1.put("909", "");
        standard_1.put("9090", "");
        standard_1.put("90900", "");
        standard_1.put("909000", "");
        standard_1.put("9090000", "");

        standard_1.put("9.31", "");
        standard_1.put("93.1", "");
        standard_1.put("931", "");
        standard_1.put("9310", "");
        standard_1.put("93100", "");
        standard_1.put("931000", "");
        standard_1.put("9310000", "");


        standard_1.put("9.53", "");
        standard_1.put("95.3", "");
        standard_1.put("953", "");
        standard_1.put("9530", "");
        standard_1.put("95300", "");
        standard_1.put("953000", "");
        standard_1.put("9530000", "");

        standard_1.put("9.76", "");
        standard_1.put("97.6", "");
        standard_1.put("976", "");
        standard_1.put("9760", "");
        standard_1.put("97600", "");
        standard_1.put("976000", "");
        standard_1.put("9760000", "");


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
        row5_2 = (ImageView) findViewById(R.id.imageView23);
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


        row0_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();


                    }
                }
            }
        });


        row1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


                    }
                }
            }
        });


        row2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


                    }
                }
            }
        });


        row3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();

                    }
                }
            }
        });

        row4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }
                        ResisitorFormat.format_check();

                    }
                }
            }
        });


        row5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();

                    }
                }
            }
        });


        row6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();


                    }
                }
            }
        });


        row7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();


                    }
                }
            }
        });


        row8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();


                    }
                }
            }
        });


        row9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();

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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();
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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


                    }
                }


            }
        });


        row5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("green")) {
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


                        third_band.setImageResource(R.drawable.green);

                        tolerance1.setText(fourth_band_value);


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


                    }
                }


            }
        });


        row6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("blue")) {
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


                        third_band.setImageResource(R.drawable.blue);

                        tolerance1.setText(fourth_band_value);


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


                    }
                }


            }
        });


        row7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("voilet")) {
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


                        third_band.setImageResource(R.drawable.voilet);

                        tolerance1.setText(fourth_band_value);


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();
                    }
                }


            }
        });


        row8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("grey")) {
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


                        third_band.setImageResource(R.drawable.grey);

                        tolerance1.setText(fourth_band_value);

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();

                    }
                }


            }
        });


        row9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                    if (entry1.getKey().equalsIgnoreCase("white")) {
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


                        third_band.setImageResource(R.drawable.white);

                        tolerance1.setText(fourth_band_value);


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();

                    }
                }


            }
        });

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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                    }
                }

                ResisitorFormat.format_check();

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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();

                    }
                }


            }
        });


        row1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "1%";
                tolerance1.setText(fourth_band_value);
                fourth_band.setImageResource(R.drawable.brown);

                if (fourth_band_value.equalsIgnoreCase("10%")) {
                    for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                        if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                    for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                        if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                    for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                        if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                    for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                        if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                    for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                        if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                }


            }
        });


        row2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "2%";
                tolerance1.setText(fourth_band_value);
                fourth_band.setImageResource(R.drawable.red);

                if (fourth_band_value.equalsIgnoreCase("10%")) {
                    for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                        if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                    for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                        if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                    for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                        if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                    for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                        if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                    for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                        if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                }


            }
        });


        row5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "0.5%";
                tolerance1.setText(fourth_band_value);

                fourth_band.setImageResource(R.drawable.green);
                if (fourth_band_value.equalsIgnoreCase("10%")) {
                    for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                        if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                    for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                        if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                    for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                        if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                    for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                        if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                    for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                        if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                }


            }
        });


        row6_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "0.25%";
                tolerance1.setText(fourth_band_value);

                fourth_band.setImageResource(R.drawable.blue);
                if (fourth_band_value.equalsIgnoreCase("10%")) {
                    for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                        if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                    for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                        if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                    for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                        if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                    for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                        if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                    for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                        if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                }


            }
        });


        row7_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "0.1%";
                tolerance1.setText(fourth_band_value);

                fourth_band.setImageResource(R.drawable.voilet);
                if (fourth_band_value.equalsIgnoreCase("10%")) {
                    for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                        if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                    for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                        if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                    for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                        if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                    for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                        if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                    for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                        if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                }


            }
        });

        row8_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "0.05%";
                tolerance1.setText(fourth_band_value);
                fourth_band.setImageResource(R.drawable.grey);

                if (fourth_band_value.equalsIgnoreCase("10%")) {
                    for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                        if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                    for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                        if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                    for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                        if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                    for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                        if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                    for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                        if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                }


            }
        });


        row10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "5%";
                tolerance1.setText(fourth_band_value);

                fourth_band.setImageResource(R.drawable.gold);
                if (fourth_band_value.equalsIgnoreCase("10%")) {
                    for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                        if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                    for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                        if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;

                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                    for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                        if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;

                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                    for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                        if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;

                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                    for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                        if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;

                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                }


            }
        });


        row11_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fourth_band_value = "10%";
                tolerance1.setText(fourth_band_value);

                //  tolerance1.setText(String.valueOf(combine_first_second));

                fourth_band.setImageResource(R.drawable.silver);
                if (fourth_band_value.equalsIgnoreCase("10%")) {
                    for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                        if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                    for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                        if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                    for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                        if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                    for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                        if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                    for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                        if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                            standard_non_standard.setImageResource(R.drawable.tick);
                            break;
                        } else {
                            standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                        }

                    }
                }


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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


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
                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();

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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();


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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();


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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();


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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }


                        ResisitorFormat.format_check();


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


                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();


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

                        if (fourth_band_value.equalsIgnoreCase("10%")) {
                            for (Map.Entry<String, String> entry11 : standard_10.entrySet()) {

                                if (entry11.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("20%")) {

                            for (Map.Entry<String, String> entry13 : standard_20.entrySet()) {

                                if (entry13.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("2%")) {
                            for (Map.Entry<String, String> entry15 : standard_2.entrySet()) {

                                if (entry15.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("1%")) {
                            for (Map.Entry<String, String> entry17 : standard_1.entrySet()) {

                                if (entry17.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        } else if (fourth_band_value.equalsIgnoreCase("0.5%") || fourth_band_value.equalsIgnoreCase("0.25%") || fourth_band_value.equalsIgnoreCase("0.1%") || fourth_band_value.equalsIgnoreCase("0.5%")) {

                            for (Map.Entry<String, String> entry19 : standard_combine.entrySet()) {

                                if (entry19.getKey().equalsIgnoreCase(String.valueOf(combine_first_second))) {
                                    standard_non_standard.setImageResource(R.drawable.tick);
                                    break;
                                } else {
                                    standard_non_standard.setImageResource(R.drawable.exclamation_mark);

                                }

                            }
                        }

                        ResisitorFormat.format_check();

                    }
                }


            }
        });


    }
}
