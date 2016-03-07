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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.text.DecimalFormat;

/**
 * Created by APPXONE on 1/29/2016.
 */
public class ResistorserialParallel extends AppCompatActivity {
    Dialog dialog_custom;
    String serial_r1_get, serial_r2_get, parallel_r1_get, parallel_r2_get;

    TextView r1_serial, r2_serial, r1_parallel, r2_parallel, series_total, parallel_total;
    TextView dialog_edidtext, dialog_header;
    Button diaog_cancel_button, dialog_ok_button;
    Typeface typeface;


    //  Integer serial_r1_get_int, serial_r2_get_int, serial_total;
    Double serial_r1_get_double, serial_r2_get_double, serial_total;
    double parallel_r1_get_double, parallel_r2_get_double, parallel_total1_double;

    DecimalFormat format;

    String publishteId, ad_Id;
    Toast toast;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.resistor_serial_parallel);

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

toast=Toast.makeText(ResistorserialParallel.this,"Please Enter Some Value",Toast.LENGTH_SHORT);

        typeface = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTStd-Medium.otf");

        format = new DecimalFormat("0.00");

        LayoutInflater inflator = getLayoutInflater();
        final View view = inflator.inflate(R.layout.dialog, null);
        dialog_header = (TextView) view.findViewById(R.id.header);
        dialog_edidtext = (TextView) view.findViewById(R.id.editText);
        diaog_cancel_button = (Button) view.findViewById(R.id.cancel_button);
        dialog_ok_button = (Button) view.findViewById(R.id.ok_button);

        dialog_header.setTypeface(typeface);

        r1_serial = (TextView) findViewById(R.id.R1_serial);

        r2_serial = (TextView) findViewById(R.id.R2_serial);
        r1_parallel = (TextView) findViewById(R.id.R1_parallel);
        r2_parallel = (TextView) findViewById(R.id.R2_parallel);

        series_total = (TextView) findViewById(R.id.series_total);
        parallel_total = (TextView) findViewById(R.id.parallel_total);
        dialog_custom = new Dialog(ResistorserialParallel.this);
        dialog_custom.setCancelable(true);
        dialog_custom.setContentView(view);

        r1_serial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_header.setText("Insert the value of R1 series");
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
                        serial_r1_get = dialog_edidtext.getText().toString();


                        if (serial_r1_get.equalsIgnoreCase("")) {
                            toast.show();
                        } else {


                            serial_r1_get_double = Double.valueOf(serial_r1_get);

                            serial_r2_get = r2_serial.getText().toString();
                            serial_r2_get_double = Double.valueOf(serial_r2_get);

                            serial_total = serial_r1_get_double + serial_r2_get_double;
                            series_total.setText(String.valueOf(serial_total));
                            r1_serial.setText(serial_r1_get);
                            dialog_custom.dismiss();
                        }
                    }
                });
            }
        });


        r2_serial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_header.setText("Insert the value of R2 series");

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

                        serial_r2_get = dialog_edidtext.getText().toString();
                        if (serial_r2_get.equalsIgnoreCase("")) {
                            toast.show();

                        } else {
                            serial_r2_get_double = Double.valueOf(serial_r2_get);

                            serial_r1_get = r1_serial.getText().toString();
                            serial_r1_get_double = Double.valueOf(serial_r1_get);

                            serial_total = serial_r1_get_double + serial_r2_get_double;
                            series_total.setText(String.valueOf(serial_total));
                            r2_serial.setText(serial_r2_get);
                            dialog_custom.dismiss();
                        }
                    }
                });
            }
        });


        r1_parallel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_header.setText("Insert the value of R1 parallel");

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

                        parallel_r1_get = dialog_edidtext.getText().toString();
                        if (parallel_r1_get.equalsIgnoreCase("")) {
                            toast.show();

                        } else {
                            parallel_r1_get_double = Double.valueOf(parallel_r1_get);

                            parallel_r2_get = r2_parallel.getText().toString();
                            parallel_r2_get_double = Double.valueOf(parallel_r2_get);

                            parallel_total1_double = (1 / parallel_r1_get_double) + (1 / parallel_r2_get_double);
                            parallel_total1_double = 1 / parallel_total1_double;
                            String return_format = format.format(parallel_total1_double);
                            parallel_total.setText(return_format);
                            r1_parallel.setText(parallel_r1_get);
                            dialog_custom.dismiss();
                        }
                    }
                });
            }
        });


        r2_parallel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_header.setText("Insert the value of R2 parallel");

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
                        parallel_r2_get = dialog_edidtext.getText().toString();

                        if (parallel_r2_get.equalsIgnoreCase("")) {
                            toast.show();

                        } else {
                            parallel_r2_get_double = Double.valueOf(parallel_r2_get);

                            parallel_r1_get = r1_parallel.getText().toString();
                            parallel_r1_get_double = Double.valueOf(parallel_r1_get);

                            parallel_total1_double = (1 / parallel_r1_get_double) + (1 / parallel_r2_get_double);
                            parallel_total1_double = 1 / parallel_total1_double;
                            String return_format = format.format(parallel_total1_double);
                            parallel_total.setText(return_format);
                            r2_parallel.setText(parallel_r2_get);
                            dialog_custom.dismiss();
                        }
                    }
                });
            }
        });
    }
}
