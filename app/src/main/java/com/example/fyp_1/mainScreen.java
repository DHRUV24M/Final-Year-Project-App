package com.example.fyp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainScreen extends AppCompatActivity {
    Button removeBtn = findViewById(R.id.removeUserBtn);
    Button updateBtn = findViewById(R.id.updateBtn);
    Button newUserBtn = findViewById(R.id.newUserBTn);
    Button map = findViewById(R.id.googleMapBtn);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        // to remove any existing user
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDeleteUserActivity();
            }
        });

        // to update any filled details of the user
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startUpdateActivity();
            }
        });

        // to add new user
        newUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewUserActivity();
            }
        });

        // to redirect to the google map marked with black spot on the area
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    public void startDeleteUserActivity()
    {
        Intent intent = new Intent(mainScreen.this,DeleteData.class);
        startActivity(intent);
    }

    public void startUpdateActivity()
    {
        Intent intent = new Intent(mainScreen.this,UpdateData.class);
        startActivity(intent);
    }

    public void startNewUserActivity()
    {
        Intent intent = new Intent(mainScreen.this,MainActivity.class);
        startActivity(intent);
    }

    public void startMapActivity()
    {
        Intent intent = new Intent(mainScreen.this,GoogleMaps.class);
        startActivity(intent);
    }

}