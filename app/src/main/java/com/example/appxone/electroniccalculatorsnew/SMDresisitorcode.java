package com.example.appxone.electroniccalculatorsnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by APPXONE on 2/23/2016.
 */


public class SMDresisitorcode extends AppCompatActivity {
    EditText SMD_input;
    Button calculate;
    String text;
    int text_length;
    TextView smd_calculated_value;
    String first_second_char, third_string,third_band_hash;
    int parse_first_second;
    int third_char;
    public  HashMap<String, String> color_Coding_band3 = new HashMap<>();
  public static   String calculated_value;
int calculated_int;
    ResisitorFormat ResisitorFormat;
    public static  String  third_format_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smdcolorcode);

        ResisitorFormat = new ResisitorFormat();
        color_Coding_band3.put("0", "1");
        color_Coding_band3.put("1", "10");
        color_Coding_band3.put("2", "100");
        color_Coding_band3.put("3", "1000");
        color_Coding_band3.put("4", "10000");
        color_Coding_band3.put("5", "100000");
        color_Coding_band3.put("6", "1000000");
        color_Coding_band3.put("7", "10000000");
        color_Coding_band3.put("8", "100000000");
        color_Coding_band3.put("9", "1000000000");
     //   color_Coding_band3.put("gold", "0.1");
       // color_Coding_band3.put("silver", "0.01");




        SMD_input = (EditText) findViewById(R.id.input_value);
        calculate = (Button) findViewById(R.id.calculate_button);
        smd_calculated_value = (TextView) findViewById(R.id.smd_calculated_value);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = SMD_input.getText().toString();
                if (text.equalsIgnoreCase("")) {
                    smd_calculated_value.setText("Invalid Code");
                } else {
                    text_length = text.length();
                    if (text_length == 1) {
                        smd_calculated_value.setText(text.toString() + " Ω");
                    } else if (text_length == 2) {
                        if (text.charAt(0) == '0') {
                            smd_calculated_value.setText(String.valueOf(text.charAt(1)) + " Ω");
                        } else {

                            smd_calculated_value.setText(text.toString() + " Ω");
                        }
                    } else if (text_length == 3) {

                        first_second_char = String.valueOf(text.charAt(0)) + String.valueOf(text.charAt(1));
                        parse_first_second = Integer.parseInt(first_second_char);
                        third_string = String.valueOf(text.charAt(2));
                        third_format_value=third_string;
                       // third_char = Integer.valueOf(third_string);




                        for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                            if (entry1.getKey().equalsIgnoreCase(third_string)) {
                                third_band_hash = entry1.getValue();
                                third_char=Integer.parseInt(third_band_hash);

                                 calculated_int=    parse_first_second*third_char;
                                calculated_value=String.valueOf(calculated_int);
                                ResisitorFormat.format_check();
                            }
                        }

                       // smd_calculated_value.setText("");
                    }
                    else if (text_length == 4) {

                        first_second_char = String.valueOf(text.charAt(0)) + String.valueOf(text.charAt(1)+ String.valueOf(text.charAt(2)));
                        parse_first_second = Integer.parseInt(first_second_char);
                        third_string = String.valueOf(text.charAt(3));
                        third_format_value=third_string;
                        // third_char = Integer.valueOf(third_string);




                        for (Map.Entry<String, String> entry1 : color_Coding_band3.entrySet()) {
                            if (entry1.getKey().equalsIgnoreCase(third_string)) {
                                third_band_hash = entry1.getValue();
                                third_char=Integer.parseInt(third_band_hash);

                                calculated_int=    parse_first_second*third_char;
                                calculated_value=String.valueOf(calculated_int);
                                ResisitorFormat.format_check();
                            }
                        }

                       // smd_calculated_value.setText("");
                    }
                }

            }
        });


    }
}
