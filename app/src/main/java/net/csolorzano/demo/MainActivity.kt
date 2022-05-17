package net.csolorzano.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true


        //setContentView(R.layout.activity_main)
        setContentView(webView)
        webView.loadUrl("https://google.com")
    }
}