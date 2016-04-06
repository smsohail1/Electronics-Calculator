package com.example.appxone.electroniccalculatorsnew;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by APPXONE on 3/9/2016.
 */
public class UnitOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

   public static String unit_value;
   public static String unit_vl="Hz";

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(),
                "OnItemSelectedListener : " + parent.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show();
//
//        unit_vl=     parent.getItemAtPosition(position).toString();
//        unit_value = Frequencyconverter.unit_convertion.getSelectedItem().toString();
//
//        if (unit_value == "Hz" || unit_value == "GHz" || unit_value == "μHz" || unit_value == "kHz" || unit_value == "MHz") {
//
//
//        } else if (unit_value == "s" || unit_value == "ms" || unit_value == "μs" || unit_value == "ns" || unit_value == "ps") {
//
//        } else if (unit_value == "m/s" || unit_value == "mm/s" || unit_value == "km/s" || unit_value == "Mm/s" || unit_value == "μ/s") {
//
//        }
//
//
//        else if (unit_value == "m" || unit_value == "mm" || unit_value == "μm" || unit_value == "km" || unit_value == "Mm") {
//
//        }
//    }

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
