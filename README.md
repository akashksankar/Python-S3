<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="24dp"
    android:background="#F0F2F5">

    <TextView
        android:id="@+id/facebookLogo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="facebook"
        android:textColor="#1877F2"
        android:textSize="42sp"
        android:textStyle="bold"
        android:layout_marginBottom="35dp" />

    <EditText
        android:id="@+id/emailInput"
        android:layout_width="match_parent"
        android:layout_height="55dp"
        android:hint="Email or phone number"
        android:inputType="textEmailAddress"
        android:padding="15dp"
        android:background="@android:drawable/editbox_background"
        android:layout_marginBottom="12dp" />

    <EditText
        android:id="@+id/passwordInput"
        android:layout_width="match_parent"
        android:layout_height="55dp"
        android:hint="Password"
        android:inputType="textPassword"
        android:padding="15dp"
        android:background="@android:drawable/editbox_background"
        android:layout_marginBottom="16dp" />

    <Button
        android:id="@+id/loginButton"
        android:layout_width="match_parent"
        android:layout_height="55dp"
        android:text="Log In"
        android:textSize="18sp"
        android:textStyle="bold"
        android:textColor="#FFFFFF"
        android:backgroundTint="#1877F2" />

    <TextView
        android:id="@+id/forgotPassword"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Forgotten password?"
        android:textColor="#1877F2"
        android:textSize="15sp"
        android:layout_marginTop="18dp"
        android:layout_marginBottom="25dp" />

    <View
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:background="#CCCCCC"
        android:layout_marginBottom="25dp" />

    <Button
        android:id="@+id/createAccountButton"
        android:layout_width="wrap_content"
        android:layout_height="50dp"
        android:text="Create new account"
        android:textColor="#FFFFFF"
        android:textStyle="bold"
        android:backgroundTint="#42B72A" />

</LinearLayout>



package com.example.dummyfacebook;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText emailInput, passwordInput;
    Button loginButton, createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);

        loginButton = findViewById(R.id.loginButton);
        createAccountButton = findViewById(R.id.createAccountButton);

        loginButton.setOnClickListener(v -> {

            String email = emailInput.getText().toString().trim();
            String password = passwordInput.getText().toString();

            if (email.isEmpty() || password.isEmpty()) {

                Toast.makeText(
                        MainActivity.this,
                        "Please enter both fields",
                        Toast.LENGTH_SHORT
                ).show();

            } else {

                // Dummy login only.
                Toast.makeText(
                        MainActivity.this,
                        "Demo login successful!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        createAccountButton.setOnClickListener(v -> {

            Toast.makeText(
                    MainActivity.this,
                    "Create account clicked",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
