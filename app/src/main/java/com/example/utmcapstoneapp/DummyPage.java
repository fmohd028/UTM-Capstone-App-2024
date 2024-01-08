package com.example.utmcapstoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class DummyPage extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy_page);

        button = (Button) findViewById(R.id.Button_K1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    public void openDialog(){
        Dialog dialog = new Dialog();

        LayoutInflater layoutInflater = this.getLayoutInflater();
        View menu_roomoccupied = layoutInflater.inflate(R.layout.menu_roomoccupied,null)


    }
}