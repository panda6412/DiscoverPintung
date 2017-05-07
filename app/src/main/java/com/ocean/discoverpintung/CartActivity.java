package com.ocean.discoverpintung;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.ocean.discoverpintung.DTO.Landspace;
import com.squareup.picasso.Picasso;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        ListView lv = (ListView) findViewById(R.id.lv);
        ListAdapter listAdapter = new MAdpater(this, new String[]{"貓鼻頭公園", "旭海大草原"}, new String[]{"https://www.fun2tw.com/upfiles/images/20160809120336.jpg", "https://www.fun2tw.com/upfiles/images/20160808052211.jpg"});
        lv.setAdapter(listAdapter);
    }

    class MAdpater extends BaseAdapter {

        Context context;
        String[] strings;
        String[] imgs;
        private LayoutInflater myInflater;

        public MAdpater(Context context, String[] strings, String[] imgs) {
            this.context = context;
            this.strings = strings;
            this.imgs = imgs;
            myInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            if (row == null) {
                row = myInflater.inflate(R.layout.adapter, null);
                ImageView itemImage = (ImageView) row.findViewById(R.id.ItemImage);
                TextView itemInfo = (TextView) row.findViewById(R.id.ItemInfo);
                TextView itemName = (TextView) row.findViewById(R.id.ItemName);
                Button button = (Button) row.findViewById(R.id.ItemButton);

                Picasso.with(context).load(imgs[position]).into(itemImage);
                itemInfo.setText(strings[position]);
                itemName.setText(strings[position]);
                button.setText("取消行程");

            }
            return row;
        }
    }
}