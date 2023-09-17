package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgvCall, imgvSMSMessage, imgvVNExpress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();

        imgvVNExpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVNExpress = new Intent();
                intentVNExpress.setAction(Intent.ACTION_VIEW);
                intentVNExpress.setData(Uri.parse("https://vnexpress.net"));

                startActivity(intentVNExpress);
            }
        });

        imgvCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent();
                intentCall.setAction(Intent.ACTION_DIAL);
                intentCall.setData(Uri.parse("tel:0933567679"));

                startActivity(intentCall);
            }
        });

        imgvSMSMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSMSMessage = new Intent();
                intentSMSMessage.setAction(Intent.ACTION_SENDTO);
                intentSMSMessage.setData(Uri.parse("sms:0933567679"));

                startActivity(intentSMSMessage);
            }
        });
    }

    void initWidget(){
        imgvVNExpress = findViewById(R.id.imageDocbaoId);
        imgvCall = findViewById(R.id.imageCallId);
        imgvSMSMessage = findViewById(R.id.imageSmsId);
    }
}