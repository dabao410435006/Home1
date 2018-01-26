package com.example.angoo.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by angoo on 2018/1/24.
 */

public class Store_login extends Fragment {

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

        return inflater.inflate(R.layout.store_login, container, false);
    }

}

