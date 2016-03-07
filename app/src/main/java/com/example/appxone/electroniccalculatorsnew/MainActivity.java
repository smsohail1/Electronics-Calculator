package com.example.appxone.electroniccalculatorsnew;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public ArrayList<CalculatorModel> calculatormodel;
    public CalculatorsAdapter calculator_adapter;
    public ListView calculator_List;
    HashMap<Integer, Class> Listview_Selection = new HashMap<>();
    Class get_Position_title;
    TextView header_app;
    Typeface typeface;
    String publishteId,ad_Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

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


        header_app = (TextView) findViewById(R.id.app_header);
        typeface = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTStd-Medium.otf");
        header_app.setTypeface(typeface);
        Listview_Selection.put(0, ResistorColorCode.class);
        Listview_Selection.put(1, SMDresisitorcode.class);


        Listview_Selection.put(2, IndicatorColorCode.class);

        Listview_Selection.put(3, CapacitorCharge.class);
       // Listview_Selection.put(3, OhmsLaw.class);
        Listview_Selection.put(4, ResistorserialParallel.class);
        calculatormodel = new ArrayList<CalculatorModel>();

        calculatormodel.add(new CalculatorModel(R.drawable.icon_resistor_color_code, "Resistor Color Code"));
        calculatormodel.add(new CalculatorModel(R.drawable.icon_smd_resistor_color_code, "SMD Resisitor Code"));
        calculatormodel.add(new CalculatorModel(R.drawable.icon_inductor_color_code, "Inductor Color code"));
      //  calculatormodel.add(new CalculatorModel(R.drawable.icon_ohms_low, "Ohm's Law"));
        calculatormodel.add(new CalculatorModel(R.drawable.icon_capasitor_charge, "Capacitor Charge"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_reactance_resonace, "Reactance/Resonance"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_filters, "Filters"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_voltage_divider, "Voltage Divider"));
        //calculatormodel.add(new CalculatorModel(R.drawable.icon_resistor_ratio, "Resistor Ratio"));
        calculatormodel.add(new CalculatorModel(R.drawable.icon_resistor_series_paralle, "Resisitor series/parallel"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_capasitor_charge, "Capacitor charge"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_operation_amlifier, "Operational Amplifier"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_led_resistro_calculator, "LED Resistor Calculator"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_adjutable_volrage_regulator, "Adjustable voltage regulator"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_ne555_calculator, "NE555 Calculator"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_power_dissipation, "Power dissipation"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_battery_life_calculator, "Battery Life calculator"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_inductor_design_tool, "Inductor Design Tool"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_voltage_drop_calculator, "Voltage Drop Calculator"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_pcb_trace_with_calculator, "PCB Trace Width  Calculator"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_power_calculator, "Power Calculator"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_transformation, "Y- Transformation"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_descible_converter, "Decibel Converter"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_frequency_converter, "Frequency Converter"));
//        calculatormodel.add(new CalculatorModel(R.drawable.icon_analog_digital_converter, "Analog-Digital Converter"));
        calculator_List = (ListView) findViewById(R.id.list_calculator);
        calculator_adapter = new CalculatorsAdapter(getApplicationContext(), calculatormodel);
        calculator_List.setAdapter(calculator_adapter);
        calculator_List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                for (Map.Entry<Integer, Class> entry1 : Listview_Selection.entrySet()) {
                    if (entry1.getKey() == position) {
                        get_Position_title = entry1.getValue();
                        Intent intent = new Intent(MainActivity.this, get_Position_title);
                        startActivity(intent);
                    }
                }

            }
        });
    }
}
