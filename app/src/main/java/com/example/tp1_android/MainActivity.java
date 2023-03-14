package com.example.tp1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAGNAME = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.txt1);
        txt.setText("Here we go");
        Log.d(TAGNAME, "onCreate() called ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAGNAME, "onStart() called ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAGNAME, "onResume() called ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAGNAME, "onPause() called ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAGNAME, "onStop() called ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy() called ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAGNAME, "onRestart() called ");

    }
}