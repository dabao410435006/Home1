package com.example.angoo.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Store_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_login);
    }
    public void Back(View v){

        finish();

    }
    public void Success(View v){
        Toast.makeText(this,"登入成功，轉至主頁面",Toast.LENGTH_SHORT).show();
    }
}
