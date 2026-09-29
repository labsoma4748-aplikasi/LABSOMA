package com.pribadi.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        setContentView(webView);

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        String appUrl = "https://script.google.com/macros/s/AKfycbx7KU5Qd0lJ1PIKLwGW0pehL394vXeo8_KGMVynjfbpGGvsvS8OXe3F2_eizPu_UrBc/exec";
        webView.loadUrl("file:///android_asset/index.html");
    }
}
