package com.example.espressoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextFirstName;
    EditText editTextLastName;
    String firstName;
    String lastName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public static boolean isValidName(String name){
        String regex = "^[a-zA-Z]+$";
        if (name.matches(regex)) {
            return true;
        }else{
        return false;}
    }

    public void validateText(View view) {
        editTextFirstName = findViewById(R.id.firstName);
        editTextLastName = findViewById(R.id.lastName);
        firstName = editTextFirstName.getText().toString();
        lastName = editTextLastName.getText().toString();


        if (isValidName(firstName) && isValidName(lastName)) {
            Toast.makeText(this, "Valid Text", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "InValid Text", Toast.LENGTH_SHORT).show();
        }
    }
}
