package com.google.learningandroid;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class sms_Activity extends AppCompatActivity {
    private EditText phoneNumber,message;
    private Button sendSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        phoneNumber = findViewById(R.id.edt_phone);
        message = findViewById(R.id.edt_message);
        sendSMS = findViewById(R.id.btn_send);
        sendSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int permission = ContextCompat.checkSelfPermission(sms_Activity.this, Manifest.permission.SEND_SMS);
                if (permission == PackageManager.PERMISSION_GRANTED) {
                    sendSMS();
                } else {
                    ActivityCompat.requestPermissions(sms_Activity.this, new String[]{Manifest.permission.SEND_SMS}, 5);
                }

            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 5:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    sendSMS();
                } else {
                    Toast.makeText(this, "We Need SMS Permission", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
        private void sendSMS() {
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNumber.getText().toString().trim(),null,message.getText().toString().trim(),null,null);
            Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();
        }
    }
