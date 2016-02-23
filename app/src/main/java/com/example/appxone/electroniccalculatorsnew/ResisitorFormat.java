package com.example.appxone.electroniccalculatorsnew;

/**
 * Created by APPXONE on 1/27/2016.
 */

import java.text.NumberFormat;

public class ResisitorFormat {

    String value;
    NumberFormat format;
    String dd;

    public void format_check() {
        //ResistorColorCode.combine_values.setText("sds");
        if (ResistorColorCode.third_band_value.equalsIgnoreCase("1")) {
            value = String.valueOf(ResistorColorCode.combine_first_second);
            //   ResistorColorCode.combine_values.setText(String.valueOf(ResistorColorCode.combine_first_second));
            ResistorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " ");
        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("10")) {

            value = String.valueOf(ResistorColorCode.combine_first_second);
            // ResistorColorCode.combine_values.setText(String.valueOf(ResistorColorCode.combine_first_second));
            ResistorColorCode.combine_values.setText(value + "0");


        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("100")) {

            //format=new DecimalFormat("##.##");
            value = String.valueOf(ResistorColorCode.combine_first_second);

            // value   =  format.format(ResistorColorCode.combine_first_second);
            //  dd=  String.format("%2.0f", ResistorColorCode.combine_first_second);
            ResistorColorCode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " k");

        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("1000")) {

            value = String.valueOf(ResistorColorCode.combine_first_second);
            ResistorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " k");


        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("10000")) {

            value = String.valueOf(ResistorColorCode.combine_first_second);

            ResistorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + "0" + " k");
        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("100000")) {
            value = String.valueOf(ResistorColorCode.combine_first_second);

            ResistorColorCode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " M");

        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("1000000")) {


            value = String.valueOf(ResistorColorCode.combine_first_second);

            ResistorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " M");

        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("10000000")) {

            value = String.valueOf(ResistorColorCode.combine_first_second);

            ResistorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + "" + "0" + " M");
        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("100000000")) {

            value = String.valueOf(ResistorColorCode.combine_first_second);

            ResistorColorCode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " G");

        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("1000000000")) {


            value = String.valueOf(ResistorColorCode.combine_first_second);

            ResistorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " G");

        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("0.1")) {

            value = String.valueOf(ResistorColorCode.combine_first_second);

            //ResistorColorCode.combine_values.setText(value.charAt(0)+"."+value.charAt(1));
            ResistorColorCode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " ");
        } else if (ResistorColorCode.third_band_value.equalsIgnoreCase("0.01")) {

            value = String.valueOf(ResistorColorCode.combine_first_second);

            //ResistorColorCode.combine_values.setText(value.charAt(0)+"."+value.charAt(1)+""+value.charAt(2));
            ResistorColorCode.combine_values.setText("0." + value + " ");
        }
//
//
//        for (Map.Entry<String, String> entry1 : ResistorColorCode.color_Coding_band3.entrySet()) {
//            if (entry1.getValue().equalsIgnoreCase(ResistorColorCode.fourth_band_value)) {
//                second_band_value = entry1.getValue();
//
//
//
//            }
//           else if (entry1.getValue().equalsIgnoreCase(ResistorColorCode.fourth_band_value)) {
//                second_band_value = entry1.getValue();
//
//
//
//            }
//        }


    }
}
