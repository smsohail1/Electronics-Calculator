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

import java.text.DecimalFormat;

/**
 * Created by APPXONE on 3/8/2016.
 */
public class Frequencyconverter extends AppCompatActivity {
    TextView unit;
    TextView dialog_edidtext, dialog_header;
    Button diaog_cancel_button, dialog_ok_button;
    Dialog dialog_custom;
    TextView frequency_val, period_val, wavvelocity_val, wavelength_val;
    RelativeLayout frequency_rel, period_rel, wavvelocity_rel, wavelength_rel;
    TextView frq_unit, period_unit, wavevelocity_unit, wavelength_unit;
    TextView lamda2_value, lamda4_value, lamda8_value;
    TextView lamda2_unit, lamda4_unit, lamda8_unit;

    String fre, per, wavevelocity, wavelength;

    Double OUTPUT_PERIOD, OUTPUT_WAVELENGTH, OUTPUT_fre;
    Typeface typeface;
    Double fre_double, per_double, wavevelocity_double, wavelength_double;

    DecimalFormat format;

    Double first_two_sub, final_sub, first_sub;

    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frequncyconverter);

        getSupportActionBar().hide();
        format = new DecimalFormat(".0");

        typeface = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTStd-Medium.otf");

        lamda2_value = (TextView) findViewById(R.id.lamda2_value);

        lamda4_value = (TextView) findViewById(R.id.lamda4_value_desc);

        lamda8_value = (TextView) findViewById(R.id.lamda8_value_desc);

        frequency_rel = (RelativeLayout) findViewById(R.id.gain_rel);

        period_rel = (RelativeLayout) findViewById(R.id.power_rel);
        wavvelocity_rel = (RelativeLayout) findViewById(R.id.wave_rel);

        wavelength_rel = (RelativeLayout) findViewById(R.id.wavelength_rel);


        frequency_val = (TextView) findViewById(R.id.gain_value);

        period_val = (TextView) findViewById(R.id.power_value);

        wavvelocity_val = (TextView) findViewById(R.id.wave_value);

        wavelength_val = (TextView) findViewById(R.id.wavelength_value);


        LayoutInflater inflator = getLayoutInflater();
        final View view = inflator.inflate(R.layout.dialog, null);
        dialog_header = (TextView) view.findViewById(R.id.header);
        dialog_edidtext = (TextView) view.findViewById(R.id.editText);
        diaog_cancel_button = (Button) view.findViewById(R.id.cancel_button);
        dialog_ok_button = (Button) view.findViewById(R.id.ok_button);
        unit = (TextView) view.findViewById(R.id.unit);


        dialog_header.setTypeface(typeface);


        dialog_custom = new Dialog(Frequencyconverter.this);
        dialog_custom.setCancelable(true);
        dialog_custom.setContentView(view);
        frequency_rel.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 unit.setText("hz");
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


                                                         fre = dialog_edidtext.getText().toString();
                                                         // per = period_val.getText().toString();
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

                                                         wavevelocity = wavvelocity_val.getText().toString();

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

                                                         dialog_custom.dismiss();

                                                     }
                                                 });


                                             }
                                         }

        );

            wavvelocity_rel.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick(View v) {

                    unit.setText("m/s");
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


                            fre = frequency_val.getText().toString();
                            per = period_val.getText().toString();
                            wavevelocity = dialog_edidtext.getText().toString();
                            fre_double = Double.parseDouble(fre);
                            per_double = Double.parseDouble(per);
                            wavevelocity_double = Double.parseDouble(wavevelocity);

                            //OUTPUT_WAVELENGTH=      wavevelocity_double/fre_double;
                            //    OUTPUT_PERIOD = 1 / fre_double;

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
                            dialog_custom.dismiss();

                        }
                    });


                }
            });
        period_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                unit.setText("s");
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

                        fre = frequency_val.getText().toString();
                        per = dialog_edidtext.getText().toString();
                        wavevelocity = wavvelocity_val.getText().toString();
                        wavelength = wavelength_val.getText().toString();

                        wavevelocity_double = Double.parseDouble(wavevelocity);
                        wavelength_double = Double.parseDouble(wavelength);
                        //  wavelength_double/wavevelocity_double;
                        per_double = Double.parseDouble(per);
                        OUTPUT_fre = 1 / per_double;
//
//                        OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;
                        if (format.format(OUTPUT_fre).toString().charAt(0) == '.') {
                            frequency_val.setText("0"+format.format(OUTPUT_fre).toString());
                        }
                        else {
                            frequency_val.setText(format.format(OUTPUT_fre).toString());
                        }
                        //  period_val.setText(OUTPUT_PERIOD.toString());
                        // wavelength_val.setText(OUTPUT_WAVELENGTH.toString());
                        // t=1/f;


                        wavevelocity = wavvelocity_val.getText().toString();

                        wavevelocity_double = Double.parseDouble(wavevelocity);
                        first_sub = wavevelocity_double / 2;

                        if (format.format(first_sub).toString().charAt(0) == '.') {
                            lamda2_value.setText("0"+format.format(first_sub).toString());
                        }
                        else {
                            lamda2_value.setText(format.format(first_sub).toString());
                        }
                        first_two_sub = first_sub - (wavevelocity_double / 4);

                        if (format.format(first_two_sub).toString().charAt(0) == '.') {
                            lamda4_value.setText("0"+format.format(first_two_sub).toString());
                        }
                        else {
                            lamda4_value.setText(format.format(first_two_sub).toString());
                        }

                        final_sub = first_two_sub - (wavevelocity_double / 8);

                        if (format.format(final_sub).toString().charAt(0) == '.') {
                            lamda8_value.setText("0"+format.format(final_sub).toString());
                        }
                        else {
                            lamda8_value.setText(format.format(final_sub).toString());
                        }
                        dialog_custom.dismiss();

                    }
                });
            }
        });
        wavelength_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unit.setText("m");
                dialog_header.setText("Insert the value of Wavelength");
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


                        fre = frequency_val.getText().toString();
                        per = period_val.getText().toString();
                        wavevelocity = wavvelocity_val.getText().toString();
                        wavelength = dialog_edidtext.getText().toString();

                        fre_double = Double.parseDouble(fre);
                        per_double = Double.parseDouble(per);
                        wavevelocity_double = Double.parseDouble(wavevelocity);
                        OUTPUT_PERIOD = 1 / fre_double;

                        OUTPUT_WAVELENGTH = wavevelocity_double / fre_double;

                        period_val.setText(format.format(OUTPUT_PERIOD).toString());
                        wavelength_val.setText(OUTPUT_WAVELENGTH.toString());
                        // t=1/f;


                        wavevelocity = wavvelocity_val.getText().toString();

                        wavevelocity_double = Double.parseDouble(wavevelocity);
                        first_sub = wavevelocity_double / 2;
                        lamda2_value.setText(format.format(first_sub).toString());
                        first_two_sub = first_sub - (wavevelocity_double / 4);
                        lamda4_value.setText(format.format(first_two_sub).toString());


                        final_sub = first_two_sub - (wavevelocity_double / 8);
                        lamda8_value.setText(format.format(final_sub).toString());
                        dialog_custom.dismiss();

                    }
                });
            }
        });

    }
}
