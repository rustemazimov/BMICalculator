package com.apps.romeo.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize companents
        final EditText weightEditText = (EditText) findViewById(R.id.weight_edit_text);
        final EditText heightEditText = (EditText) findViewById(R.id.height_edit_text);
        Button calculateButton = (Button) findViewById(R.id.calculate_button);
        final TextView resultView = (TextView) findViewById(R.id.result_text_view);

        //Create BMICalculator object for calculating BMI
        final BMICalculator calculator = new BMICalculator();

        //Handle calculateButton's action
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightTxt = weightEditText.getText().toString();
                String heightTxt = heightEditText.getText().toString();
            /*
             * Check whether one or both edit text is left empty
             */
                if(weightTxt.equals("") || heightTxt.equals("")){
                    Toast.makeText(getApplicationContext(), "Text Fields shouldn't be empty", Toast.LENGTH_LONG).show();
                    return;
                }
                resultView.setText(calculator.calculateBMI(Double.parseDouble(weightTxt),
                                                           Double.parseDouble(heightTxt)));
            }
        });
    }
}
