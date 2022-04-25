//회원가입 작성내용 (고객 ver.)
package com.example.zeroforearth;

import androidx.appcompat.app.AppCompatActivity;


import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.os.Bundle;

public class CustomerJoinActivity extends AppCompatActivity {
    RadioButton female_customer,male_customer;
    Button startbutton;
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
        startbutton =(Button)findViewById(R.id.UpLoadButton) ;
        phonenumber_customer=(EditText)findViewById(R.id.PhoneNumber2);
        password_customer=(EditText)findViewById(R.id.PassWord2);
        nickname_customer=(EditText)findViewById(R.id.NickName2);




    }
}