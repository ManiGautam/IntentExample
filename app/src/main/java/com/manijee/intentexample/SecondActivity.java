package com.manijee.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn=findViewById(R.id.btn_back);
        btn.setOnClickListener(this);
        tv=findViewById(R.id.txt_data);
        String username=getIntent().getExtras().getString("user");
        tv.setText("Wecome Mr. "+username);
    }

    @Override
    public void onClick(View v) {
        System.exit(0);
    }
}