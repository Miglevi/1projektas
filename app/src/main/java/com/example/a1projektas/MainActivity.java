package com.example.a1projektas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    public void btnTextClick(View view) {
        this.tvMain.setText("Hello");
    }

    public void changecolor(View view) {
        this.tvMain.setTextColor(Color.BLUE);
    }
}