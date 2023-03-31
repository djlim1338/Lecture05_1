package com.cookandroid.lecture05_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLayoutLinear1, btnLayoutLinear2, btnLayoutLinearJava, btnLayoutRelative, btnLayoutTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLayoutLinear1 = (Button) findViewById(R.id.btnLayoutLinear1);
        btnLayoutLinear2 = (Button) findViewById(R.id.btnLayoutLinear2);
        btnLayoutLinearJava = (Button) findViewById(R.id.btnLayoutLinearJava);
        btnLayoutRelative = (Button) findViewById(R.id.btnLayoutRelative);
        btnLayoutTable = (Button) findViewById(R.id.btnLayoutTable);


        btnLayoutLinear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LayoutLinear.class);
                startActivity(intent);
            }
        });

        btnLayoutLinear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LayoutLinear2.class);
                startActivity(intent);
            }
        });

        btnLayoutRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LayoutRelative.class);
                startActivity(intent);
            }
        });

        btnLayoutTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LayoutTable.class);
                startActivity(intent);
            }
        });
    }
}