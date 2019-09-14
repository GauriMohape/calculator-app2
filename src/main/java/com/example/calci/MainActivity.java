package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button Open_Calculator;
private Button Formulas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dashboard(View view) {
        Intent intent=new Intent(getApplicationContext(),calculator.class);
        startActivity(intent);
    }
    public void intro(View view){
        Intent i=new Intent(getApplicationContext(),info.class);
        startActivity(i);
    }
    public void log(View view){
        Intent in=new Intent(getApplicationContext(),login.class);
        startActivity(in);
    }


}
