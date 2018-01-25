package com.example.angoo.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Back(View v){

        finish();

    }
    public void User_login(View v){

        startActivity(new Intent(this, User_login.class));

    }
    public void Store_login(View v){
        startActivity(new Intent(this, Store_login.class));
    }
}
