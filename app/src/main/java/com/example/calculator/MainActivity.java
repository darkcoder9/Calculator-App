package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    float v1, v2;
    boolean add, sub, multi, div;
    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,na,ns,nm,nd,clear,equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        n3=findViewById(R.id.n3);
        n4=findViewById(R.id.n4);
        n5=findViewById(R.id.n5);
        n6=findViewById(R.id.n6);
        n7=findViewById(R.id.n7);
        n8=findViewById(R.id.n8);
        n9=findViewById(R.id.n9);
        n0=findViewById(R.id.n0);
        na=findViewById(R.id.na);
        ns=findViewById(R.id.ns);
        nm=findViewById(R.id.nm);
        nd=findViewById(R.id.nd);
        clear=findViewById(R.id.clear);
        equal=findViewById(R.id.equal);
        final EditText text=findViewById(R.id.Text);
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }});
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }});
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }});
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }});
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }});
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }});
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }});
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }});
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }});
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }});
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    v1 = Float.parseFloat(text.getText() + "");
                    add = true;
                    text.setText(null);
                } }});
        ns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(text.getText() + "");
                sub = true;
                text.setText(null);
            }});
        nm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(text.getText() + "");
                multi = true;
                text.setText(null);
            }
        });
        nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(text.getText() + "");
                div = true;
                text.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Float.parseFloat(text.getText() + "");
                if (add == true) {
                    text.setText(v1 + v2 + "");
                    add = false;
                }
                if (sub == true) {
                    text.setText(v1 - v2 + "");
                    sub = false;
                }
                if (multi == true) {
                    text.setText(v1 * v2 + "");
                    multi = false;
                }
                if (div == true) {
                    text.setText(v1 / v2 + "");
                    div = false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });
    }

    }

