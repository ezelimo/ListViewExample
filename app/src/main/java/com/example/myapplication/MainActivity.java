package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnArrayAdapter = findViewById(R.id.button_ArrayAdapter);
        btnArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d(MainActivity.class.getName(),"array but");
                Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(intent);
            }
        });

        Button btnCustomAdapter = findViewById(R.id.button_CustomAdapter);
        btnCustomAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
    }
}