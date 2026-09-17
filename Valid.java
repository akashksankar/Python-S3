package com.example.validation; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity extends AppCompatActivity { 
@Override
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);
Button submitButton = findViewById(R.id.submitButton); 
submitButton.setOnClickListener(new View.OnClickListener() { 
@Override
public void onClick(View v) { 
validateFields();
} 
});
} 
private void validateFields() { 
// For Empty Field Validation
EditText editTextName = findViewById(R.id.editTextName); 
String name = editTextName.getText().toString().trim();
if (name.isEmpty()) {
editTextName.setError("Name cannot be empty"); 
return;
} 
// For Email Format Validation
EditText editTextEmail = findViewById(R.id.editTextEmail); 
String email = editTextEmail.getText().toString().trim();
if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) { 
editTextEmail.setError("Invalid email format");
return;
} 
// For Password Length Validation
EditText editTextPassword = findViewById(R.id.editTextPassword); 
String password = editTextPassword.getText().toString().trim();
  int minLength = 6; // Set your desired minimum password length 
if (password.length() < minLength) {
editTextPassword.setError("Password must be at least " + minLength + " 
characters long");
return;
} 
Toast.makeText(this, "Valid inputs", Toast.LENGTH_SHORT).show();
} 
} 
