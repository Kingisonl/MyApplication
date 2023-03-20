package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView text = (TextView) findViewById(R.id.textView2);
        EditText inp1 = (EditText) findViewById(R.id.inpText1);
        EditText inp2 = (EditText) findViewById(R.id.inpText2);
        String str1 = inp1.getText().toString();
        String str2 = inp2.getText().toString();
        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);
        double c = b/(Math.pow(a,2));
        if (c>24){
            text.setText("BMI指数:"+String.format("%.2f",c)+","+"你的状况为: 偏胖  ");
        } else if (c>18.5) {
            text.setText("BMI指数:"+String.format("%.2f",c)+","+"你的状况为: 正常  ");
        }
        else {
            text.setText("BMI指数:"+String.format("%.2f",c)+","+"你的状况为: 偏瘦  ");
        }


    }
}