package com.example.angoo.home;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class User_register extends AppCompatActivity {

    private TextView date;
    private int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.user_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        date = (TextView) findViewById(R.id.user_date);

    }
    public void date(View v){
        showDatePickerDialog();
    }

    public void showDatePickerDialog() {
        // 設定初始日期
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        // 跳出日期選擇器
        DatePickerDialog dpd = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        // 完成選擇，顯示日期
                        date.setText(year + "-" + (monthOfYear + 1) + "-"
                                + dayOfMonth);

                    }
                }, mYear, mMonth, mDay);
        dpd.show();
    }

    public void Success(View v){
        Toast.makeText(this,"註冊成功，轉至主頁面",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, Navigation.class));
    }
}
