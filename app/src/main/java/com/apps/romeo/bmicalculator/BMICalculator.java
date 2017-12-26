package com.apps.romeo.bmicalculator;

/**
 * Created by Rustem on 11/5/2017.
 */

public class BMICalculator {

    /**
     * Calculates BMI and BMI state like Underweight, Normal, Overweight, Obese
     * @param weight
     *        in kilograms
     * @param height
     *        in meters
     * @return
     *        BMI state
     *        BMI number
     */
    String calculateBMI(double weight, double height){
        double bMI = (weight / (height * height)) * 10_000;
        String bMIState;
        if(bMI < 18.5)
        {
            bMIState = "Underweight";
        }
        else if(bMI < 25)
        {
            bMIState = "Normal";
        }
        else if(bMI < 30)
        {
            bMIState = "Overweight";
        }
        else
        {
            bMIState = "Obese";
        }
        return (bMIState + "\n" + bMI);
    }
}
