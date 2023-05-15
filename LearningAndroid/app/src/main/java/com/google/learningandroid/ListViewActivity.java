package com.google.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;
    private String[] options = {
            "Introduction",
            "My Bio App-Relative Layout",
            "My Bio App- LinearLayout",
            "Login Form",
            "Dice App",
            "SMS App",
            "Currency Convertor"

    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i) {
                    case 0:
                        intent = new Intent(ListViewActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ListViewActivity.this, MyBioRelativeLayout.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(ListViewActivity.this, MyBio_LinearLayout.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(ListViewActivity.this,LoginFormActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent=new Intent(ListViewActivity.this,DiceActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent=new Intent(ListViewActivity.this,sms_Activity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent=new Intent(ListViewActivity.this,CurrencyConvertor.class);
                        startActivity(intent);
                }


            }
        });
    }
}

