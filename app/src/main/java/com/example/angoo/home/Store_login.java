package com.example.angoo.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by angoo on 2018/1/24.
 */

public class Store_login extends Fragment {
    Button btn;
    public Store_login() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    //第一次顯示區塊會呼叫的，利用LayoutInflater產生畫面元件回傳
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.store_login, container, false);
        btn = (Button) v.findViewById(R.id.store_login);
        return v;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "登入成功，轉至主頁面", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), Store_navigation.class));
            }
        });
    }
}

