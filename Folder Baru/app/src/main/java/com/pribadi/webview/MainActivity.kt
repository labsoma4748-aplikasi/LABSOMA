package com.pribadi.webview

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        setContentView(webView)

        val settings = webView.settings
        @Suppress("SetJavaScriptEnabled")
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true

        webView.webViewClient = WebViewClient()

        val appUrl = "https://script.google.com/macros/s/AKfycbx7KU5Qd0lJ1PIKLwGW0pehL394vXeo8_KGMVynjfbpGGvsvS8OXe3F2_eizPu_UrBc/exec"
        webView.loadUrl(appUrl)
    }
}
