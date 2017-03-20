package com.suninfo.moduleb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.suninfo.commonlibrary.communication.FunctionA;
import com.suninfo.commonlibrary.communication.FunctionBus;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moduleb_activity_main);
        TextView view = (TextView) findViewById(R.id.tv);
        FunctionA function = FunctionBus.getFunction(FunctionA.class);
        if (function != null) {
            view.setText((CharSequence) function.getData());
        }
    }
}
