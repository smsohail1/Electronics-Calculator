package com.example.appxone.electroniccalculatorsnew;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by APPXONE on 4/7/2016.
 */
public class Powerdissipation extends ActionBarActivity {

    TextView dialog_edidtext, dialog_header;
    Button diaog_cancel_button, dialog_ok_button;
    Dialog dialog_custom;
    public static TextView unit_convertion;
    RelativeLayout power_rel, RTH_rel, ambient_rel, junction_rel;
    TextView power_unit, RTH_unit, ambient_unit, junction_unit;
    TextView power_value, ambient_value, junction_value, RTH_value;
    Double double_juntion, double_ambient, double_rth, double_power;
    DecimalFormat format;
    Toast t;
    String fre;
    int check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.powerdissipation);

        t = Toast.makeText(Powerdissipation.this, "Invalid Digit", Toast.LENGTH_SHORT);
        format = new DecimalFormat(".00");
        power_rel = (RelativeLayout) findViewById(R.id.gain_rel);

        RTH_rel = (RelativeLayout) findViewById(R.id.gain_rel_rth);
        ambient_rel = (RelativeLayout) findViewById(R.id.gain_rel_ambient);

        junction_rel = (RelativeLayout) findViewById(R.id.gain_rel_junction);


        power_value = (TextView) findViewById(R.id.gain_value);
        ambient_value = (TextView) findViewById(R.id.gain_value_ambient);

        RTH_value = (TextView) findViewById(R.id.gain_value_rth);

        junction_value = (TextView) findViewById(R.id.gain_value_junction);


        LayoutInflater inflator = getLayoutInflater();
        final View view = inflator.inflate(R.layout.dialog, null);
        dialog_header = (TextView) view.findViewById(R.id.header);
        dialog_edidtext = (TextView) view.findViewById(R.id.editText);
        diaog_cancel_button = (Button) view.findViewById(R.id.cancel_button);
        dialog_ok_button = (Button) view.findViewById(R.id.ok_button);
        //  unit = (TextView) view.findViewById(R.id.unit);
        unit_convertion = (TextView) view.findViewById(R.id.unit_conversion);
        power_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                unit_convertion.setText("W");
                dialog_header.setText("Insert the value of Power");
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
                        fre = dialog_edidtext.getText().toString();

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
                            // int length = fre.length();
                            double_ambient = Double.parseDouble(ambient_value.getText().toString());
                            double_rth = Double.parseDouble(RTH_value.getText().toString());
                            double_juntion = Double.parseDouble(junction_value.getText().toString());
                        }
                        dialog_custom.dismiss();
                    }
                });


            }
        });

    }
}
