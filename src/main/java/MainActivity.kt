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
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
        webSettings.databaseEnabled = true

        webView.webViewClient = WebViewClient()

        // Mengambil URL yang ada pada build.gradle.kts (APP_URL)
        val appUrl = BuildConfig.APP_URL
        webView.loadUrl(appUrl)
    }
}
