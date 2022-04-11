package com.example.zeroforearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    EditText PhoneNumber; //아이디
    EditText PasswordId;   //비밀번호
    Button JoinId;// 회원가입 버튼
    Button LogIn;// 로그인 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhoneNumber = (EditText)findViewById(R.id.phonenumber);
        PasswordId=(EditText)findViewById(R.id.Passwordid);
        JoinId=(Button)findViewById(R.id.Joinbutton);
        LogIn=(Button)findViewById(R.id.Loginbutton);

        //화면전환 (회원가입(main activity) -> login activity))
        JoinId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , LoginActivity.class);
                startActivity(intent); //액티비티 이해주는 구문
            }
        });


    }

}



