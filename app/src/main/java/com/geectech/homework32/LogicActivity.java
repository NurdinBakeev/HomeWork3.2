package com.geectech.homework32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LogicActivity extends AppCompatActivity {
    TextView text1, text2;
    Button btn1, btn2, btn3, btn4, btn5;
    Intent intent;
    int sum;
    int num1;
    int num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logic);
        text1 = findViewById(R.id.text_num1);
        text2 = findViewById(R.id.text_num2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);


        intent = getIntent();
        String el1 = intent.getStringExtra("key");
        String el2 = intent.getStringExtra("key2");
        num1 = Integer.parseInt(el1);
        text1.setText(el1);
        num2 = Integer.parseInt(el2);
        text2.setText(el2);

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                sum = num1 + num2;
                Intent intent = new Intent(LogicActivity.this, ResultActivity.class);
                intent.putExtra("sum", sum);
                startActivity(intent);
                break;
            case R.id.btn2:
                sum = num1 - num2;
                Intent intent1 = new Intent(LogicActivity.this, ResultActivity.class);
                intent1.putExtra("sum", sum);
                startActivity(intent1);
                break;

            case R.id.btn3:
                sum = num1 / num2;
                Intent intent2 = new Intent(LogicActivity.this, ResultActivity.class);
                intent2.putExtra("sum", sum);
                startActivity(intent2);
                break;

            case R.id.btn4:
                sum = num1 * num2;
                Intent intent3 = new Intent(LogicActivity.this, ResultActivity.class);
                intent3.putExtra("sum", sum);
                startActivity(intent3);
                break;

        }
    }
}
