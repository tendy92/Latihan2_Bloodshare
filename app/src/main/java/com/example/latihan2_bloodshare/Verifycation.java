package com.example.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Verifycation extends AppCompatActivity {

    public void home(View view){
        Intent intent = new Intent(Verifycation.this, User_Home.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifycation);

        Intent intent = getIntent();
    }
}