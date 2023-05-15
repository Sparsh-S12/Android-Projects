package com.google.learningandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CurrencyConvertor extends AppCompatActivity implements View.OnClickListener {
private Button btnConvertor;
private EditText edtDollar;
private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_convertor);
        btnConvertor=findViewById(R.id.btn_convert);
        edtDollar=findViewById(R.id.edt_dollar);
        txtResult=findViewById(R.id.display_result);
        btnConvertor.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (edtDollar.getText().toString().length() > 0) {
            double dollar = Double.parseDouble(edtDollar.getText().toString());
            double converted = dollar * 79.77;
            txtResult.setText(converted + "");
        }else {
            Toast.makeText(this, "Enter Value", Toast.LENGTH_SHORT).show();
        }
    }
}