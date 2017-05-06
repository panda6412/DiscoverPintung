package com.ocean.discoverpintung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aa = (Button) findViewById(R.id.btn04);

    }


    public void show(View  view){
        startActivity(new Intent(MainActivity.this,FilterActivity.class));

    }

}

