package com.example.zeroforearth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Management extends AppCompatActivity {

    Button button_upload,button_re1,button_re2,button_re3,button_re4,button_remove1,button_remove2,button_remove3,button_remove4;
    ImageView image1,image2,image3,image4;
    TextView text_confirm,saletext1,saletext2,saletext3,saletext4;


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
        setContentView(R.layout.activity_management);



        button_upload=(Button)findViewById(R.id.button_upload); //매물올리기버튼
        button_re1=(Button)findViewById(R.id.button_re1);   // 매물수정버튼
        button_re2=(Button)findViewById(R.id.button_re2);
        button_re3=(Button)findViewById(R.id.button_re3);
        button_re4=(Button)findViewById(R.id.button_re4);
        button_remove1=(Button)findViewById(R.id.button_remove1);   //매물삭제버튼
        button_remove2=(Button)findViewById(R.id.button_remove2);
        button_remove3=(Button)findViewById(R.id.button_remove3);
        button_remove4=(Button)findViewById(R.id.button_remove4);
        image1=(ImageView)findViewById(R.id.image1);    //매물이미지
        image2=(ImageView)findViewById(R.id.image2);
        image3=(ImageView)findViewById(R.id.image3);
        image4=(ImageView)findViewById(R.id.image4);
        text_confirm=(TextView)findViewById(R.id.text_confirm);// 매물확인 textview
        saletext1=(TextView)findViewById(R.id.saletext1);   //매물할인금액 textview
        saletext2=(TextView)findViewById(R.id.saletext2);
        saletext3=(TextView)findViewById(R.id.saletext3);
        saletext4=(TextView)findViewById(R.id.saletext4);

        //툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        getSupportActionBar().setTitle(" "); // 툴바제목설정


        //화면전환 (내 정보 -> MypageInfo)
        button_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Management.this,ProductUpload.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);//액티비티 이해주는 구문

            }


        });
    }
}