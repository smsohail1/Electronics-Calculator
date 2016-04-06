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
 * Created by APPXONE on 4/6/2016.
 */
public class Ydelta extends ActionBarActivity {
    TextView ra, rb, rc, r1, r2, r3;
    RelativeLayout relative_rb, relative_ra, relative_rc;
    RelativeLayout relative_r1, relative_r2, relative_r3;
    String r1_value, r2_value, r3_value;
    Double r1_double_value, r2_double_value, r3_double_value;
    Dialog dialog_custom;
    TextView dialog_header, dialog_edidtext;
    Button diaog_cancel_button, dialog_ok_button;
    String ra_value, rb_value, rc_value;
    Double ra_double_value, rb_double_value, rc_double_value;
    Double output_divide, output_alphabets;
    DecimalFormat format;
    int check;
    Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.y_delta);

        t = Toast.makeText(Ydelta.this, "Invalid Digit", Toast.LENGTH_SHORT);

        ra = (TextView) findViewById(R.id.gain_value_ra);
        rb = (TextView) findViewById(R.id.gain_value);

        rc = (TextView) findViewById(R.id.gain_value_rc);

        r1 = (TextView) findViewById(R.id.gain_value_r1);

        r2 = (TextView) findViewById(R.id.gain_value_rc_r2);

        r3 = (TextView) findViewById(R.id.gain_value_ra_r3);

        relative_rb = (RelativeLayout) findViewById(R.id.gain_rel_rb);
        relative_ra = (RelativeLayout) findViewById(R.id.gain_rel_ra);
        relative_rc = (RelativeLayout) findViewById(R.id.gain_rel_rc);

        relative_r1 = (RelativeLayout) findViewById(R.id.gain_rel_r1);

        relative_r2 = (RelativeLayout) findViewById(R.id.gain_rel_rc_r2);

        relative_r3 = (RelativeLayout) findViewById(R.id.gain_rel_ra_r3);

        format = new DecimalFormat(".00");

        LayoutInflater inflator = getLayoutInflater();
        final View view = inflator.inflate(R.layout.dialog, null);
        dialog_header = (TextView) view.findViewById(R.id.header);
        dialog_edidtext = (TextView) view.findViewById(R.id.editText);
        diaog_cancel_button = (Button) view.findViewById(R.id.cancel_button);
        dialog_ok_button = (Button) view.findViewById(R.id.ok_button);
        //  unit = (TextView) view.findViewById(R.id.unit);
        // unit_convertion = (TextView) view.findViewById(R.id.unit_conversion);


        dialog_custom = new Dialog(Ydelta.this);
        dialog_custom.setCancelable(true);
        dialog_custom.setContentView(view);

        relative_ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog_header.setText("Insert the value of Ra");
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
                        ra.setText(dialog_edidtext.getText().toString());

                        check = 0;
                        for (int i = 0; i < dialog_edidtext.getText().toString().length(); i++) {
                            if (dialog_edidtext.getText().toString().charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (dialog_edidtext.getText().toString().equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (dialog_edidtext.getText().toString().equalsIgnoreCase(".")) {
                            t.show();
                        } else {

                            ra_value = ra.getText().toString();
                            rb_value = rb.getText().toString();
                            rc_value = rc.getText().toString();
                            ra_double_value = Double.parseDouble(ra_value);
                            rb_double_value = Double.parseDouble(rb_value);

                            rc_double_value = Double.parseDouble(rc_value);


                            output_alphabets = (rb_double_value * rc_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r1.setText(format.format(output_alphabets).toString());


                            output_alphabets = (ra_double_value * rc_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r2.setText(format.format(output_alphabets).toString());


                            output_alphabets = (ra_double_value * rb_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r3.setText(format.format(output_alphabets).toString());

//                            r1_value = r1.getText().toString();
//                            r2_value = r2.getText().toString();
//                            r3_value = r3.getText().toString();
//                            r1_double_value = Double.parseDouble(r1_value);
//                            r2_double_value = Double.parseDouble(r2_value);
//
//                            r3_double_value = Double.parseDouble(r3_value);
//                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
//                            output_divide = output_divide / r1_double_value;
//
//                            rb.setText(format.format(output_divide).toString());
                        }
                    }
                });


            }
        });


        relative_rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog_header.setText("Insert the value of Rb");
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
                        rb.setText(dialog_edidtext.getText().toString());

                        check = 0;
                        for (int i = 0; i < dialog_edidtext.getText().toString().length(); i++) {
                            if (dialog_edidtext.getText().toString().charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (dialog_edidtext.getText().toString().equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (dialog_edidtext.getText().toString().equalsIgnoreCase(".")) {
                            t.show();
                        } else {

                            ra_value = ra.getText().toString();
                            rb_value = rb.getText().toString();
                            rc_value = rc.getText().toString();
                            ra_double_value = Double.parseDouble(ra_value);
                            rb_double_value = Double.parseDouble(rb_value);

                            rc_double_value = Double.parseDouble(rc_value);


                            output_alphabets = (rb_double_value * rc_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r1.setText(format.format(output_alphabets).toString());


                            output_alphabets = (ra_double_value * rc_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r2.setText(format.format(output_alphabets).toString());


                            output_alphabets = (ra_double_value * rb_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r3.setText(format.format(output_alphabets).toString());

//                            r1_value = r1.getText().toString();
//                            r2_value = r2.getText().toString();
//                            r3_value = r3.getText().toString();
//                            r1_double_value = Double.parseDouble(r1_value);
//                            r2_double_value = Double.parseDouble(r2_value);
//
//                            r3_double_value = Double.parseDouble(r3_value);
//                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
//                            output_divide = output_divide / r1_double_value;
//
//                            rb.setText(format.format(output_divide).toString());
                        }
                    }
                });


//                r1_value = r1.getText().toString();
//                r2_value = r2.getText().toString();
//                r3_value = r3.getText().toString();
//                r1_double_value = Double.parseDouble(r1_value);
//                r2_double_value = Double.parseDouble(r2_value);
//
//                r3_double_value = Double.parseDouble(r3_value);
//                output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
//                output_divide = output_divide / r2_double_value;
//
//                rb.setText(format.format(output_divide).toString());

            }
        });

        relative_rc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog_header.setText("Insert the value of Rc");
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
                        rc.setText(dialog_edidtext.getText().toString());

                        check = 0;
                        for (int i = 0; i < dialog_edidtext.getText().toString().length(); i++) {
                            if (dialog_edidtext.getText().toString().charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (dialog_edidtext.getText().toString().equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (dialog_edidtext.getText().toString().equalsIgnoreCase(".")) {
                            t.show();
                        } else {

                            ra_value = ra.getText().toString();
                            rb_value = rb.getText().toString();
                            rc_value = rc.getText().toString();
                            ra_double_value = Double.parseDouble(ra_value);
                            rb_double_value = Double.parseDouble(rb_value);

                            rc_double_value = Double.parseDouble(rc_value);


                            output_alphabets = (rb_double_value * rc_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r1.setText(format.format(output_alphabets).toString());


                            output_alphabets = (ra_double_value * rc_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r2.setText(format.format(output_alphabets).toString());


                            output_alphabets = (ra_double_value * rb_double_value) / (ra_double_value + rb_double_value + rc_double_value);

                            r3.setText(format.format(output_alphabets).toString());

//                            r1_value = r1.getText().toString();
//                            r2_value = r2.getText().toString();
//                            r3_value = r3.getText().toString();
//                            r1_double_value = Double.parseDouble(r1_value);
//                            r2_double_value = Double.parseDouble(r2_value);
//
//                            r3_double_value = Double.parseDouble(r3_value);
//                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
//                            output_divide = output_divide / r1_double_value;
//
//                            rb.setText(format.format(output_divide).toString());
                        }
                    }
                });
//                r1_value = r1.getText().toString();
//                r2_value = r2.getText().toString();
//                r3_value = r3.getText().toString();
//                r1_double_value = Double.parseDouble(r1_value);
//                r2_double_value = Double.parseDouble(r2_value);
//
//                r3_double_value = Double.parseDouble(r3_value);
//                output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
//                output_divide = output_divide / r3_double_value;
//
//                rb.setText(format.format(output_divide).toString());
            }
        });


        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog_header.setText("Insert the value of R1");
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
                        r1.setText(dialog_edidtext.getText().toString());

                        check = 0;
                        for (int i = 0; i < dialog_edidtext.getText().toString().length(); i++) {
                            if (dialog_edidtext.getText().toString().charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (dialog_edidtext.getText().toString().equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (dialog_edidtext.getText().toString().equalsIgnoreCase(".")) {
                            t.show();
                        } else {


                            r1_value = r1.getText().toString();
                            r2_value = r2.getText().toString();
                            r3_value = r3.getText().toString();
                            r1_double_value = Double.parseDouble(r1_value);
                            r2_double_value = Double.parseDouble(r2_value);

                            r3_double_value = Double.parseDouble(r3_value);

                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r1_double_value;

                            ra.setText(format.format(output_divide).toString());

                            // rb.setText(format.format(output_divide).toString());

                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r2_double_value;

                            rb.setText(format.format(output_divide).toString());


                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r3_double_value;

                            rc.setText(format.format(output_divide).toString());
                        }
                    }
                });

            }
        });











        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog_header.setText("Insert the value of R2");
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
                        r2.setText(dialog_edidtext.getText().toString());

                        check = 0;
                        for (int i = 0; i < dialog_edidtext.getText().toString().length(); i++) {
                            if (dialog_edidtext.getText().toString().charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (dialog_edidtext.getText().toString().equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (dialog_edidtext.getText().toString().equalsIgnoreCase(".")) {
                            t.show();
                        } else {


                            r1_value = r1.getText().toString();
                            r2_value = r2.getText().toString();
                            r3_value = r3.getText().toString();
                            r1_double_value = Double.parseDouble(r1_value);
                            r2_double_value = Double.parseDouble(r2_value);

                            r3_double_value = Double.parseDouble(r3_value);

                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r1_double_value;

                            ra.setText(format.format(output_divide).toString());

                            // rb.setText(format.format(output_divide).toString());

                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r2_double_value;

                            rb.setText(format.format(output_divide).toString());


                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r3_double_value;

                            rc.setText(format.format(output_divide).toString());
                        }
                    }
                });

            }
        });







        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog_header.setText("Insert the value of R3");
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
                        r3.setText(dialog_edidtext.getText().toString());

                        check = 0;
                        for (int i = 0; i < dialog_edidtext.getText().toString().length(); i++) {
                            if (dialog_edidtext.getText().toString().charAt(i) == '.') {
                                check++;
                            }
                        }
                        if (dialog_edidtext.getText().toString().equalsIgnoreCase("")) {
                            t.show();
                        } else if (check > 1) {
                            t.show();
                        } else if (dialog_edidtext.getText().toString().equalsIgnoreCase(".")) {
                            t.show();
                        } else {


                            r1_value = r1.getText().toString();
                            r2_value = r2.getText().toString();
                            r3_value = r3.getText().toString();
                            r1_double_value = Double.parseDouble(r1_value);
                            r2_double_value = Double.parseDouble(r2_value);

                            r3_double_value = Double.parseDouble(r3_value);

                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r1_double_value;

                            ra.setText(format.format(output_divide).toString());

                            // rb.setText(format.format(output_divide).toString());

                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r2_double_value;

                            rb.setText(format.format(output_divide).toString());


                            output_divide = (r1_double_value * r2_double_value) + (r2_double_value * r3_double_value) + (r3_double_value * r1_double_value);
                            output_divide = output_divide / r3_double_value;

                            rc.setText(format.format(output_divide).toString());
                        }
                    }
                });

            }
        });
    }
}
