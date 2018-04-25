package com.example.nhanphan.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCall, btnYoutube, btnMusic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = (Button) findViewById(R.id.btCall); // nut Call
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "tel:01633179630";
                Intent myActivity = new Intent(Intent.ACTION_DIAL, Uri.parse(phoneNumber));
                startActivity(myActivity);
            }
        });
        btnYoutube = (Button) findViewById(R.id.btYoutoBe); // nút youtube
        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.youtube.com";
                Intent myActivity = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(myActivity);
            }
        });
        btnMusic = (Button) findViewById(R.id.btMusic); // nút Music
        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myActivity = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("file://" + Environment.getExternalStorageDirectory().getAbsolutePath()+"/Music/Kalimba.mp3"); // đường dẫn file nhạc còn cách thêm file nhạc s thì phía dưới có
                myActivity.setDataAndType(data,"audio/mp3");
                startActivity(myActivity);
        }
        });
    }
}