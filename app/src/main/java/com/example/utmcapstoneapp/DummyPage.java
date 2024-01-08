package com.example.utmcapstoneapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class DummyPage extends AppCompatActivity {
//This is the code page for the room selection page
    FirebaseAuth auth;
    Button button_logout,buttonk1;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy_page);

        auth = FirebaseAuth.getInstance();
        button_logout = findViewById(R.id.logout);
        buttonk1 = findViewById(R.id.Button_K1);
        user = auth.getCurrentUser();

        button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }

        });
        buttonk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Room Available",Toast.LENGTH_SHORT).show();


            }
        });
    }

}