//하단바 2번 클릭시 보이는 화면 (홈)
package com.example.zeroforearth;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment {

    private ImageView proudct1,prouduct2,product3,marketing; // 매물사진 3개(proudct명으로 시작), 광고판(marketing)
    private TextView proudcttext1,prouducttext2,producttext3; // 매물 정보 텍스트뷰
    private ImageButton smile1,smile2,smile3; //스마일 버튼


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2,container, false);

        /*//툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" "); // 툴바제목설정*/

        ImageView product1 = (ImageView)view.findViewById(R.id.product1);
        ImageView product2 = (ImageView)view.findViewById(R.id.product2);
        ImageView product3 = (ImageView)view.findViewById(R.id.product3);
        ImageView marketing = (ImageView)view.findViewById(R.id.marketing);
        TextView producttext1 = (TextView)view.findViewById(R.id.producttext1);
        TextView producttext2 = (TextView)view.findViewById(R.id.producttext2);
        TextView producttext3 = (TextView)view.findViewById(R.id.producttext3);
        ImageButton smile1 = (ImageButton)view.findViewById(R.id.smile1);
        ImageButton smile2 = (ImageButton)view.findViewById(R.id.smile2);
        ImageButton smile3 = (ImageButton)view.findViewById(R.id.smile3);

        return view;
    }
}