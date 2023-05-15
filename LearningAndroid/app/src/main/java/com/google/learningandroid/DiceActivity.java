package com.google.learningandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {
private ImageView ivPlaceholder;
private Button roll_dice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        ivPlaceholder=findViewById(R.id.iv_placeholder);
        roll_dice=findViewById(R.id.btn_roll);
        final Random random=new Random();
        roll_dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomNumber=random.nextInt(6)+1;
                if(randomNumber==1){
                    ivPlaceholder.setImageResource(R.drawable.one);
                }
                else if(randomNumber==2){
                    ivPlaceholder.setImageResource(R.drawable.two);
                }
                else if(randomNumber==3){
                    ivPlaceholder.setImageResource(R.drawable.three);
                }
                else if(randomNumber==4){
                    ivPlaceholder.setImageResource(R.drawable.four);
                }
                else if(randomNumber==5){
                    ivPlaceholder.setImageResource(R.drawable.five);
                }
                else if(randomNumber==6){
                    ivPlaceholder.setImageResource(R.drawable.six);
                }
            }
        });
    }
}