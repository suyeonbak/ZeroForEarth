//회원가입 작성내용 (사장 ver.1)
package com.example.zeroforearth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;


public class BossJoinActivity extends AppCompatActivity {

    EditText shopname;      //상점 이름
    EditText shopadress;    //상점 주소
    EditText phonenumber;    //전화번호
    EditText startTextTime;    //영업시작시간
    EditText endTextTime;    //영업종료시간
    Spinner categoryspinner;  //카테고리
    Button NextButton;  //다음버튼
    ImageButton smilebutton; //상단바 스마일(찜목록 확인)


    //상단바 이전버튼 클릭시 이동할경로 설정
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{

                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_join);

        shopname=(EditText)findViewById(R.id.ShopName);
        shopadress=(EditText)findViewById(R.id.ShopAdress);
        startTextTime=(EditText)findViewById(R.id.startTextTime);
        endTextTime=(EditText)findViewById(R.id.endTextTime);
        phonenumber=(EditText)findViewById(R.id.phonenumber);
        categoryspinner=(Spinner)findViewById(R.id.spinner);
        NextButton=(Button)findViewById(R.id.nextbutton);
        //smilebutton=(ImageButton)findViewById(R.id.smilebutton);


        //툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        getSupportActionBar().setTitle(" "); // 툴바제목설정


        //화면전환 (사장정보입력1 -> 사장정보입력2)

        NextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BossJoinActivity.this , BossJoin2Activity.class);
                startActivity(intent); //액티비티 이해주는 구문
            }


        });
/*
        //화면전환(상단 스마일 -> ? )
        smilebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BossJoinActivity.this , MainHomeActivity.class);
                startActivity(intent); //액티비티 이해주는 구문
            }


        });

 */
    }
}



