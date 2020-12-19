package com.example.android.mycalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float valueone,valuetwo;
    boolean div,mul,add,sub,rem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0=(Button) findViewById(R.id.zero);
        Button button1=(Button) findViewById(R.id.one);
        Button button2=(Button) findViewById(R.id.two);
        Button button3=(Button) findViewById(R.id.three);
        Button button4=(Button) findViewById(R.id.four);
        Button button5=(Button) findViewById(R.id.five);
        Button button6=(Button) findViewById(R.id.six);
        Button button7=(Button) findViewById(R.id.seven);
        Button button8=(Button) findViewById(R.id.eight);
        Button button9=(Button) findViewById(R.id.nine);
        Button buttonplus=(Button) findViewById(R.id.plus);
        Button buttonminus=(Button) findViewById(R.id.minus);
        Button buttonmul=(Button) findViewById(R.id.multiply);
        Button buttondiv=(Button) findViewById(R.id.divide);
        Button buttonremainder=(Button) findViewById(R.id.percentage);
        Button buttonequal=(Button) findViewById(R.id.equal);
        Button buttondel=(Button) findViewById(R.id.del);
        Button buttonsqr=(Button) findViewById(R.id.sqr);
       final TextView textView=(TextView) findViewById(R.id.txt);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              textView.setText(textView.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"9");
            }
        });
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    valueone=Float.parseFloat(textView.getText()+"");
                    add=true;
                    textView.setText(null);
                }
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    valueone=Float.parseFloat(textView.getText()+"");
                    sub=true;
                    textView.setText(null);
                }
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    valueone=Float.parseFloat(textView.getText()+"");
                    div=true;
                    textView.setText(null);
                }
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    valueone=Float.parseFloat(textView.getText()+"");
                    mul=true;
                    textView.setText(null);
                }
            }
        });
        buttonsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    valueone=Float.parseFloat(textView.getText()+"");
                    textView.setText(null);
                    textView.setText(valueone*valueone + "");
                }
            }
        });

        buttonremainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    valueone=Float.parseFloat(textView.getText()+"");
                    rem=true;
                    textView.setText(null);
                }
            }
        });
        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuetwo = Float.parseFloat(textView.getText() + "");

                if (add == true) {
                    textView.setText(valueone + valuetwo + "");
                    add = false;
                }

                if (sub == true) {
                    textView.setText(valueone - valuetwo + "");
                    sub = false;
                }

                if (mul == true) {
                    textView.setText(valueone * valuetwo + "");
                    mul = false;
                }

                if (div == true) {
                    textView.setText(valueone / valuetwo + "");
                    div = false;
                }
                if (rem == true) {
                    textView.setText(valueone % valuetwo + "");
                    div = false;
                }

            }
        });

    }
}