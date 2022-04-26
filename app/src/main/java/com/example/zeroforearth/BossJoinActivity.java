//회원가입 작성내용 (사장 ver.1)
package com.example.zeroforearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class BossJoinActivity extends AppCompatActivity {

    EditText shopname;      //상점 이름
    EditText shopadress;    //상점 주소
    Spinner categoryspinner;  //카테고리
    Button NextButton;  //다음버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_join);

        shopname=(EditText)findViewById(R.id.ShopName);
        shopadress=(EditText)findViewById(R.id.ShopAdress);
        categoryspinner=(Spinner)findViewById(R.id.spinner);
        NextButton=(Button)findViewById(R.id.nextbutton);



        //화면전환 (사장정보입력1 -> 사장정보입력2)

        NextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BossJoinActivity.this , CustomerJoinActivity.class);
                startActivity(intent); //액티비티 이해주는 구문
            }


        });
    }
}



