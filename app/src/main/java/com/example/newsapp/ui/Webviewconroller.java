package com.example.newsapp.ui;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webviewconroller extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view,String url) {
        view.loadUrl(url);
        return true;
    }
}
