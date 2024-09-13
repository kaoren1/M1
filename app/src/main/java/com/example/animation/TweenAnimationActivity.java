package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        ImageView imageView = findViewById(R.id.tween_animation_image);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imageView.startAnimation(fadeInAnimation);

        Animation tweenAnimation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        imageView.startAnimation(tweenAnimation);
    }
}