package com.example.appxone.electroniccalculatorsnew;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by APPXONE on 2/23/2016.
 */
public class Formatfourband {
    String value;
    NumberFormat format;
    String dd;
    DecimalFormat format_txt;

    public void format_check() {

        //SMDresisitorcode.smd_calculated_value.setText("sds");
        if (SMDresisitorcode.third_format_value.equalsIgnoreCase("0")) {
            value = SMDresisitorcode.calculated_value;

            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            //   SMDresisitorcode.smd_calculated_value.setText(String.valueOf(SMDresisitorcode.combine_first_second));
            SMDresisitorcode.smd_calculated_value.setText(value+ " Ω");
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("1")) {
            value = SMDresisitorcode.calculated_value;
            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            // SMDresisitorcode.smd_calculated_value.setText(String.valueOf(SMDresisitorcode.combine_first_second));
            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }
           else if(SMDresisitorcode.text.charAt(0)=='0')
            {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) +"");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" Ω");
            }
            else {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) +"");
                SMDresisitorcode.smd_calculated_value.append(".");
                SMDresisitorcode.smd_calculated_value.append(""+value.charAt(1) +"");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" kΩ");
            }

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("2")) {

            //format=new DecimalFormat("##.##");
            //value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }
            else if(SMDresisitorcode.text.charAt(0)=='0')
            {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append("."+"");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(" kΩ");
            }

            else {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(".");
                SMDresisitorcode.smd_calculated_value.append("" + value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" kΩ");
            } //   SMDresisitorcode.smd_calculated_value.setText(value.charAt(0)  + value.charAt(1)+   value.charAt(2)+"ss Ω");

//double d=Double.valueOf(value);
           // format_txt=new DecimalFormat("0.0");
         // String ss=  format_txt.format(d);
            // value   =  format.format(SMDresisitorcode.combine_first_second);
            //  dd=  String.format("%2.0f", SMDresisitorcode.combine_first_second);

            //SMDresisitorcode.smd_calculated_value.setText(ss);


        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("3")) {

            value = SMDresisitorcode.calculated_value;
            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }
            else if(SMDresisitorcode.text.charAt(0)=='0')
            {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(" kΩ");


            }

            else {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append("" + value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" kΩ");
            }
         //   SMDresisitorcode.smd_calculated_value.setText(value.charAt(0)  + value.charAt(1) +value.charAt(2)+ " kΩ");


        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("4")) {
            value = SMDresisitorcode.calculated_value;
            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }
            else if(SMDresisitorcode.text.charAt(0)=='0')
            {

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append("" + value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" kΩ");
            }

            else {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "." + value.charAt(1) + value.charAt(2) + " MΩ");
            }
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("5")) {
            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;

            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }
            else if(SMDresisitorcode.text.charAt(0)=='0')
            {

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(".");

                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(" MΩ");

            }
            else {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(".");
                SMDresisitorcode.smd_calculated_value.append("" + value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" MΩ");
            }

           // SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + value.charAt(1) +"." + value.charAt(2) + " MΩ");

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("6")) {


            //value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }

            else if(SMDresisitorcode.text.charAt(0)=='0') {

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(" MΩ");

            }
                else {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append("" + value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" MΩ");
            }
           // SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + value.charAt(1) + value.charAt(2)+" MΩ");

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("7")) {

            //value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }

            else if(SMDresisitorcode.text.charAt(0)=='0') {

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append("" + value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" MΩ");
            }
                else {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "." + value.charAt(1) + value.charAt(2) + " GΩ");

            }} else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("8")) {

            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;


            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }

            else if(SMDresisitorcode.text.charAt(0)=='0') {


                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append("."+"");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(" GΩ");

            }
                else {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(".");
                SMDresisitorcode.smd_calculated_value.append("" + value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" GΩ");
            }
          //  SMDresisitorcode.smd_calculated_value.setText(value.charAt(0)  + value.charAt(1) +  "." + value.charAt(2)+ " GΩ");

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("9")) {


            //  value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;


            if(SMDresisitorcode.text.charAt(0)=='0' && SMDresisitorcode.text.charAt(1)=='0' && SMDresisitorcode.text.charAt(2)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText("0 Ω");

            }

            else if(SMDresisitorcode.text.charAt(0)=='0') {

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append(" GΩ");

            }
                else {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) + "");
                SMDresisitorcode.smd_calculated_value.append("" + value.charAt(2) + "");
                SMDresisitorcode.smd_calculated_value.append(" GΩ");
            }
          //  SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + value.charAt(1) +value.charAt(2)+ " GΩ");

        }


// else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("0.1")) {
//
//            value = String.valueOf(SMDresisitorcode.combine_first_second);
//
//            //SMDresisitorcode.smd_calculated_value.setText(value.charAt(0)+"."+value.charAt(1));
//            SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "." + value.charAt(1) + " ");
//        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("0.01")) {
//
//            value = String.valueOf(SMDresisitorcode.combine_first_second);
//
//            //SMDresisitorcode.smd_calculated_value.setText(value.charAt(0)+"."+value.charAt(1)+""+value.charAt(2));
//            SMDresisitorcode.smd_calculated_value.setText("0." + value + " ");
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
