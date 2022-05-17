package com.example.zeroforearth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductConfirm extends AppCompatActivity {

    TextView t1,t2,t3,t4;//매물확인정보,상품명,할인가,원가
    Button ppbutton; //찜 버튼
    ImageView pp1;  //상품이미지

    //상단바 이전버튼 클릭시 이동할경로 설정
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{

                Intent intent = new Intent(getApplicationContext(),MainHomeActivity.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_confirm);

        t1= (TextView)findViewById(R.id.t1);
        t2= (TextView)findViewById(R.id.t2);
        t3= (TextView)findViewById(R.id.t3);
        t4= (TextView)findViewById(R.id.t4);
        ppbutton=(Button)findViewById(R.id.ppbutton);
        pp1=(ImageView)findViewById(R.id.pp1);


        //툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        getSupportActionBar().setTitle(" "); // 툴바제목설정



    }
}