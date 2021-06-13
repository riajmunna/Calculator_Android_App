package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sum(View v){
        EditText n1 = (EditText)findViewById(R.id.number1);
        EditText n2 = (EditText)findViewById(R.id.number2);
        TextView t1 = (TextView)findViewById(R.id.res);
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sum = num1+num2;
        t1.setText(Integer.toString(sum));

    }

    public void sub(View v){
        EditText n1 = (EditText)findViewById(R.id.number1);
        EditText n2 = (EditText)findViewById(R.id.number2);
        TextView t1 = (TextView)findViewById(R.id.res);
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sub = num1-num2;
        t1.setText(Integer.toString(sub));

    }

    public void mul(View v){
        EditText n1 = (EditText)findViewById(R.id.number1);
        EditText n2 = (EditText)findViewById(R.id.number2);
        TextView t1 = (TextView)findViewById(R.id.res);
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int mul = num1*num2;
        t1.setText(Integer.toString(mul));

    }

    public void div(View v){
        EditText n1 = (EditText)findViewById(R.id.number1);
        EditText n2 = (EditText)findViewById(R.id.number2);
        TextView t1 = (TextView)findViewById(R.id.res);
        double num1 = Integer.parseInt(n1.getText().toString());
        double num2 = Integer.parseInt(n2.getText().toString());
        double div = num1/num2;
        t1.setText(Double.toString(div));

    }
}
