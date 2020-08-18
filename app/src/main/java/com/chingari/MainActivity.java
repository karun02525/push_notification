package com.chingari;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String id = getIntent().getStringExtra("Id");
        Log.d("Main=>", "id: " + id);
    }


    @Override
    protected void onResume() {
        super.onResume();
        String id = getIntent().getStringExtra("Id");
        Log.d("Main=>", "Id: " + id);
    }
}
