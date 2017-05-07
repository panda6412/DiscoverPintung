package com.ocean.discoverpintung;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ocean.discoverpintung.DTO.Landspace;
import com.ocean.discoverpintung.DTO.LandspaceCart;
import com.squareup.picasso.Picasso;

public class MyAdapter extends BaseAdapter {
    Context context  ;

    public List<Landspace> landspaceCart = new ArrayList<>();
    private LayoutInflater myInflater;
    private List<Landspace> lands ;
    public MyAdapter(Context context, List<Landspace> lands){
        myInflater = LayoutInflater.from(context);
        this.lands = lands ;
        this.context =  context ;

    }


    @Override
    public int getCount() {
        return lands.size();
    }

    @Override
    public Object getItem(int position) {
        return lands.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lands.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView ;
        if(row == null){
            row = myInflater.inflate(R.layout.adapter,null);
            ImageView itemImage = (ImageView)row.findViewById(R.id.ItemImage);
            TextView itemInfo = (TextView)row.findViewById(R.id.ItemInfo);
            TextView itemName = (TextView)row.findViewById(R.id.ItemName);
            final Button itemButton = (Button)row.findViewById(R.id.ItemButton);

            final Landspace ld = (Landspace)getItem(position) ;
//            itemImage.setImageURI(Uri.parse(ld.getUpImageUrl()));
            Picasso.with(context).load(ld.getUpImageUrl()).into(itemImage);
            itemInfo.setText(ld.getSubject());
            itemName.setText(ld.getAddress());

            itemButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,ld.getSubject()+"is add in schedule !!",Toast.LENGTH_LONG).show();

                }
            });
        }



        return row;
    }

    public List<Landspace> getLandspaceCart(){
        return landspaceCart ;
    }
}
