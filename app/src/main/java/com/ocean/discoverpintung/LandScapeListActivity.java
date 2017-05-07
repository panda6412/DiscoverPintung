package com.ocean.discoverpintung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ocean.discoverpintung.DTO.Landspace;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LandScapeListActivity extends AppCompatActivity {



    final OkHttpClient client = new OkHttpClient();
    final Gson gson = new Gson();

    ArrayList<Landspace> landspaces ;
    List<Landspace> landspaceCart ;
    ListAdapter listAdapter ;
    private ListView list;


    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main2);

       fetchDataInBackground();
        list = (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Click","!");
                Toast.makeText(LandScapeListActivity.this,landspaces.get(position).getSubject()+"is add in schedule !!",Toast.LENGTH_LONG).show();
                landspaceCart.add(landspaces.get(position));
            }
        });

        Button btn_car = (Button)findViewById(R.id.btn_car);
        Button btn_map = (Button)findViewById(R.id.btn_map);
        Button btn_housing = (Button)findViewById(R.id.btn_housing);

        btn_car.setOnClickListener(new ck());
        btn_map.setOnClickListener(new ck());
        btn_housing.setOnClickListener(new ck());


   }
   class ck implements View.OnClickListener{
       @Override
       public void onClick(View v) {
           int id = v.getId();
           switch (id){
               case R.id.btn_car:
                   startActivity(new Intent(LandScapeListActivity.this,CartActivity.class));
                   break;
               case R.id.btn_map:
                   startActivity(new Intent(LandScapeListActivity.this,MapsActivity.class));
                   break;
               case R.id.btn_housing:
                   startActivity(new Intent(LandScapeListActivity.this,CartActivity.class));
                   break;
           }
       }
   }
    private void fetchDataInBackground() {
        final Request request = new Request.Builder().url("https://www.fun2tw.com/TravelPlan/json").build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful())
                    throw new IOException("Unexpected code" + response);
                else {
                    try {
                        final String resStr = response.body().string();
                        landspaces = gson.fromJson(resStr, new TypeToken<ArrayList<Landspace>>() {
                        }.getType());
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                StringBuffer sb = new StringBuffer();
                                for (Landspace landspace : landspaces) {
                                    sb.append("_id" + landspace.getId() + "\n")
                                            .append("Station" + landspace.getCatalog() + "\n")
                                            .append("Destination" + landspace.getSubject() + "\n")
                                            .append("Destination" + landspace.getLat() + "\n")
                                            .append("Destination" + landspace.getLon() + "\n")
                                            .append("Destination" + landspace.getAddress() + "\n")
                                            .append("Destination" + landspace.getTel() + "\n")
                                            .append("Destination" + landspace.getUpImageUrl() + "\n")
                                            .append("Destination" + landspace.getInitDate() + "\n")
                                            .append("Destination" + landspace.getDisShow() + "\n")
                                            .append("UpdateTime" + landspace.getType() + "\n-----------------------------");
                                }

                                listAdapter = new MyAdapter(LandScapeListActivity.this,landspaces);
                                list.setAdapter(listAdapter);



                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }
}
