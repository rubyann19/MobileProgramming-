package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private static String Tag = "xyz";
   Button button3;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag,"ONCREATE");
        final Button button = findViewById(R.id.button);
        final Button button1=findViewById(R.id.button1);
        button3 = findViewById(R.id.button3);
        button.setBackgroundColor(Color.RED);
        button1.setBackgroundColor(Color.BLUE);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("xyz", "Going to second activity!!!!!!!!!!!!!!!");
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          if(((ColorDrawable)button1.getBackground()).getColor() == Color.BLUE){
                                              button1.setBackgroundColor(Color.RED);


                                          }
                                          else
                                          {
                                              button1.setBackgroundColor(Color.BLUE);
                                          }


                                      }
                                  }
        );
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
