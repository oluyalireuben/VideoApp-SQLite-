package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SeriesActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.imdb.com/search/title?title_type=tv_series");

    }
}