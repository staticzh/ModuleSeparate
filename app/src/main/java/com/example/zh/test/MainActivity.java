package com.example.zh.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.suninfo.commonlibrary.router.RouterA;
import com.suninfo.commonlibrary.router.RouterBus;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_main);

    }
    public void jumpA (View view){
        Intent intentA = RouterBus.getRouter(RouterA.class).getIntentActivityA("我是从主Module通过参数传递过来的");
        if(intentA != null){
            startActivity(intentA);
        }
    }
}
