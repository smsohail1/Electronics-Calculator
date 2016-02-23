package com.example.appxone.electroniccalculatorsnew;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by APPXONE on 1/18/2016.
 */
public class CalculatorsAdapter extends BaseAdapter {

    ArrayList<CalculatorModel> mStringFilterList;


    private  Context context;

    private ArrayList<CalculatorModel> navDrawerItemssa;

    private ArrayList<CalculatorModel> arraylist;

Typeface typeface;
    public Context cc;


    ArrayList<String> fav_list;
    Cursor c;


    public CalculatorsAdapter(Context context, ArrayList<CalculatorModel> navDrawerItemsa) {
        this.context = context;
        this.navDrawerItemssa = navDrawerItemsa;
        this.arraylist = new ArrayList<CalculatorModel>();


        Log.e("cunstructor", "cunstructor");
        //  mStringFilterList = navDrawerItemsa;
    }

    @Override
    public int getCount() {
        return navDrawerItemssa.size();
    }

    @Override
    public Object getItem(int position) {
        return navDrawerItemssa.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder {
        public ImageView im;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.calculatormainlayout, null);


        }
        typeface=Typeface.createFromAsset(this.context.getAssets(),"fonts/AvenirLTStd-Roman.otf");

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.calculator_img);
        TextView txtTitleindex = (TextView) convertView.findViewById(R.id.calculator_title);

        txtTitleindex.setTypeface(typeface);
        imgIcon.setImageResource(navDrawerItemssa.get(position).getImg());
        txtTitleindex.setText(navDrawerItemssa.get(position).getTitle());

        return convertView;
    }


}
