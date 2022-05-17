//회원가입 작성내용 (사장 ver.2) - 삭제보류
package com.example.zeroforearth;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class BossJoin2Activity extends AppCompatActivity {
    private EditText mID2, mPwd2, mPwdChk2, mNick2; //아이디, 비밀번호, 닉네임 입력필드
    private Button startButton2; // 회원가입 버튼


    //상단바 이전버튼 클릭시 이동할경로 설정
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{

                Intent intent = new Intent(getApplicationContext(),BossJoinActivity.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_join2);

        mID2 = findViewById(R.id.PhoneNumber2);
        mPwd2 = findViewById(R.id.PassWord2);
        mPwdChk2 = findViewById(R.id.passWordCheck2);
        mNick2 = findViewById(R.id.NickName2);
        startButton2 =(Button)findViewById(R.id.startButton2) ;


        //툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        getSupportActionBar().setTitle(" "); // 툴바제목설정



        //화면전환 (사장정보입력1 -> 사장정보입력2)

        startButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BossJoin2Activity.this , MainHomeActivity.class);
                startActivity(intent); //액티비티 이해주는 구문
            }


        });

    }
}
