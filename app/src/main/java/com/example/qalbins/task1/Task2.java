package com.example.qalbins.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Task2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        Button btnHome= (Button)findViewById(R.id.btn1);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Task2.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnCal = (Button)findViewById(R.id.btn2);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Task1.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
