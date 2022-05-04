// 매물 수정 및 확인 창
// 캘린더는 작동이 되도록 기능구현 해두었습니다.
//삭제버튼 클릭시 실행되야하는 기능추가 해주세요.
//수정하기 버튼 클릭시 실행되야 하는 기능추가 해주세요.
//Product_Upload 처럼 최종금액 부분 자동계산 될수있도록 구현해주세요.
//Product_Upload 에 등록된 매물 정보와 동일하게 뜨도록 설정해주세요.

package com.example.zeroforearth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.Calendar;


public class ProductCheck extends AppCompatActivity {

    private Button deleteButton; // 삭제버튼
    private Button check_openDatePicker; //게시일_수정
    private Button check_finalDatePicker; //만료일_수정
    private ImageView check_ProductImage; //이미지_수정
    private EditText check_ProductPrice; //금액_수정
    private EditText check_ProductSale; // 할인가_수정
    private EditText check_ProductFinalPrice; //최종금액_수정
    private Button reviseButton; //수정버튼


    //상단바 이전버튼 클릭시 이동할경로 설정 -> 내가올린 매물 확인으로 변경하기
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{

                Intent intent = new Intent(getApplicationContext(),ProductUpload.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
    //게시일버튼
    private DatePickerDialog check_datePickerDialog;
    private Button check_openDatePickerButton;
    //만료일버튼
    private DatePickerDialog check_datePickerDialog2;
    private Button check_finalDatePickerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_check);

        //툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        getSupportActionBar().setTitle(" "); // 툴바제목설정


        deleteButton = (Button) findViewById(R.id.deleteButton);
        check_openDatePicker = (Button)findViewById(R.id.check_openDatePicker);
        check_finalDatePicker = (Button) findViewById(R.id.check_finalDatePicker);
        check_ProductImage = (ImageView) findViewById(R.id.check_ProductImage);
        check_ProductPrice =(EditText) findViewById(R.id.check_ProductPrice) ;
        check_ProductSale = (EditText) findViewById(R.id.check_ProductSale);
        check_ProductFinalPrice=(EditText)findViewById(R.id.check_ProductFinalPrice);
        reviseButton = (Button) findViewById(R.id.reviseButton);

        //게시일
        check_initDatePicker();
        check_openDatePickerButton = findViewById(R.id.check_openDatePicker);
        check_openDatePickerButton.setText(check_getTodaysDate());

        //만료일
        check_inoutDatePicker();
        check_finalDatePickerButton = findViewById(R.id.check_finalDatePicker);
        check_finalDatePickerButton.setText(check_getTodaysDate2());
    }
    // 게시일 (날자선택옵션설정)
    private String check_getTodaysDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month +1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(year,month,day);
    }
    private void check_initDatePicker() {

        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                month = month+1;
                String date = makeDateString(year,month,day);
                check_openDatePickerButton.setText(date);

            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        check_datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);

    }

    private String makeDateString(int year, int month, int day) {
        return year + "년 " + getMonthFormat(month) + "" + day + "일";
    }

    private String getMonthFormat(int month) {
        if(month == 1)
            return "1월";
        if(month == 2)
            return "2월";
        if(month == 3)
            return "3월";
        if(month == 4)
            return "4월";
        if(month == 5)
            return "5월";
        if(month == 6)
            return "6월";
        if(month == 7)
            return "7월";
        if(month == 8)
            return "8월";
        if(month == 9)
            return "9월";
        if(month == 10)
            return "10월";
        if(month == 11)
            return "11월";
        if(month == 12)
            return "12월";

        return "1월";
    }

    public void check_openDatePicker(View view) {

        check_datePickerDialog.show();
    }



    // 만료일 (날자선택옵션설정)
    private String check_getTodaysDate2() {
        Calendar cal2 = Calendar.getInstance();
        int year2 = cal2.get(Calendar.YEAR);
        int month2 = cal2.get(Calendar.MONTH);
        month2 = month2 +1;
        int day2 = cal2.get(Calendar.DAY_OF_MONTH);
        return makeDateString(year2,month2,day2);
    }

    private void check_inoutDatePicker() {

        DatePickerDialog.OnDateSetListener dateSetListener2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker2, int year2, int month2, int day2) {
                month2 = month2 +1;
                String date2 = makeDateString(year2,month2,day2);
                check_finalDatePickerButton.setText(date2);
            }
        };
        Calendar cal2 = Calendar.getInstance();
        int year2 = cal2.get(Calendar.YEAR);
        int month2 = cal2.get(Calendar.MONTH);
        int day2 = cal2.get(Calendar.DAY_OF_MONTH);

        int style2 = AlertDialog.THEME_HOLO_LIGHT;

        check_datePickerDialog2 = new DatePickerDialog(this, style2, dateSetListener2, year2, month2, day2);

    }
    private String makeDateString2(int day2, int month2, int year2) {
        return year2 + "년" + getMonthFormat2(month2) + " " + day2 + "일";
    }

    private String getMonthFormat2(int month2) {
        if(month2 == 1)
            return "1월";
        if(month2 == 2)
            return "2월";
        if(month2 == 3)
            return "3월";
        if(month2 == 4)
            return "4월";
        if(month2 == 5)
            return "5월";
        if(month2 == 6)
            return "6월";
        if(month2 == 7)
            return "7월";
        if(month2 == 8)
            return "8월";
        if(month2 == 9)
            return "9월";
        if(month2 == 10)
            return "10월";
        if(month2 == 11)
            return "11월";
        if(month2 == 12)
            return "12월";

        return "1월";
    }

    public void check_finalDatePicker(View view) {

        check_datePickerDialog2.show();
    }

    //삭제버튼 클릭시 실행되야하는 기능추가


    //수정하기 버튼 클릭시 실행되야 하는 기능추가


}