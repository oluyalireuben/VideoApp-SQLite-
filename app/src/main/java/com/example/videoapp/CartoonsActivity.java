package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class CartoonsActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoons);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/results?search_query=cartoons+for+3-5");
    }
}