package com.ocean.discoverpintung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FilterActivity extends AppCompatActivity {

    private Button linkAll;
    private Button linkHuman;
    private Button linkLand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        findViews();

    }

    private void findViews() {
        linkAll = (Button)findViewById(R.id.btn01);
        linkHuman = (Button) findViewById(R.id.btn02);
        linkLand = (Button) findViewById(R.id.btn03);
    }

    public void all_show(View view){
        startActivity(new Intent(FilterActivity.this,FilterActivity.class));

    }

    public void human_show(View view){
        startActivity(new Intent(FilterActivity.this,FilterActivity.class));

    }

    public void island_show(View view){
        startActivity(new Intent(FilterActivity.this,FilterActivity.class));

    }
}
