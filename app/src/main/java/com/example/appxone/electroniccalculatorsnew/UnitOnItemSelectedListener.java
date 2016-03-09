package com.example.appxone.electroniccalculatorsnew;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by APPXONE on 3/9/2016.
 */
public class UnitOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(),
                "OnItemSelectedListener : " + parent.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
