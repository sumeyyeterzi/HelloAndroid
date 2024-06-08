package com.sumeyyaterzi.helloandroid

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webview)
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // WebView istemcisini ayarlayın
        webView.webViewClient = WebViewClient()

        // Doğrudan URL'yi yükleyin
        webView.loadUrl("https://www.google.com")
    }
}
