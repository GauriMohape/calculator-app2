package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    TextView ans;
    double var1,var2;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        b10=(Button)findViewById(R.id.btn10);
        b11=(Button)findViewById(R.id.btn11);
        b12=(Button)findViewById(R.id.btn12);
        b13=(Button)findViewById(R.id.btn13);
        b14=(Button)findViewById(R.id.btn14);
        b15=(Button)findViewById(R.id.btn15);
        b16=(Button)findViewById(R.id.btn16);
        b17=(Button)findViewById(R.id.btn17);
        b18=(Button)findViewById(R.id.btn18);
        ans =(TextView)findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"9");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"8");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"7");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                add=true;
                ans.setText(null);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"6");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"5");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"4");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                sub=true;
                ans.setText(null);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"3");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"2");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"1");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                div=true;
                ans.setText(null);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+".");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"0");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                add=true;
                ans.setText(null);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                mul=true;
                ans.setText(null);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text=ans.getText().toString();
                ans.setText("");
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=Double.parseDouble(ans.getText()+"");
                if(add==true)
                {
                    ans.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true)
                {
                    ans.setText(var1-var2+"");
                    sub=false;
                }
                if(div==true)
                {
                    ans.setText(var1/var2+"");
                    div=false;
                }
                if(mul==true)
                {
                    ans.setText(var1*var2+"");
                    mul=false;
                }
            }
        });

    }

}
