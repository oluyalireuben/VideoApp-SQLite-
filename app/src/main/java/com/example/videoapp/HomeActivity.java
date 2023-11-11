package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnMovies, btnSeries, btnCartoons, btnComedies,btnOther,btnLogOut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize UI components
        btnMovies = findViewById(R.id.btnMovies);
        btnSeries = findViewById(R.id.btnSeries);
        btnCartoons = findViewById(R.id.btnCartoons);
        btnComedies = findViewById(R.id.btnComedies);
        btnOther = findViewById(R.id.btnOther);
        btnLogOut = findViewById(R.id.btnLogOut);

        // Set click listeners for each button
        btnMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MoviesActivity.class));
            }
        });

        btnSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, SeriesActivity.class));
            }
        });

        btnCartoons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, CartoonsActivity.class));
            }
        });

        btnComedies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ComediesActivity.class));
            }
        });

        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, OthersActivity.class));
            }
        });


        // Set click listener for exit button
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });


    }
}