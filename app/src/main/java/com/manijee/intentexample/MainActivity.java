package com.manijee.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnNext;
EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext=findViewById(R.id.btnnext);
        btnNext.setOnClickListener(this);
        name=findViewById(R.id.edt_name);
    }

    @Override
    public void onClick(View v) {
        String username=name.getText().toString();
        Intent call=new Intent(this,SecondActivity.class);
        call.putExtra("user",username); //sending data using intent
        startActivity(call);
    }
}