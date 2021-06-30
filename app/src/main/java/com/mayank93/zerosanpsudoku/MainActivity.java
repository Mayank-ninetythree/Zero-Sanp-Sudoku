package com.mayank93.zerosanpsudoku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    CardView select_xo_home_page;
    CardView select_sanp_home_page;
    CardView select_sudoku_home_page;

    Vibrator vibrator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);   //hide status bar
        Objects.requireNonNull(getSupportActionBar()).hide();       //hide action bar

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        select_xo_home_page = findViewById(R.id.select_xo_home_page);
        select_sanp_home_page = findViewById(R.id.select_sanp_home_page);
        select_sudoku_home_page = findViewById(R.id.select_sudoku_home_page);

        select_xo_home_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(25);
                startActivity(new Intent(getApplicationContext(), ComingSoon.class));
            }
        });
        select_sanp_home_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(25);
                startActivity(new Intent(getApplicationContext(), ComingSoon.class));
            }
        });
        select_sudoku_home_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(25);
                startActivity(new Intent(getApplicationContext(), ComingSoon.class));
            }
        });


    }
}