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

        //SMDresisitorcode.smd_calculated_value.setText("sds");
        if (SMDresisitorcode.third_format_value.equalsIgnoreCase("0")) {
            value = SMDresisitorcode.calculated_value;

            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            //   SMDresisitorcode.smd_calculated_value.setText(String.valueOf(SMDresisitorcode.combine_first_second));
            SMDresisitorcode.smd_calculated_value.setText(value+ " Ω");
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("1")) {
            value = SMDresisitorcode.calculated_value;
                          SMDresisitorcode.smd_calculated_value.setText(value + " Ω");

            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            // SMDresisitorcode.smd_calculated_value.setText(String.valueOf(SMDresisitorcode.combine_first_second));
//            if(SMDresisitorcode.text.charAt(0)=='0')
//            {
//                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + value.charAt(1) + " Ω");
//
//            }
//else
//            {
//                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + value.charAt(1) +value.charAt(2)  + " Ω");
//
//            }

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("2")) {

            //format=new DecimalFormat("##.##");
            //value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            // value   =  format.format(SMDresisitorcode.combine_first_second);
            //  dd=  String.format("%2.0f", SMDresisitorcode.combine_first_second);
            //SMDresisitorcode.smd_calculated_value.setText(value);
            if(SMDresisitorcode.text.charAt(0)=='0')
            {
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1) +"");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(2)+ " Ω");

            }
else
            {
               // SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "." + value.charAt(1) + " kΩ");

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append( + value.charAt(1)+"");
                SMDresisitorcode.smd_calculated_value.append(" kΩ");
            }
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("3")) {

            value = SMDresisitorcode.calculated_value;
            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            if(SMDresisitorcode.text.charAt(0)=='0')
            {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + " kΩ");
            }
            else {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "" + value.charAt(1) + " kΩ");
            }
          //  SMDresisitorcode.smd_calculated_value.setText(value);

        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("4")) {
            value = SMDresisitorcode.calculated_value;
            // value = String.valueOf(SMDresisitorcode.combine_first_second);

            if (SMDresisitorcode.text.charAt(0) == '0') {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "" + value.charAt(1) + " kΩ");
            } else {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "" + value.charAt(1) + "0" + " kΩ");
            }
        }else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("5")) {
            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            if(SMDresisitorcode.text.charAt(0) == '0') {

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1)+"");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(2)+ "");
                SMDresisitorcode.smd_calculated_value.append(" kΩ");
            }
            else
            {

               // SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "." + value.charAt(1) + " MΩ");

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) + "");
                SMDresisitorcode.smd_calculated_value.append(".");
                SMDresisitorcode.smd_calculated_value.append( ""+value.charAt(1));
                SMDresisitorcode.smd_calculated_value.append(" MΩ");
            }
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("6")) {


            //value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            if(SMDresisitorcode.text.charAt(0) == '0') {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + " MΩ");
            }
            else
            {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "" + value.charAt(1) + " MΩ");

            }
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("7")) {

            //value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            if(SMDresisitorcode.text.charAt(0) == '0') {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "" + value.charAt(1) + "" + " MΩ");
            }
            else
            {
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "" + value.charAt(1) + "" + "0" + " MΩ");

            }
            } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("8")) {

            // value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            if(SMDresisitorcode.text.charAt(0) == '0') {
               // SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + value.charAt(1)   + value.charAt(2)+" MΩ");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(0) +"");
                SMDresisitorcode.smd_calculated_value.append(value.charAt(1)+"");
                        SMDresisitorcode.smd_calculated_value.append(value.charAt(2)+"");
                                SMDresisitorcode.smd_calculated_value.append(" MΩ");

            }
            else
            {
              //  SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "." + value.charAt(1) + " GΩ");

                SMDresisitorcode.smd_calculated_value.append(value.charAt(0)+"");
                SMDresisitorcode.smd_calculated_value.append(".");
                SMDresisitorcode.smd_calculated_value.append( ""+value.charAt(1)+"");
                SMDresisitorcode.smd_calculated_value.append(" GΩ");
            }
        } else if (SMDresisitorcode.third_format_value.equalsIgnoreCase("9")) {


            //  value = String.valueOf(SMDresisitorcode.combine_first_second);
            value = SMDresisitorcode.calculated_value;
            if(SMDresisitorcode.text.charAt(0) == '0'){
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + " GΩ");

            }
            else{
                SMDresisitorcode.smd_calculated_value.setText(value.charAt(0) + "" + value.charAt(1) + " GΩ");

            }

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
