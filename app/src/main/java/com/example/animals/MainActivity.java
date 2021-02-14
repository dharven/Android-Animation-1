package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable lionanimation;
    private ImageView lion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lion = (ImageView)findViewById(R.id.lionID);
        lion.setBackgroundResource(R.drawable.lion_anim);
        lionanimation = (AnimationDrawable) lion.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        lionanimation.start();

        Handler mhandler = new Handler();
        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
            lionanimation.stop();
            }
        }, 5000);
        return super.onTouchEvent(event);
    }
}
