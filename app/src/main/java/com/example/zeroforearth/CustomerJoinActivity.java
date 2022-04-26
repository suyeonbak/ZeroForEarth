//회원가입 작성내용 (고객 ver.)

package com.example.zeroforearth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.icu.text.RelativeDateTimeFormatter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.Toolbar;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class CustomerJoinActivity extends AppCompatActivity {


    private static final String TAG = "CustomerJoinActivity";
    private FirebaseAuth mFirebaseAuth;  //파이어베이스 인증
    private DatabaseReference mDatabaseRef; //실시간 데이터베이스
    private EditText mID, mPwd, mPwdChk, mNick; //아이디, 비밀번호, 닉네임 입력필드
    // private RadioButton female_customer,male_customer; //성별버튼
    private Button startbutton; // 회원가입 버튼


    //RadioButton female_customer,male_customer;

    //EditText phonenumber_customer,password_customer,nickname_customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_join);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("ZeroForEarth");

        mID = findViewById(R.id.PhoneNumber2);
        mPwd = findViewById(R.id.PassWord2);
        mPwdChk = findViewById(R.id.passWordCheck);
        mNick = findViewById(R.id.NickName2);

        startbutton = findViewById(R.id.startbutton);


        // Firebase Auth 진행
        //닉네임은..?

        //가입버튼 클릭리스너   -->  firebase에 데이터를 저장한다.
        startbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //가입 정보 가져오기
                final String strID = mID.getText().toString().trim();
                String strPwd = mPwd.getText().toString().trim();
                String strPwdChk = mPwdChk.getText().toString().trim();
                String strNick = mNick.getText().toString();


                if (strPwd.equals(strPwdChk)) {
                    Log.d(TAG, "등록 버튼 " + strID + " , " + strPwd);

                    final ProgressDialog mDialog = new ProgressDialog(CustomerJoinActivity.this);
                    mDialog.setMessage("가입중입니다...");
                    mDialog.show();

                    //파이어베이스에 신규계정 등록하기
                    mFirebaseAuth.createUserWithEmailAndPassword(strID, strPwd).addOnCompleteListener(CustomerJoinActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            //가입 성공시
                            if (task.isSuccessful()) {
                                mDialog.dismiss();

                                FirebaseUser user = mFirebaseAuth.getCurrentUser();
                                String email = user.getEmail();
                                String uid = user.getUid();
                                String name = mNick.getText().toString().trim();

                                //해쉬맵 테이블을 파이어베이스 데이터베이스에 저장
                                HashMap<Object, String> hashMap = new HashMap<>();

                                hashMap.put("uid", uid);
                                hashMap.put("email", email);
                                hashMap.put("name", name);

                                FirebaseDatabase database = FirebaseDatabase.getInstance();
                                DatabaseReference reference = database.getReference("Users");
                                reference.child(uid).setValue(hashMap);


                                //가입이 이루어져을시 가입 화면을 빠져나감.
                                Intent intent = new Intent(CustomerJoinActivity.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                                Toast.makeText(CustomerJoinActivity.this, "회원가입에 성공하셨습니다.", Toast.LENGTH_SHORT).show();

                            } else {
                                mDialog.dismiss();
                                Toast.makeText(CustomerJoinActivity.this, "이미 존재하는 아이디 입니다.", Toast.LENGTH_SHORT).show();
                                return;  //해당 메소드 진행을 멈추고 빠져나감.

                            }

                        }
                    });

                    //비밀번호 오류시
                } else {

                    Toast.makeText(CustomerJoinActivity.this, "비밀번호가 틀렸습니다. 다시 입력해 주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(CustomerJoinActivity.this, MainActivity.class);
                startActivity(intent); //액티비티 이해주는 구문
            }
        });

    }
      /*  ActionBar actionBar=getSupportActionBar(); //제목줄 객체 얻어오기
            actionBar.setTitle("회원가입"); //액션바 제목
           actionBar.setDisplayHomeAsUpEnabled(true);// 액션바 뒤로가기 보여주기 위함

       */

    //female_customer=(RadioButton)findViewById(R.id.femalebutton2);
    //male_customer=(RadioButton)findViewById(R.id.malebutton2);

    //phonenumber_customer=(EditText)findViewById(R.id.PhoneNumber2);
    //password_customer=(EditText)findViewById(R.id.PassWord2);
    //nickname_customer=(EditText)findViewById(R.id.NickName2);

}



