package com.ocean.discoverpintung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class home extends AppCompatActivity {
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
        flipper.setFlipInterval(5000);
        flipper.startFlipping();
    }
        private ImageView getImageView(int resId){
            ImageView image = new ImageView(this);
            image.setBackgroundResource(resId);
            return image;
        }
}
