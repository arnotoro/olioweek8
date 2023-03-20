package com.example.week8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText inputNumber1;
    private EditText inputNumber2;
    private static final DecimalFormat df = new DecimalFormat("0.0000");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayResult(View view, float result) {
        TextView numberResult = findViewById(R.id.numberResult);
        numberResult.setText(df.format(result));
    }

    public void add(View view) {
        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);

        float number1 = Float.parseFloat(inputNumber1.getText().toString());
        float number2 = Float.parseFloat(inputNumber2.getText().toString());

        float result = number1 + number2;

        displayResult(view, result);
    }

    public void subtract(View view) {
        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);

        float number1 = Float.parseFloat(inputNumber1.getText().toString());
        float number2 = Float.parseFloat(inputNumber2.getText().toString());

        float result = number1 - number2;

        displayResult(view, result);
    }

    public void multiply(View view) {
        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);

        float number1 = Float.parseFloat(inputNumber1.getText().toString());
        float number2 = Float.parseFloat(inputNumber2.getText().toString());

        float result = number1 * number2;

        displayResult(view, result);
    }

    public void divide(View view) {
        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);

        float number1 = Float.parseFloat(inputNumber1.getText().toString());
        float number2 = Float.parseFloat(inputNumber2.getText().toString());

        // when dividing by zero, the result is undefined so we display 0
        if (number2 == 0) {
            displayResult(view, 0);
            return;
        }

        float result = number1 / number2;

        displayResult(view, result);
    }
}