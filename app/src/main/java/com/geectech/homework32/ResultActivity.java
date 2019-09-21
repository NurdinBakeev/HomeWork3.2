package com.geectech.homework32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView result;
    Button shareButton;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = findViewById(R.id.result1);
        shareButton = findViewById(R.id.button2);
        Intent intent = getIntent();
        sum = intent.getIntExtra("sum", 0);
        String sum1 = String.valueOf(sum);
        result.setText(sum1);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = result.getText().toString();

                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_SEND);
                intent1.putExtra(Intent.EXTRA_TEXT,message);
                intent1.setType("text/plain");
                if(intent1.resolveActivity(getPackageManager())!=null){
                    startActivity(intent1);
                }
            }
        });

    }
}
