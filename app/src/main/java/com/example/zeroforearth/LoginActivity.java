package com.example.zeroforearth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    }
}
