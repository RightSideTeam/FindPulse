package com.rightside.findpulse;


import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        webView =(WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/maps/place/UniRedentor/@-21.194384,-41.9063798,18.5z/data=!4m8!1m2!2m1!1sgoogle+maps+redentor+itaperuna!3m4!1s0x0:0xcfc10aca2c3500cc!8m2!3d-21.1938282!4d-41.9062674");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
       if(webView.canGoBack()) {
           webView.goBack();

       } else{
            super.onBackPressed();
       }
    }
}
