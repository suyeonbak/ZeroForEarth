package com.example.zeroforearth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MypageInfo extends AppCompatActivity {

    TextView Nickname,Nicknameinfo,Number,Numberinfo,born,borninfo,sex,sexinfo; // 닉네임, 닉네임정보, 전화번호,전화번호정보,생년월일,생년월일정보, 성별, 성별정보
    Button Logout; //로그아웃버튼

    //상단바 이전버튼 클릭시 이동할경로 설정
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{

                Intent intent = new Intent(getApplicationContext(),MainHomeActivity.class); // 마이페이지 리스트목록으로/ 옮기기
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_info);

        //textview,Button에 해당하는 선언
        Nickname= (TextView)findViewById(R.id.Nickname);    //닉네임
        Nicknameinfo=(TextView)findViewById(R.id.Nicknameinfo); //닉네임정보
        Number=(TextView)findViewById(R.id.Number); //전화번호
        Numberinfo=(TextView)findViewById(R.id.Numberinfo); //전화번호정보
        born=(TextView)findViewById(R.id.born); //생년월일
        borninfo=(TextView)findViewById(R.id.borninfo); //생년월일정보
        sex=(TextView)findViewById(R.id.sex);   //성별
        sexinfo=(TextView)findViewById(R.id.sexinfo);   //성별정보
        Logout=(Button)findViewById(R.id.Logout);   //로그아웃 버튼 시 로그아웃

        //툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        getSupportActionBar().setTitle(" "); // 툴바제목설정

    }
} //로그아웃하시겠습니까? 팝업창 뜨면 좋을 듯.