package com.example.zeroforearth;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.icu.text.RelativeDateTimeFormatter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toolbar;
import android.os.Bundle;

public class CustomerJoinActivity extends AppCompatActivity {
    RadioButton female_customer,male_customer;

    EditText phonenumber_customer,password_customer,nickname_customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_join);

      /*  ActionBar actionBar=getSupportActionBar(); //제목줄 객체 얻어오기
            actionBar.setTitle("회원가입"); //액션바 제목
           actionBar.setDisplayHomeAsUpEnabled(true);// 액션바 뒤로가기 보여주기 위함

       */

        female_customer=(RadioButton)findViewById(R.id.femalebutton2);
        male_customer=(RadioButton)findViewById(R.id.malebutton2);

        phonenumber_customer=(EditText)findViewById(R.id.PhoneNumber2);
        password_customer=(EditText)findViewById(R.id.PassWord2);
        nickname_customer=(EditText)findViewById(R.id.NickName2);




    }
}