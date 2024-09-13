package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button frameAnimationButton = findViewById(R.id.frame_animation_button);
        Button tweenAnimationButton = findViewById(R.id.tween_animation_button);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        frameAnimationButton.startAnimation(animation);
        tweenAnimationButton.startAnimation(animation);

//        frameAnimationButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
//                startActivity(intent);
//            }
//        });

        tweenAnimationButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TweenAnimationActivity.class);
            startActivity(intent);
        });

    }
    public void onClick(View view) {
        Intent intent = new Intent(this, FrameAnimationActivity.class);
        startActivity(intent);
    }
}