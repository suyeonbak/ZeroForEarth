//하단바 1번 클릭시 보이는 화면 (지도)
//하단바 1번 클릭시 보이는 화면 (지도)
package com.example.zeroforearth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag1 extends Fragment {

    private View v;
    private TextView myloation_textView;
    private ImageButton mylocation_imageButton;
    private ImageButton location_imageButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag1,container, false);


        //변수 선언
        myloation_textView = (TextView) v.findViewById(R.id.myloation_textView);
        mylocation_imageButton = (ImageButton) v.findViewById(R.id.mylocation_imageButton);
        location_imageButton=(ImageButton) v.findViewById(R.id.location_imageButton);

        return v;
    }
}