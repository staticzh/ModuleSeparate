package com.suninfo.modulea;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.suninfo.commonlibrary.communication.FunctionA;
import com.suninfo.commonlibrary.communication.FunctionBus;
import com.suninfo.commonlibrary.router.RouterB;
import com.suninfo.commonlibrary.router.RouterBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea_activity_main);
        Intent intent = getIntent();
        Uri data = intent.getData();
        String name = data.getQueryParameter("name");
        TextView view = (TextView) findViewById(R.id.tv);
        view.setText(name);
    }

    public void switchB(View e){
        Intent intentB = RouterBus.getRouter(RouterB.class).getIntentActivityB("activityA");
        if(intentB !=null){

            FunctionBus.setFunction(new FunctionA() {
                @Override
                public Object getData() {
                    return "我是从ModuleA传递过来的";
                }
            });
            startActivity(intentB);
        }
    }
}
