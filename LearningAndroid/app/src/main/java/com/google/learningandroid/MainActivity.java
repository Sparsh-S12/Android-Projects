package com.google.learningandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private Button btnPlus, btnMinus, btReset,btnHideShow;
    private ImageView ivAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textinput_counter);
        btnPlus = findViewById(R.id.button_plus);
        btnMinus = findViewById(R.id.button_minus);
        btReset = findViewById(R.id.button_reset);
        ivAvatar=findViewById(R.id.iv_avatar);
        btnHideShow=findViewById(R.id.btn_hideSHow);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btReset.setOnClickListener(this);
        btnHideShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ivAvatar.getVisibility()==View.VISIBLE){
                    ivAvatar.setVisibility(View.GONE);
                }
                else{
                    ivAvatar.setVisibility(View.VISIBLE);
                }
            }
        });
//        btnPlus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                    int counter= Integer.parseInt(textView.getText().toString());
//                    counter++;
//                    textView.setText(counter+"");
//                }
//        });
//        btnMinus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int counter=Integer.parseInt(textView.getText().toString());
//                counter--;
//                textView.setText(counter+"");
//            }
//        });
//        btReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int counter= Integer.parseInt(textView.getText().toString());
//                counter=0;
//                textView.setText(counter+"");
//            }
//        });
    }

//    public void plusFunction(View view) {
//        int counter = Integer.parseInt((textView.getText().toString()));
//        counter++;
//        textView.setText(counter + "");
//    }
//
//    public void minusFunction(View view) {
//        int counter = Integer.parseInt((textView.getText().toString()));
//        counter--;
//        textView.setText(counter + "");
//    }
//
//    public void resetFunction(View view) {
//        int counter = Integer.parseInt((textView.getText().toString()));
//        counter = 0;
//        textView.setText(counter + "");
//    }
//
//    public void operation(View view) {
//        int id = view.getId();
//        int counter = 0;
//        switch (id) {
//            case R.id.button_plus:
//                counter = Integer.parseInt(textView.getText().toString());
//                counter++;
//                textView.setText(counter + "");
//                break;
//            case R.id.button_minus:
//                counter = Integer.parseInt(textView.getText().toString());
//                if (counter != 0) ;
//                textView.setText(counter + "");
//                break;
//            case R.id.button_reset:
//                counter = Integer.parseInt(textView.getText().toString());
//                counter = 0;
//                textView.setText(counter + "");
//                break;
//        }
//    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        int counter = 0;
        switch (id) {
            case R.id.button_plus:
                counter = Integer.parseInt(textView.getText().toString());
                counter++;
                textView.setText(counter + "");
                break;
            case R.id.button_minus:
                counter = Integer.parseInt(textView.getText().toString());
                if (counter != 0) ;
                counter--;
                textView.setText(counter + "");
                break;
            case R.id.button_reset:
                counter = Integer.parseInt(textView.getText().toString());
                counter = 0;
                textView.setText(counter + "");
                break;
            case R.id.iv_avatar:

        }
    }
}
//        Toast.makeText(this,"Plus Button Has Been Clicked",Toast.LENGTH_SHORT).show();
