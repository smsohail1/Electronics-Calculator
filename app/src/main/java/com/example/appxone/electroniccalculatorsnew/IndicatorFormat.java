package com.example.appxone.electroniccalculatorsnew;

import java.text.NumberFormat;

/**
 * Created by APPXONE on 1/28/2016.
 */

public class IndicatorFormat {

    String value;
    NumberFormat format;
    String dd;

    public void format_check() {
//        value = String.valueOf(IndicatorColorCode.combine_first_second);
//        IndicatorColorCode.row5_2.setText(value);


        //IndicatorColorCode.combine_values.setText("sds");
        if (IndicatorColorCode.third_band_value.equalsIgnoreCase("1")) {

            value = String.valueOf(IndicatorColorCode.combine_first_second);
            //if(value.contains())
//            if (IndicatorColorCode.check_zero == "0") {
//                IndicatorColorCode.combine_values.setText("0 ");
//            } else {
            //   IndicatorColorCode.combine_values.setText(String.valueOf(IndicatorColorCode.combine_first_second));


            if (value.equalsIgnoreCase("0")) {

                IndicatorColorCode.combine_values.setText(value + " ");

            } else {
                IndicatorColorCode.combine_values.setText(value + " " + "μ");
            }
            //}
        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("10")) {

            value = String.valueOf(IndicatorColorCode.combine_first_second);
            if (value.equalsIgnoreCase("0")) {
                IndicatorColorCode.combine_values.setText(value + " ");

            }
            // IndicatorColorCode.combine_values.setText(String.valueOf(IndicatorColorCode.combine_first_second));
            else {
                IndicatorColorCode.combine_values.setText(value + "0" + " μ");


            }


        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("100")) {

            //format=new DecimalFormat("##.##");
            value = String.valueOf(IndicatorColorCode.combine_first_second);

            // value   =  format.format(IndicatorColorCode.combine_first_second);
            //  dd=  String.format("%2.0f", IndicatorColorCode.combine_first_second);

            if (value.equalsIgnoreCase("0")) {

                IndicatorColorCode.combine_values.setText(value + " ");

            }
            //  IndicatorColorCode.combine_values.setText(value+ " μ");
            else if (value.equalsIgnoreCase("1") || value.equalsIgnoreCase("2") ||
                    value.equalsIgnoreCase("3") || value.equalsIgnoreCase("4") || value.equalsIgnoreCase("5") ||

                    value.equalsIgnoreCase("6") || value.equalsIgnoreCase("7") ||

                    value.equalsIgnoreCase("8") ||
                    value.equalsIgnoreCase("9")) {

                IndicatorColorCode.combine_values.setText(value + "00" + " μ");

            } else {
                IndicatorColorCode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " m");
            }
        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("1000")) {

            value = String.valueOf(IndicatorColorCode.combine_first_second);
            if (value.equalsIgnoreCase("0")) {
                IndicatorColorCode.combine_values.setText(value + " ");

            } else if (value.equalsIgnoreCase("1") || value.equalsIgnoreCase("2") ||
                    value.equalsIgnoreCase("3") || value.equalsIgnoreCase("4") || value.equalsIgnoreCase("5") ||

                    value.equalsIgnoreCase("6") || value.equalsIgnoreCase("7") ||

                    value.equalsIgnoreCase("8") ||
                    value.equalsIgnoreCase("9")) {
                IndicatorColorCode.combine_values.setText(value + " m");

            } else {
                IndicatorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " m");
            }

        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("10000")) {

            value = String.valueOf(IndicatorColorCode.combine_first_second);
            if (value.equalsIgnoreCase("0")) {
                IndicatorColorCode.combine_values.setText(value + " ");

            } else if (value.equalsIgnoreCase("1") || value.equalsIgnoreCase("2") ||
                    value.equalsIgnoreCase("3") || value.equalsIgnoreCase("4") || value.equalsIgnoreCase("5") ||

                    value.equalsIgnoreCase("6") || value.equalsIgnoreCase("7") ||

                    value.equalsIgnoreCase("8") ||
                    value.equalsIgnoreCase("9")) {
                IndicatorColorCode.combine_values.setText(value + "0" + " m");
            } else {
                IndicatorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + "0" + " m");
            }
        }
//        else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("100000")) {
//            value = String.valueOf(IndicatorColorCode.combine_first_second);
//
//            IndicatorColorCode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " M");
//
//        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("1000000")) {
//
//
//            value = String.valueOf(IndicatorColorCode.combine_first_second);
//
//            IndicatorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " M");
//
//        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("10000000")) {
//
//            value = String.valueOf(IndicatorColorCode.combine_first_second);
//
//            IndicatorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + "" + "0" + " M");
//        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("100000000")) {
//
//            value = String.valueOf(IndicatorColorCode.combine_first_second);
//
//            IndicatorColorCode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " G");
//
//        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("1000000000")) {
//
//
//            value = String.valueOf(IndicatorColorCode.combine_first_second);
//
//            IndicatorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + " G");
//
//        }

        else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("0.1")) {

            value = String.valueOf(IndicatorColorCode.combine_first_second);

            //IndicatorColorCode.combine_values.setText(value.charAt(0)+"."+value.charAt(1));


            if (value.equalsIgnoreCase("0")) {
                IndicatorColorCode.combine_values.setText(value + " ");

            } else if (value.equalsIgnoreCase("1") || value.equalsIgnoreCase("2") ||
                    value.equalsIgnoreCase("3") || value.equalsIgnoreCase("4") || value.equalsIgnoreCase("5") ||

                    value.equalsIgnoreCase("6") || value.equalsIgnoreCase("7") ||

                    value.equalsIgnoreCase("8") ||
                    value.equalsIgnoreCase("9")) {
                IndicatorColorCode.combine_values.setText(value + "00" + " n");
            } else {
                IndicatorColorCode.combine_values.setText(value.charAt(0) + "." + value.charAt(1) + " μ");
            }
        } else if (IndicatorColorCode.third_band_value.equalsIgnoreCase("0.01")) {

            value = String.valueOf(IndicatorColorCode.combine_first_second);

            if (value.equalsIgnoreCase("0")) {
                IndicatorColorCode.combine_values.setText(value + " ");

            } else if (value.equalsIgnoreCase("1") || value.equalsIgnoreCase("2") ||
                    value.equalsIgnoreCase("3") || value.equalsIgnoreCase("4") || value.equalsIgnoreCase("5") ||

                    value.equalsIgnoreCase("6") || value.equalsIgnoreCase("7") ||

                    value.equalsIgnoreCase("8") ||
                    value.equalsIgnoreCase("9")) {
                IndicatorColorCode.combine_values.setText(value + "0" + " n");
            }

            //IndicatorColorCode.combine_values.setText(value.charAt(0)+"."+value.charAt(1)+""+value.charAt(2));
            else {
                IndicatorColorCode.combine_values.setText(value.charAt(0) + "" + value.charAt(1) + "0" + " n");
            }
        }
//
//
//        for (Map.Entry<String, String> entry1 : IndicatorColorCode.color_Coding_band3.entrySet()) {
//            if (entry1.getValue().equalsIgnoreCase(IndicatorColorCode.fourth_band_value)) {
//                second_band_value = entry1.getValue();
//
//
//
//            }
//           else if (entry1.getValue().equalsIgnoreCase(IndicatorColorCode.fourth_band_value)) {
//                second_band_value = entry1.getValue();
//
//
//
//            }
//        }


    }
}
