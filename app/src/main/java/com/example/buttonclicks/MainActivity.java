package com.example.buttonclicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG="BTN";
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               Log.d(TAG,"second button clicked");
           }
        });
        btn3.setOnClickListener(this);
    }
    public void onButtonClicked(View v){
        Log.d(TAG,"Button is Clicked");
    }

    @Override
    public void onClick(View v) {
    Log.d(TAG,"third button clicked");
    }
}
