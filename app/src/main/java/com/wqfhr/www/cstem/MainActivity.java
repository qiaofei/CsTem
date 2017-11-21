package com.wqfhr.www.cstem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ren.yale.android.cachewebviewlib.CacheWebView;

public class MainActivity extends AppCompatActivity {

  public CacheWebView cacheWebView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    cacheWebView = findViewById(R.id.cacheWebView);
//    CacheWebView.cacheWebView(this).loadUrl("https://playcanv.as/p/JERg21J8/");//要放在UI线程
    cacheWebView.loadUrl("https://playcanv.as/p/JERg21J8/");
  }

  @Override
  protected void onResume() {
    super.onResume();
    cacheWebView.onResume();
  }

  @Override
  protected void onPause() {
    super.onPause();
    cacheWebView.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    cacheWebView.destroy();
  }
}
