package com.example.androidcodelib;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.androidcodelib.Login.LoginActivity;
import com.loopj.android.http.AsyncHttpClient;

public class MainActivity extends Activity {

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
         decorView.setSystemUiVisibility(uiOptions);

        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.testImage);
        imageView.setBackgroundColor(Color.RED);


        String url = "http://c.hiphotos.baidu.com/image/pic/item/9922720e0cf3d7ca810f3732f81fbe096a63a9fd.jpg";
        Glide.with(this).load(url).into(imageView);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                gotoLoginActivity();
            }
        },4000);


    }


    private  void gotoLoginActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
