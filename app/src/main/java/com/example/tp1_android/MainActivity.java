package com.example.tp1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.txt1);
        txt.setText("Here we go");
        Log.d("MainActivity", "onCreate() called ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart() called ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume() called ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause() called ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop() called ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy() called ");
    }
}