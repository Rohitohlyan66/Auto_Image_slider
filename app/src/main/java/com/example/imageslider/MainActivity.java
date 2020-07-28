package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper=findViewById(R.id.flipper);
        int images[]={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.one,R.drawable.two,R.drawable.three};

        for (int i=0;i<images.length;i++)
        {
            flipperImages(images[i]);
        }

    }

    public void flipperImages(int images)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(images);

        flipper.addView(imageView);
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
