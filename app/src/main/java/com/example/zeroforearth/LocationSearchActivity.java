//주소검색2 (유트브참고)
//https://www.youtube.com/watch?v=I6sjUmcfCuU&list=PLC51MBz7PMyyyR2l4gGBMFMMUfYmBkZxm&index=51
package com.example.zeroforearth;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LocationSearchActivity extends AppCompatActivity {


    private EditText mEtadress; //주소값 입력받는 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_search);

        mEtadress = findViewById(R.id.et_address);
        //black touch (터치를 막는다)
        mEtadress.setFocusable(false);
        mEtadress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //주소검색 웹뷰 화면으로 이동
                Intent intent = new Intent(LocationSearchActivity.this, SearchActivity.class);
                getSearchResult.launch(intent);

            }
        });
    }

    private final ActivityResultLauncher<Intent> getSearchResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                //Search Activity 로부터의 결과 값이 이곳으로 전달된다. (setResult에 의해.)
                if (result.getResultCode() == RESULT_OK) {
                    if(result.getData() != null){
                        String data = result.getData().getStringExtra("data");
                        mEtadress.setText(data);
                    }
                }
            }
    );
}