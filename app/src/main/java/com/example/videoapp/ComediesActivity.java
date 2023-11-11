package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ComediesActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedies);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/results?search_query=samspedy+comedies");
    }
}