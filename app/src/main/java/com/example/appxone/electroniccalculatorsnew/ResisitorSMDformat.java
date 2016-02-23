package com.example.appxone.electroniccalculatorsnew;

import java.text.NumberFormat;

/**
 * Created by APPXONE on 2/23/2016.
 */

public class ResisitorSMDformat {
    String value;
    NumberFormat format;
    String dd;
    public void format_check() {
        //SMDresisitorcode.combine_values.setText("sds");
        if (SMDresisitorcode.third_format_value.equalsIgnoreCase("1")) {
            value = String.valueOf(SMDresisitorcode.combine_first_second);
            //   SMDresisitorcode.combine_values.setText(String.valueOf(SMDresisitorcode.combine_first_second));
            SMDresisitorcode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " ");
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("10")) {

            value = String.valueOf(SMDresisitorcode.combine_first_second);
            // SMDresisitorcode.combine_values.setText(String.valueOf(SMDresisitorcode.combine_first_second));
            SMDresisitorcode.combine_values.setText(value + "0");


        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("100")) {

            //format=new DecimalFormat("##.##");
            value = String.valueOf(SMDresisitorcode.combine_first_second);

            // value   =  format.format(SMDresisitorcode.combine_first_second);
            //  dd=  String.format("%2.0f", SMDresisitorcode.combine_first_second);
            SMDresisitorcode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " k");

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("1000")) {

            value = String.valueOf(SMDresisitorcode.combine_first_second);
            SMDresisitorcode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " k");


        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("10000")) {

            value = String.valueOf(SMDresisitorcode.combine_first_second);

            SMDresisitorcode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + "0" + " k");
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("100000")) {
            value = String.valueOf(SMDresisitorcode.combine_first_second);

            SMDresisitorcode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " M");

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("1000000")) {


            value = String.valueOf(SMDresisitorcode.combine_first_second);

            SMDresisitorcode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " M");

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("10000000")) {

            value = String.valueOf(SMDresisitorcode.combine_first_second);

            SMDresisitorcode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + "" + "0" + " M");
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("100000000")) {

            value = String.valueOf(SMDresisitorcode.combine_first_second);

            SMDresisitorcode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " G");

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("1000000000")) {


            value = String.valueOf(SMDresisitorcode.combine_first_second);

            SMDresisitorcode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " G");

       }


// else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("0.1")) {
//
//            value = String.valueOf(SMDresisitorcode.combine_first_second);
//
//            //SMDresisitorcode.combine_values.setText(value.charAt(0)+"."+value.charAt(1));
//            SMDresisitorcode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " ");
//        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("0.01")) {
//
//            value = String.valueOf(SMDresisitorcode.combine_first_second);
//
//            //SMDresisitorcode.combine_values.setText(value.charAt(0)+"."+value.charAt(1)+""+value.charAt(2));
//            SMDresisitorcode.combine_values.setText("0." + value + " ");
//        }





//
//
//        for (Map.Entry<String, String> entry1 : SMDresisitorcode.color_Coding_band3.entrySet()) {
//            if (entry1.getValue().equalsIgnoreCase(SMDresisitorcode.fourth_band_value)) {
//                second_band_value = entry1.getValue();
//
//
//
//            }
//           else if (entry1.getValue().equalsIgnoreCase(SMDresisitorcode.fourth_band_value)) {
//                second_band_value = entry1.getValue();
//
//
//
//            }
//        }


    }
}
