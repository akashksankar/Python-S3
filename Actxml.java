package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    Spinner sp;

    String[] list = {
            "Apple",
            "Kiwi",
            "Mango",
            "Orange"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spinnerd);

        sp.setOnItemSelectedListener(this);

        ArrayAdapter<String> ar = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                list
        );

        ar.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        sp.setAdapter(ar);
    }

    @Override
    public void onItemSelected(
            AdapterView<?> adapterView,
            View view,
            int i,
            long l) {

        Toast.makeText(
                this,
                "You clicked on " + list[i],
                Toast.LENGTH_SHORT
        ).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

        Toast.makeText(
                this,
                "Nothing Selected",
                Toast.LENGTH_SHORT
        ).show();
    }
        }
