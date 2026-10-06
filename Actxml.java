package com.example.try_catch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {

    Button bb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        bb = findViewById(R.id.button2);

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(
                        activity2.this,
                        MainActivity.class
                );

                startActivity(i);
            }
        });
    }
}
