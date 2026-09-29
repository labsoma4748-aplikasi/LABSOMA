package com.pribadi.webview

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        setContentView(webView)

        val webSettings: WebSettings = webView.settings
        @Suppress("SetJavaScriptEnabled")
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
        webSettings.databaseEnabled = true

        webView.webViewClient = WebViewClient()

        // Memuat URL Google Apps Script langsung
        val appUrl = "https://script.google.com/macros/s/AKfycbx7KU5Qd0lJ1PIKLwGW0pehL394vXeo8_KGMVynjfbpGGvsvS8OXe3F2_eizPu_UrBc/exec"
        webView.loadUrl(appUrl)
    }
}
