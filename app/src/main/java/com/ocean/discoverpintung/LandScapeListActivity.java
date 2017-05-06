package com.ocean.discoverpintung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LandScapeListActivity extends AppCompatActivity {


   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main2);

       List<Land> lands = new ArrayList<>();
       lands.add(new Land("abc","123","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));
       lands.add(new Land("ac","123","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));
       lands.add(new Land("abc","123","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));
       lands.add(new Land("ab23c","123","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));
       lands.add(new Land("11bc","123","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));
       lands.add(new Land("abc","123dd","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));
       lands.add(new Land("defbc","123","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));
       lands.add(new Land("abc","12113","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));
       lands.add(new Land("abc","123","https://cdn.slidesharecdn.com/profile-photo-SimonMuchinenyika-48x48.jpg"));

       ListView list = (ListView) findViewById(R.id.list);
       ListAdapter listAdapter = new MyAdapter(this,lands);
       list.setAdapter(listAdapter);

   }


}
