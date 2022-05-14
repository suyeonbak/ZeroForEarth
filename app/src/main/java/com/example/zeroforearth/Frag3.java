//하단바 3번 클릭시 보이는 화면 (마이페이지)
// < 기능 > : ImageView picture 을 클릭할 시 카메라 갤러리로 이동하여 사진 선택 가능하게 하기
// < 기능 > : TextView name 에는 파이어 베이스에 등록 되어있는 고객 혹은 보스 이름 혹은 닉네임이 나올 수 있도록 하기

package com.example.zeroforearth;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class Frag3 extends Fragment {

    private View v;
    private ImageView picture; // 개인사진 등록
    private TextView text; // '님'
    private TextView name; // 고객 혹은 보스 이름
    private Button myInfo; // 내정보 버튼
    private Button wishList; // 찜 목록 버튼
    private Button upLoad; // BOSS 상품등록
    private Button upLoadCheck; // BOSS 내가 올린 매물

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag3,container, false);

        /*//툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" "); // 툴바제목설정*/

        //변수 선언
        picture = (ImageView)v.findViewById(R.id.picture);
        text = (TextView) v.findViewById(R.id.text);
        name = (TextView) v.findViewById(R.id.name);
        myInfo=(Button) v.findViewById(R.id.myInfo);
        wishList=(Button) v.findViewById(R.id.wishList);
        upLoad = (Button) v.findViewById(R.id.upLoad);
        upLoadCheck=(Button) v.findViewById(R.id.upLoadCheck);


        //화면전환 (Boss 상품등록버튼 -> ProductUpload)
        upLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ProductUpload.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);//액티비티 이해주는 구문

            }


        });

        //화면전환 (내 정보 -> MypageInfo)
        wishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Wishlist.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);//액티비티 이해주는 구문

            }


        });

        //화면전환 (내 정보 -> MypageInfo)
        myInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MypageInfo.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);//액티비티 이해주는 구문

            }


        });

        //화면전환 (BOSS 내가 올린 매물 -> Management)
        upLoadCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Management.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);//액티비티 이해주는 구문

            }


        });

        return v;




    }
}