package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ImageView im;
    ToggleButton tg;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im = (ImageView) findViewById(R.id.im);
        tg = (ToggleButton) findViewById(R.id.tg);

        im.setVisibility(View.INVISIBLE);

        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tg.isChecked()) {
                    im.setVisibility(View.VISIBLE);
                }
                else {
                    im.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
