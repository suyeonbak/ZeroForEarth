package com.example.zeroforearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    Button BossButton;  //사장님으로 회원가입할래요 버튼
    Button CustomerButton; // 고객님으로 회원가입할래요 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        BossButton= (Button)findViewById(R.id.Bossbutton);
        CustomerButton=(Button)findViewById(R.id.Customerbutton);


        //화면전환 (로그인 -> 사장님 상점입력)
        BossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this , BossJoinActivity.class);
                startActivity(intent); //액티비티 이해주는 구문
            }


        });
        //화면전환 (로그인 -> 고객 장보입력)
        CustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this , CustomerJoinActivity.class);
                startActivity(intent); //액티비티 이해주는 구문
            }


        });

    }

}