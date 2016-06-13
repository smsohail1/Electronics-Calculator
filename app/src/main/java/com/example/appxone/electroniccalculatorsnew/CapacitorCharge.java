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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.text.DecimalFormat;

/**
 * Created by APPXONE on 2/26/2016.
 */
public class CapacitorCharge extends AppCompatActivity {

    TextView volt_button, resistor_button, capacitor_button, current_time_button;
    TextView current_max, charge_max, current_time_max, charge_time_max;
    TextView dialog_edidtext, dialog_header;
    Button diaog_cancel_button, dialog_ok_button;
    Typeface typeface;
    Dialog dialog_custom;
    String publishteId, ad_Id;
    String volt_value, resistor_value, chapacitor_value, current_time_value;
    public static TextView unit_convertion;
    Double resisitor_doublle, volt_double, capacitor_double, current_time_value_double;
    Toast t3;
    DecimalFormat format;
    Toast t1, t2;
    String s1, s2, s3;
    Double time_zero, product, product_current, ratio, rat, charge_given_time, minus, time_given, exp_given_time, current_result_given;

    RelativeLayout volt_layout,resisitor_layout,capacitor_layout,time_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capacitorchargelayout);

        getSupportActionBar().hide();
        t3 = Toast.makeText(CapacitorCharge.this, "Invalid Digit", Toast.LENGTH_SHORT);

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

        // format=new DecimalFormat(".00");

        volt_layout= (RelativeLayout) findViewById(R.id.gain_rel_rb_volt);

        resisitor_layout= (RelativeLayout) findViewById(R.id.gain_rel_r2_resistor);

        capacitor_layout= (RelativeLayout) findViewById(R.id.gain_rel_r3_charge);

        time_layout= (RelativeLayout) findViewById(R.id.gain_rel_r4_sec);



        volt_button = (TextView) findViewById(R.id.volt_button);

        resistor_button = (TextView) findViewById(R.id.resisitor_button1);

        capacitor_button = (TextView) findViewById(R.id.capacitor_button1);

        current_time_button = (TextView) findViewById(R.id.current_time_button);



        current_time_max = (TextView) findViewById(R.id.current_at_time);
        charge_time_max = (TextView) findViewById(R.id.charge_at_time);
        current_max = (TextView) findViewById(R.id.current_max);

        current_max.setText("2.50");
        current_time_max.setText("2.26");
        charge_time_max.setText("3.81");
        // charge_max = (TextView) findViewById(R.id.charge_max);

        typeface = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTStd-Medium.otf");
        LayoutInflater inflator = getLayoutInflater();
        final View view = inflator.inflate(R.layout.dialog, null);
        dialog_header = (TextView) view.findViewById(R.id.header);
        dialog_edidtext = (TextView) view.findViewById(R.id.editText);

        unit_convertion = (TextView) view.findViewById(R.id.unit_conversion);

//        dialog_edidtext.setFocusableInTouchMode(true);
//        dialog_edidtext.setFocusable(true);
//        dialog_edidtext.requestFocus();

        diaog_cancel_button = (Button) view.findViewById(R.id.cancel_button);
        dialog_ok_button = (Button) view.findViewById(R.id.ok_button);
        dialog_header.setTypeface(typeface);

        dialog_custom = new Dialog(CapacitorCharge.this);
        dialog_custom.setCancelable(true);
        dialog_custom.setContentView(view);

        volt_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unit_convertion.setText("V");
                dialog_header.setText("Insert the value of V");
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

                        volt_value = dialog_edidtext.getText().toString();
                        resistor_value = resistor_button.getText().toString();
                        chapacitor_value = capacitor_button.getText().toString();
                        current_time_value = current_time_button.getText().toString();

                        if (volt_value.equalsIgnoreCase("")) {

                        } else if (volt_value.equalsIgnoreCase("0")) {

                        } else {
                            volt_button.setText(volt_value.toString());
                        }

                        volt_value = dialog_edidtext.getText().toString();

                       int check = 0;
                        for (int i = 0; i < volt_value.length(); i++) {
                            if (volt_value.charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (volt_value.equalsIgnoreCase("")) {
                            t3.show();
                        } else if (check > 1) {
                            t3.show();
                        } else if (volt_value.equalsIgnoreCase(".")) {
                            t3.show();
                        }
                       else if (volt_value.equalsIgnoreCase("0")) {
                            t1 = Toast.makeText(CapacitorCharge.this, "V must be > 0", Toast.LENGTH_SHORT);
                            t1.show();
                        } else if (volt_value.equalsIgnoreCase("")) {
                            t2 = Toast.makeText(CapacitorCharge.this, "Please Enter Some Value", Toast.LENGTH_SHORT);
                            t2.show();
                        } else {

                            volt_double = Double.valueOf(volt_value);
                            resisitor_doublle = Double.valueOf(resistor_value);
                            capacitor_double = Double.valueOf(chapacitor_value);
                            current_time_value_double = Double.valueOf(current_time_value);
                            Double time_zero = volt_double / resisitor_doublle;
                            if (time_zero.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s1 = format.format(time_zero);
                                current_max.setText(s1.toString());
                            } else {
                                current_max.setText(time_zero.toString());
                            }

//
                            Double product = capacitor_double * volt_double;
                            Double product_current = volt_double / resisitor_doublle;


                            Double ratio = resisitor_doublle * capacitor_double;
                            Double rat = (-1) * (current_time_value_double / ratio);


                            Double minus = Math.exp(rat);
                            // Double result_time_given=minus;
                            Double charge_given_time = product_current * minus;

                            if (charge_given_time.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s2 = format.format(charge_given_time);
                                current_time_max.setText(s2.toString());
                            } else {
                                current_time_max.setText(charge_given_time.toString());

                            }


                            Double time_given = (-1) * (current_time_value_double / ratio);


                            Double exp_given_time = 1.0 - (Math.exp(time_given));

                            Double current_result_given = product * exp_given_time;

                            if (current_result_given.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s3 = format.format(current_result_given);
                                charge_time_max.setText(s3.toString());
                            } else {
                                charge_time_max.setText(current_result_given.toString());
                            }


                        }
                        dialog_custom.dismiss();
                    }
                });
            }
        });

        capacitor_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unit_convertion.setText("F");
                dialog_header.setText("Insert the value of C");
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

                        chapacitor_value = dialog_edidtext.getText().toString();
                        resistor_value = resistor_button.getText().toString();
                        volt_value = volt_button.getText().toString();
                        current_time_value = current_time_button.getText().toString();

//
                        if (chapacitor_value.equalsIgnoreCase("")) {
                        } else if (chapacitor_value.equalsIgnoreCase("0")) {

                        } else {
                            capacitor_button.setText(chapacitor_value.toString());
                        }


                        // capacitor_button.setText(chapacitor_value.toString());

                        chapacitor_value = dialog_edidtext.getText().toString();

                        int check = 0;
                        for (int i = 0; i < chapacitor_value.length(); i++) {
                            if (chapacitor_value.charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (chapacitor_value.equalsIgnoreCase("")) {
                            t3.show();
                        } else if (check > 1) {
                            t3.show();
                        } else if (chapacitor_value.equalsIgnoreCase(".")) {
                            t3.show();
                        }
                       else if (chapacitor_value.equalsIgnoreCase("0")) {
                            t1 = Toast.makeText(CapacitorCharge.this, "C must be > 0", Toast.LENGTH_SHORT);
                            t1.show();
                        } else if (chapacitor_value.equalsIgnoreCase("")) {
                            t2 = Toast.makeText(CapacitorCharge.this, "Please Enter Some Value", Toast.LENGTH_SHORT);
                            t2.show();
                        } else {

                            volt_double = Double.valueOf(volt_value);


                            resisitor_doublle = Double.valueOf(resistor_value);
                            capacitor_double = Double.valueOf(chapacitor_value);
                            current_time_value_double = Double.valueOf(current_time_value);
                            time_zero = volt_double / resisitor_doublle;
                            if (time_zero.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s1 = format.format(time_zero);
                                current_max.setText(s1.toString());
                            } else {
                                current_max.setText(time_zero.toString());
                            }

//
                            product = capacitor_double * volt_double;
                            product_current = volt_double / resisitor_doublle;


                            ratio = resisitor_doublle * capacitor_double;
                            rat = (-1) * (current_time_value_double / ratio);


                            minus = Math.exp(rat);
                            // Double result_time_given=minus;
                            charge_given_time = product_current * minus;

                            if (charge_given_time.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s2 = format.format(charge_given_time);
                                current_time_max.setText(s2.toString());
                            } else {
                                current_time_max.setText(charge_given_time.toString());

                            }


                            time_given = (-1) * (current_time_value_double / ratio);


                            exp_given_time = 1.0 - (Math.exp(time_given));

                            current_result_given = product * exp_given_time;

                            if (current_result_given.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s3 = format.format(current_result_given);
                                charge_time_max.setText(s3.toString());
                            } else {
                                charge_time_max.setText(current_result_given.toString());
                            }


                        }

                        dialog_custom.dismiss();


                    }
                });
            }
        });


        resisitor_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unit_convertion.setText("Ω");
                dialog_header.setText("Insert the value of R");
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

                        resistor_value = dialog_edidtext.getText().toString();
                        current_time_value = current_time_button.getText().toString();
                        volt_value = volt_button.getText().toString();
                        chapacitor_value = capacitor_button.getText().toString();


//
                        if (resistor_value.equalsIgnoreCase("")) {
                        } else if (resistor_value.equalsIgnoreCase("0")) {

                        } else {
                            resistor_button.setText(resistor_value.toString());
                        }


                        //capacitor_button.setText(chapacitor_value.toString());
                        resistor_value = dialog_edidtext.getText().toString();

                        int check = 0;
                        for (int i = 0; i < resistor_value.length(); i++) {
                            if (resistor_value.charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (resistor_value.equalsIgnoreCase("")) {
                            t3.show();
                        } else if (check > 1) {
                            t3.show();
                        } else if (resistor_value.equalsIgnoreCase(".")) {
                            t3.show();
                        }
                       else if (resistor_value.equalsIgnoreCase("0")) {
                            t1 = Toast.makeText(CapacitorCharge.this, "R must be > 0", Toast.LENGTH_SHORT);
                            t1.show();
                        } else if (resistor_value.equalsIgnoreCase("")) {
                            t2 = Toast.makeText(CapacitorCharge.this, "Please Enter Some Value", Toast.LENGTH_SHORT);
                            t2.show();
                        } else {

                            volt_double = Double.valueOf(volt_value);



                            resisitor_doublle = Double.valueOf(resistor_value);
                            capacitor_double = Double.valueOf(chapacitor_value);
                            current_time_value_double = Double.valueOf(current_time_value);
                            time_zero = volt_double / resisitor_doublle;







                            if (time_zero.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s1 = format.format(time_zero);
                                current_max.setText(s1.toString());
                            } else {
                                current_max.setText(time_zero.toString());
                            }

//
                            product = capacitor_double * volt_double;
                            product_current = volt_double / resisitor_doublle;


                            ratio = resisitor_doublle * capacitor_double;
                            rat = (-1) * (current_time_value_double / ratio);


                            minus = Math.exp(rat);
                            // Double result_time_given=minus;
                            charge_given_time = product_current * minus;

                            if (charge_given_time.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s2 = format.format(charge_given_time);
                                current_time_max.setText(s2.toString());
                            } else {
                                current_time_max.setText(charge_given_time.toString());

                            }


                            time_given = (-1) * (current_time_value_double / ratio);


                            exp_given_time = 1.0 - (Math.exp(time_given));

                            current_result_given = product * exp_given_time;

                            if (current_result_given.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s3 = format.format(current_result_given);
                                charge_time_max.setText(s3.toString());
                            } else {
                                charge_time_max.setText(current_result_given.toString());
                            }
                          //  String get_current = current_time_max.getText().toString();




//                            String get_current = current_time_max.getText().toString();
//                             Double get_current_double = Double.valueOf(get_current);
//                            Double div = get_current_double / time_zero;
//
//                            Double txt = -1.0 / ratio;
//
//                            Double result = (Math.log(div));
//                            Double resuklt2=result/txt;
//
////                            format = new DecimalFormat(".00");
////                            s1 = format.format(resuklt2);
//                            current_time_button.setText(resuklt2.toString());

                        }

                        dialog_custom.dismiss();


                    }
                });
            }
        });
        time_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unit_convertion.setText("t");
                dialog_header.setText("Insert the value of I");
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


                        current_time_value = dialog_edidtext.getText().toString();
                        resistor_value = resistor_button.getText().toString();
                        volt_value = volt_button.getText().toString();
                        chapacitor_value = capacitor_button.getText().toString();

//
                        if (current_time_value.equalsIgnoreCase("")) {
                        } else if (current_time_value.equalsIgnoreCase("0")) {

                        } else {
                            current_time_button.setText(current_time_value.toString());
                        }


                        //capacitor_button.setText(chapacitor_value.toString());

                        current_time_value = dialog_edidtext.getText().toString();

                        int check = 0;
                        for (int i = 0; i < current_time_value.length(); i++) {
                            if (current_time_value.charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (current_time_value.equalsIgnoreCase("")) {
                            t3.show();
                        } else if (check > 1) {
                            t3.show();
                        } else if (current_time_value.equalsIgnoreCase(".")) {
                            t3.show();
                        }
                       else if (current_time_value.equalsIgnoreCase("0")) {
                            t1 = Toast.makeText(CapacitorCharge.this, "I must be > 0", Toast.LENGTH_SHORT);
                            t1.show();
                        } else if (current_time_value.equalsIgnoreCase("")) {
                            t2 = Toast.makeText(CapacitorCharge.this, "Please Enter Some Value", Toast.LENGTH_SHORT);
                            t2.show();
                        } else {

                            volt_double = Double.valueOf(volt_value);


                            resisitor_doublle = Double.valueOf(resistor_value);
                            capacitor_double = Double.valueOf(chapacitor_value);
                            current_time_value_double = Double.valueOf(current_time_value);
                            time_zero = volt_double / resisitor_doublle;
                            if (time_zero.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s1 = format.format(time_zero);
                                current_max.setText(s1.toString());
                            } else {
                                current_max.setText(time_zero.toString());
                            }

//
                            product = capacitor_double * volt_double;
                            product_current = volt_double / resisitor_doublle;


                            ratio = resisitor_doublle * capacitor_double;
                            rat = (-1) * (current_time_value_double / ratio);


                            minus = Math.exp(rat);
                            // Double result_time_given=minus;
                            charge_given_time = product_current * minus;

                            if (charge_given_time.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s2 = format.format(charge_given_time);
                                current_time_max.setText(s2.toString());
                            } else {
                                current_time_max.setText(charge_given_time.toString());

                            }


                            time_given = (-1) * (current_time_value_double / ratio);


                            exp_given_time = 1.0 - (Math.exp(time_given));

                            current_result_given = product * exp_given_time;

                            if (current_result_given.toString().contains(".")) {
                                format = new DecimalFormat(".00");
                                s3 = format.format(current_result_given);
                                charge_time_max.setText(s3.toString());
                            } else {
                                charge_time_max.setText(current_result_given.toString());
                            }


                        }

                        dialog_custom.dismiss();

                    }
                });
            }
        });


    }
}
