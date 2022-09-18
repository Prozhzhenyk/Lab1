package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.textView);
        Button btn_text = findViewById(R.id.btn_text);
        Button btn_clr = findViewById(R.id.btn_color);
        Button btn_dflt = findViewById(R.id.btn_defoult);
        btn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("You decided to change text!");
                text.setTextColor(Color.MAGENTA);

            }
        });
        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextColor(Color.BLUE);
                text.setText("You decided to change color!");

            }
        });
        btn_dflt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextColor(Color.parseColor("#673AB7"));
                text.setText("Please choose what kind of changes you want to do!");

            }
        });
    }
}