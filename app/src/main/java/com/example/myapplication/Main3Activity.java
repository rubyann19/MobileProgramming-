package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private  String Tag="ruby";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
                
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
