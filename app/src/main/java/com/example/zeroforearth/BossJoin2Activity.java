package com.example.zeroforearth;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.os.Bundle;

public class BossJoin2Activity extends AppCompatActivity {
    RadioButton female,male;
    EditText phonenumber,password,nickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        female=(RadioButton)findViewById(R.id.femalebutton);
        male=(RadioButton)findViewById(R.id.malebutton);

        phonenumber=(EditText)findViewById(R.id.phonenumber);
        password=(EditText)findViewById(R.id.PassWord);
        nickname=(EditText)findViewById(R.id.NickName);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_join2);

    }
}