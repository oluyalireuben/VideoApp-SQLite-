package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.SearchView;

public class MoviesActivity extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.google.com/search?q=movies");

    }
}