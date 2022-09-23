package com.example.dolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private TextView textView;
    private Button plusbutton;
    private Button minusbutton;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("0");
                number=0;
                textView.setTextColor(Color.BLUE);
            }
        });

        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number++;
                textView.setText(String.valueOf(number));
                if (number<0){
                    textView.setTextColor(Color.RED);
                }else if (number>0){
                    textView.setTextColor(Color.GREEN);
                }else{
                    textView.setTextColor(Color.BLUE);
                }
            }
        });
        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number--;
                textView.setText(String.valueOf(number));
                if (number<0){
                    textView.setTextColor(Color.RED);
                }else if (number>0){
                    textView.setTextColor(Color.GREEN);
                }else{
                    textView.setTextColor(Color.BLUE);
                }
            }
        });

    }

    public void init() {
        layout = findViewById(R.id.layout);
        textView = findViewById(R.id.textview);
        plusbutton = findViewById(R.id.plusbutton);
        minusbutton = findViewById(R.id.minusbutton);
        number = 0;

    }
}