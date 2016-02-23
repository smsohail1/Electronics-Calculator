package com.example.appxone.electroniccalculatorsnew;

/**
 * Created by APPXONE on 1/18/2016.
 */
public class CalculatorModel {

    private int caltulator_Image;

    private String count = "0";

    private String calcuator_Title;

    private boolean isCounterVisible = false;

    public CalculatorModel() {
    }

    public CalculatorModel(int caltulator_Image, String calcuator_Title
    ) {

        this.caltulator_Image = caltulator_Image;
        this.calcuator_Title = calcuator_Title;


    }


    public CalculatorModel(int caltulator_Image, String calcuator_Title
            , boolean isCounterVisible, String count

    ) {

        this.caltulator_Image = caltulator_Image;
        this.calcuator_Title = calcuator_Title;


        this.isCounterVisible = isCounterVisible;
        this.count = count;
    }


    public String getTitle() {
        return this.calcuator_Title;
    }


    public int getImg() {
        return this.caltulator_Image;
    }

    public String getCount() {
        return this.count;
    }

    public boolean getCounterVisibility() {
        return this.isCounterVisible;
    }


    public void setTitle(String title) {
        this.calcuator_Title = title;
    }

    public void setImg(int img) {
        this.caltulator_Image = img;
    }


    public void setCount(String count) {
        this.count = count;
    }

    public void setCounterVisibility(boolean isCounterVisible) {
        this.isCounterVisible = isCounterVisible;
    }

}
