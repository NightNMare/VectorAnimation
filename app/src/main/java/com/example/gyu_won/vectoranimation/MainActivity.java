package com.example.gyu_won.vectoranimation;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Drawable drawable = img1.getDrawable();
                if (drawable instanceof Animatable){
                    ((Animatable) drawable).start();
                }
            }
        },2000);

    }
}
