package com.example.android_app1;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class MainActivity extends Activity{
    WebView browser;

    @Override
	protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main_layout);
    	browser = (WebView)findViewById(R.id.webkit);
    	browser.loadUrl("http://huaban.com/favorite/beauty/");
	}
}
