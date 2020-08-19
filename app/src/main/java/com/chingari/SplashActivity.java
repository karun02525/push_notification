package com.chingari;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private static String TAG = "SplashTag";
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        id = getIntent().getStringExtra("id");
        Log.d(TAG, "Main=> Splash Screen=> id : " + id);
        openMainScreen();

    }


    private void openMainScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "Main=> Splash Screen=> id : " + id);
                Intent intent = new Intent(new Intent(getBaseContext(), MainActivity.class));
                intent.putExtra("Id",id);
                startActivity(intent);
                finish();
            }
        }, 1000);

    }

}
