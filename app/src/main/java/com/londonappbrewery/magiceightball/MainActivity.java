package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay;
        ballDisplay = findViewById(R.id.image_eightBall);

        Button askButton;
        askButton = findViewById(R.id.askButton);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};



        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Magic-8-Ball", "Ze button has been pressed!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(4);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}