//주소 검색2 (유트브참고)
//https://www.youtube.com/watch?v=I6sjUmcfCuU&list=PLC51MBz7PMyyyR2l4gGBMFMMUfYmBkZxm&index=51
package com.example.zeroforearth;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new BridgeInterface(), "Android");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                //Android -> Javascript 함수 호출
                webView.loadUrl("javascript:sample2_execDaumPostcode();");

            }
        });
        //최초 웹뷰 로드
        webView.loadUrl("https://searchaddress-2c7=847.web.app");
    }

    private class BridgeInterface {
        @JavascriptInterface
        public void processDATA(String data){
            //다음(카카오) 주소 검색 API의 결과 값이 브릿지 통로를 통해 전달 받는다.(from Javascript)
            Intent intent = new Intent();
            intent.putExtra("data", data);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}