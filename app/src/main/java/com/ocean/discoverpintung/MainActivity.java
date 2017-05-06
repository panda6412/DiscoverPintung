package com.ocean.discoverpintung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    public void change(View v){
        startActivity(new Intent(MainActivity.this,home.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, home.class));
            }
        });

    }


    public void show(View  view){
        startActivity(new Intent(MainActivity.this,FilterActivity.class));

    }

}

