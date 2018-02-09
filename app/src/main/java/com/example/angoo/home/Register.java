package com.example.angoo.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void User_register(View v){

        startActivity(new Intent(this, User_register.class));

    }
    public void Store_register(View v){
        startActivity(new Intent(this, Store_register.class));
    }

}
