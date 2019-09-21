package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private static String Tag = "xyz";
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(Tag,"ONCREATE");

        button3 = findViewById(R.id.button2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("xyz", "Going to first activity!!!!!!!!!!!!!!!");
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finishActivity(0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onResume");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"Onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"onStart");
    }
}
