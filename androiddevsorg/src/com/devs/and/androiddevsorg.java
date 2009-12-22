package com.devs.and;

import android.app.Activity; 
import android.os.Bundle; 
import android.view.KeyEvent; 
import android.webkit.WebView; 
import android.webkit.WebViewClient; 
public class androiddevsorg extends Activity { 
        /** Called when the activity is first created. */ 
        WebView webview; 
        @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.main); 
        webview = (WebView) findViewById(R.id.webview); 
        webview.setWebViewClient(new androiddevsorgClient()); 
        webview.getSettings().setJavaScriptEnabled(true); 
        webview.loadUrl("http://android-devs.org/forum"); 
    } 
        private class androiddevsorgClient extends WebViewClient { 
            @Override 
            public boolean shouldOverrideUrlLoading(WebView view, String url) 
{ 
                view.loadUrl(url); 
                return true; 
            } 
        }
        public boolean onKeyDown(int keyCode, KeyEvent event) { 
            if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) { 
                webview.goBack(); 
                return true; 
            } 
            return super.onKeyDown(keyCode, event); 
        } 
} 