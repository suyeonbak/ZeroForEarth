//상품등록(사장)
// 캘린더는 작동이 되도록 기능구현 해두었습니다.
// 최종금액 부분 자동계산 될수있도록 구현해주세요.
// 업로드 버튼 눌렀을때 파이어베이스에 저장될수 있게 해주세요.

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

import java.util.Calendar;


public class ProductUpload extends AppCompatActivity {

    EditText ProductName; //상품명 등록
    EditText ProductPrice; //금액 등록
    EditText ProductSale; //할인율 등록
    EditText ProductFinalPrice; //최종 금액 등록 (**금액에 할인율 계산한 값 자동으로 값이 나오게 해주세요 :)
    Button UpLoadButton; //업로드 버튼 (클릭시 상품이 등록되고, 데이터베이스에 저장될수있도록 해주세요!)


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

    //게시일버튼
    private DatePickerDialog datePickerDialog;
    private Button openDatePickerButton;
    //만료일버튼
    private DatePickerDialog datePickerDialog2;
    private Button finalDatePickerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_upload);

        //툴바생성(상단바)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        getSupportActionBar().setTitle(" "); // 툴바제목설정

        ProductName = (EditText)findViewById(R.id.ProductName);
        ProductPrice = (EditText)findViewById(R.id.ProductPrice);
        ProductSale = (EditText)findViewById(R.id.ProductSale);
        ProductFinalPrice = (EditText)findViewById(R.id.ProductFinalPrice);
        UpLoadButton =(Button)findViewById(R.id.UpLoadButton) ;

        //게시일
        initDatePicker();
        openDatePickerButton = findViewById(R.id.openDatePickerButton);
        openDatePickerButton.setText(getTodaysDate());

        //만료일
        inoutDatePicker();
        finalDatePickerButton = findViewById(R.id.finalDatePickerButton);
        finalDatePickerButton.setText(getTodaysDate2());

    }


    // 게시일 (날자선택옵션설정)
    private String getTodaysDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month +1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(year,month,day);
    }
    private void initDatePicker() {

        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                month = month+1;
                String date = makeDateString(year,month,day);
                openDatePickerButton.setText(date);

            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);

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

    public void openDatePicker(View view) {

        datePickerDialog.show();
    }



    // 만료일 (날자선택옵션설정)
    private String getTodaysDate2() {
        Calendar cal2 = Calendar.getInstance();
        int year2 = cal2.get(Calendar.YEAR);
        int month2 = cal2.get(Calendar.MONTH);
        month2 = month2 +1;
        int day2 = cal2.get(Calendar.DAY_OF_MONTH);
        return makeDateString(year2,month2,day2);
    }

    private void inoutDatePicker() {

        DatePickerDialog.OnDateSetListener dateSetListener2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker2, int year2, int month2, int day2) {
                month2 = month2 +1;
                String date2 = makeDateString(year2,month2,day2);
                finalDatePickerButton.setText(date2);
            }
        };
        Calendar cal2 = Calendar.getInstance();
        int year2 = cal2.get(Calendar.YEAR);
        int month2 = cal2.get(Calendar.MONTH);
        int day2 = cal2.get(Calendar.DAY_OF_MONTH);

        int style2 = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog2 = new DatePickerDialog(this, style2, dateSetListener2, year2, month2, day2);
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

    public void finalDatePicker(View view) {

        datePickerDialog2.show();
    }


}