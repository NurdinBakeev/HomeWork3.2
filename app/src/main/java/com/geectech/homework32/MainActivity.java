package com.geectech.homework32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText el1, el2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        el1 = findViewById(R.id.num1);
       el2 = findViewById(R.id.num2);
        btn = findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = el1.getText().toString();
                String num2 = el2.getText().toString();
                Intent intent = new Intent(MainActivity.this, LogicActivity.class);
                intent.putExtra("key", num1);
                intent.putExtra("key2", num2);
                startActivity(intent);
            }
        });
    }
}
