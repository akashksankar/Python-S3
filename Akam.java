package com.example.arrayadapter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] languages = {
            "Java",
            "Python",
            "C",
            "C++",
            "JavaScript",
            "Kotlin"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            listView = findViewById(R.id.listView);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    languages
            );

            listView.setAdapter(adapter);

            listView.setOnItemClickListener((parent, view, position, id) -> {

                Toast.makeText(
                        MainActivity.this,
                        "Error: No data",
                        Toast.LENGTH_SHORT
                ).show();

            });

        } catch (Exception e) {

            Toast.makeText(
                    MainActivity.this,
                    "Error: " + e.getMessage(),
                    Toast.LENGTH_LONG
            ).show();
        }
    }
}
