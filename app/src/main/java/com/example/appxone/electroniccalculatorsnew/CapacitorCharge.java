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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/**
 * Created by APPXONE on 2/26/2016.
 */
public class CapacitorCharge extends AppCompatActivity {

    Button volt_button, resistor_button, capacitor_button, current_time_button;
    TextView current_max, charge_max, current_time_max, charge_time_max;
    TextView dialog_edidtext, dialog_header;
    Button diaog_cancel_button, dialog_ok_button;
    Typeface typeface;
    Dialog dialog_custom;
    String publishteId, ad_Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capacitorchargelayout);

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

        volt_button = (Button) findViewById(R.id.volt_button);

        resistor_button = (Button) findViewById(R.id.resisitor_button1);

        capacitor_button = (Button) findViewById(R.id.capacitor_button1);

        current_time_button = (Button) findViewById(R.id.current_time_button);
        current_time_max = (TextView) findViewById(R.id.current_at_time);
        charge_time_max = (TextView) findViewById(R.id.charge_at_time);
        current_max = (TextView) findViewById(R.id.current_max);

        charge_max = (TextView) findViewById(R.id.charge_max);

        typeface = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTStd-Medium.otf");
        LayoutInflater inflator = getLayoutInflater();
        final View view = inflator.inflate(R.layout.dialog, null);
        dialog_header = (TextView) view.findViewById(R.id.header);
        dialog_edidtext = (TextView) view.findViewById(R.id.editText);
        diaog_cancel_button = (Button) view.findViewById(R.id.cancel_button);
        dialog_ok_button = (Button) view.findViewById(R.id.ok_button);
        dialog_header.setTypeface(typeface);

        dialog_custom = new Dialog(CapacitorCharge.this);
        dialog_custom.setCancelable(true);
        dialog_custom.setContentView(view);

        volt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                    }
                });
            }
        });

        capacitor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                    }
                });
            }
        });


        resistor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                    }
                });
            }
        });
        current_time_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                    }
                });
            }
        });



    }
}
