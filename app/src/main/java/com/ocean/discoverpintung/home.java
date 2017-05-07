package com.ocean.discoverpintung;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ocean.discoverpintung.DTO.Landspace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class home extends AppCompatActivity {



    final OkHttpClient client = new OkHttpClient();
    final Gson gson = new Gson();


    ArrayList<Landspace> landscapes ;

    private ViewFlipper flipper;

    private int[] resId = {R.drawable.pc1,R.drawable.pc2,R.drawable.pc3,R.drawable.pc4,R.drawable.pc5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        flipper = (ViewFlipper) findViewById(R.id.flipper);
        for (int i = 0; i < resId.length; i++) {
            flipper.addView(getImageView(resId[i]));
        }
        //flipper.setInAnimation(this, R.anim.left_in);
        //flipper.setOutAnimation(this, R.anim.left_out);
        flipper.setFlipInterval(3000);
        flipper.startFlipping();

        Button btn_go = (Button)findViewById(R.id.btn_go);
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchDataInBackground();
                startActivity(new Intent(home.this,FilterActivity.class).putExtra("data",landscapes));
            }
        });

    }
    private ImageView getImageView(int resId){
        ImageView image = new ImageView(this);
        image.setBackgroundResource(resId);
        return image;
    }

    private void fetchDataInBackground() {
        final Request request = new Request.Builder().url("https://www.fun2tw.com/TravelPlan/json").build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException{
                if(!response.isSuccessful())
                    throw  new IOException("Unexpected code"+response);
                else{
                    try{
                        final String resStr = response.body().string();
//                        JSONObject jsonObject = new JSONObject(resStr);

//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                StringBuffer sb = new StringBuffer();
//                                for(Landspace landspace : landspaces){
//                                    sb.append("_id"+landspace.getId()+"\n")
//                                            .append("Station"+landspace.getCatalog()+"\n")
//                                            .append("Destination"+landspace.getSubject()+"\n")
//                                            .append("Destination"+landspace.getLat()+"\n")
//                                            .append("Destination"+landspace.getLon()+"\n")
//                                            .append("Destination"+landspace.getAddress()+"\n")
//                                            .append("Destination"+landspace.getTel()+"\n")
//                                            .append("Destination"+landspace.getUpImageUrl()+"\n")
//                                            .append("Destination"+landspace.getInitDate()+"\n")
//                                            .append("Destination"+landspace.getDisShow()+"\n")
//                                            .append("UpdateTime"+landspace.getType()+"\n-----------------------------");
//                                }
//                                Log.d("DATA",sb.toString());
//                                landscape = sb.toString();
//                            }
//                        });
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
