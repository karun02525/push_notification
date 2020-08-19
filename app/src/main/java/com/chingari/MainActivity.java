package com.chingari;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);

    }


    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = getIntent();
        String id = intent.getStringExtra("Id");

        if(id !=null) {
            Toast.makeText(getBaseContext(), "Your ID: " + id, Toast.LENGTH_SHORT).show();
            tv.setText("Main=> onResume " + id);
        }

        Log.d("Main=> onResume", "Id: " + id);
    }
}
