package com.example.zeroforearth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;



public class Wishlist extends AppCompatActivity {

    ImageButton ib1,ib2,ib3,ib4,ib5;
    ImageView p1,p2,p3,p4,p5;
    TextView pText1,pText2,pText3,pText4,pText5;


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        p1=(ImageView)findViewById(R.id.p1);
        p2=(ImageView)findViewById(R.id.p2);
        p3=(ImageView)findViewById(R.id.p3);
        p4=(ImageView)findViewById(R.id.p4);
        p5=(ImageView)findViewById(R.id.p5);
        ib1=(ImageButton)findViewById(R.id.ib1);
        ib2=(ImageButton)findViewById(R.id.ib2);
        ib3=(ImageButton)findViewById(R.id.ib3);
        ib4=(ImageButton)findViewById(R.id.ib4);
        ib5=(ImageButton)findViewById(R.id.ib5);
        pText1=(TextView)findViewById(R.id.pText1);
        pText2=(TextView)findViewById(R.id.pText2);
        pText3=(TextView)findViewById(R.id.pText3);
        pText4=(TextView)findViewById(R.id.pText4);
        pText5=(TextView)findViewById(R.id.pText5);



        //툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        getSupportActionBar().setTitle(" "); // 툴바제목설정



    }
}