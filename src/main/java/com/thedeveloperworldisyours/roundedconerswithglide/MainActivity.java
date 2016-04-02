package com.thedeveloperworldisyours.roundedconerswithglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    public static int sCorner = 15;
    public static int sMargin = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.activity_main_image_view);
        Glide.with(this)
                .load("http://thedeveloperworldisyours.com/wp-content/uploads/scareface.jpeg")
                .bitmapTransform(new RoundedCornersTransformation( MainActivity.this,sCorner, sMargin))
                .into(imageView);
    }
}
