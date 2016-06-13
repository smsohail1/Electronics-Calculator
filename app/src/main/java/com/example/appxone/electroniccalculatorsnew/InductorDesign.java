package com.example.appxone.electroniccalculatorsnew;

import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by AppXone on 13-Jun-16.
 */
public class InductorDesign extends AppCompatActivity {
    Double diameter, height, turns, micro, length, radius, area_calculate, height_l_calculate, length_L_calculated;
    Typeface typeface;
    RelativeLayout diameter_layout, height_layout, turns_layout, micro_layout, length_layout;
    TextView gain_value_diameter, gain_value_height, gain_value_turns, gain_value_micro, gain_value_length, area;
    TextView dialog_edidtext, dialog_header;
    Button diaog_cancel_button, dialog_ok_button;
    Dialog dialog_custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solenoid);

        LayoutInflater inflator = getLayoutInflater();
        final View view = inflator.inflate(R.layout.dialog, null);
        dialog_header = (TextView) view.findViewById(R.id.header);
        dialog_edidtext = (TextView) view.findViewById(R.id.editText);
        diaog_cancel_button = (Button) view.findViewById(R.id.cancel_button);
        dialog_ok_button = (Button) view.findViewById(R.id.ok_button);
        //  unit = (TextView) view.findViewById(R.id.unit);
        //  unit_convertion = (TextView) view.findViewById(R.id.unit_conversion);


        dialog_header.setTypeface(typeface);


        dialog_custom = new Dialog(InductorDesign.this);
        dialog_custom.setCancelable(true);
        dialog_custom.setContentView(view);


        diameter_layout = (RelativeLayout) findViewById(R.id.diameter_layout);

        //   height_layout = (RelativeLayout) findViewById(R.id.height_layout);

        turns_layout = (RelativeLayout) findViewById(R.id.turns_layout);

        micro_layout = (RelativeLayout) findViewById(R.id.relative_layout);

        length_layout = (RelativeLayout) findViewById(R.id.length_layout);

//value text
        gain_value_diameter = (TextView) findViewById(R.id.gain_value_diameter);

        // gain_value_height = (TextView) findViewById(R.id.gain_value_height);

        gain_value_turns = (TextView) findViewById(R.id.gain_value_turns);
        gain_value_micro = (TextView) findViewById(R.id.gain_value_relative);

        gain_value_length = (TextView) findViewById(R.id.gain_value_length);

        area = (TextView) findViewById(R.id.area_value);

        diameter_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
                        diameter = Double.valueOf(gain_value_diameter.getText().toString());
                        height = Double.valueOf(gain_value_height.getText().toString());
                        turns = Double.valueOf(gain_value_turns.getText().toString());
                        micro = Double.valueOf(gain_value_micro.getText().toString());
                        length = Double.valueOf(gain_value_length.getText().toString());
                        radius = diameter / 2;

                        area_calculate = Math.pow(radius, 2) * 3.142;
                        area.setText(area_calculate.toString());

                        height_l_calculate = (Math.pow(turns, 2) * micro * area_calculate) / length;
                        length_L_calculated = (Math.pow(turns, 2) * micro * area_calculate) / height_l_calculate;
                        gain_value_length.setText(length_L_calculated.toString());

                        dialog_custom.dismiss();
                    }
                });


            }
        });


//        height_layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            }
//        });
        turns_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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

                        diameter = Double.valueOf(gain_value_diameter.getText().toString());
                        height = Double.valueOf(gain_value_height.getText().toString());
                        micro = Double.valueOf(gain_value_micro.getText().toString());
                        length = Double.valueOf(gain_value_length.getText().toString());
                        turns = Double.valueOf(gain_value_turns.getText().toString());

                        radius = diameter / 2;

                        area_calculate = Math.pow(radius, 2) * 3.142;


                        height_l_calculate = (Math.pow(turns, 2) * micro * area_calculate) / length;

                        length_L_calculated = (Math.pow(turns, 2) * micro * area_calculate) / height_l_calculate;

                        gain_value_length.setText(length_L_calculated.toString());
                        dialog_custom.dismiss();

                    }
                });
            }
        });
        length_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        micro_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
                        diameter = Double.valueOf(gain_value_diameter.getText().toString());
                        height = Double.valueOf(gain_value_height.getText().toString());
                        micro = Double.valueOf(gain_value_micro.getText().toString());
                        length = Double.valueOf(gain_value_length.getText().toString());
                        turns = Double.valueOf(gain_value_turns.getText().toString());

                        radius = diameter / 2;

                        area_calculate = Math.pow(radius, 2) * 3.142;


                        height_l_calculate = (Math.pow(turns, 2) * micro * area_calculate) / length;

                        length_L_calculated = (Math.pow(turns, 2) * micro * area_calculate) / height_l_calculate;

                        gain_value_length.setText(length_L_calculated.toString());


                        dialog_custom.dismiss();
                    }
                });

            }
        });
    }
}
