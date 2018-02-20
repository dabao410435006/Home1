package com.example.angoo.home;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {
/*private int[] setIcons = {
            R.drawable.user_home,
            R.drawable.user_heart,

    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        MyApplication.getInstance().addActivity(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.RLpager);
        //getSupportFragmentManager()管理活動內的區塊物件
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        TabLayout tabLayout = (TabLayout) findViewById(R.id.RLtabs);
        //設定tab被點到時的顏色
        tabLayout.setTabTextColors(Color.GRAY,Color.argb(255,35,96,137));

        // 在viewpager增加區塊
        adapter.addFragment(new User_login(), "一般登入");
        adapter.addFragment(new Store_login(), "店家登入");
        viewPager.setAdapter(adapter);
        //讓tablayout與viewpager連動
        tabLayout.setupWithViewPager(viewPager);

/*for(int i =0; i < setIcons.length;i++){
            tabLayout.getTabAt(i).setIcon(setIcons[i]);


        }*/

    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();



        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override //獲取需要的view 數量
        public int getCount() {
            return mFragmentList.size();
        }
        //增加區塊
        public void addFragment(Fragment fragment, String title) {

            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);




        }

        @Override
        public CharSequence getPageTitle( int position) {

            return mFragmentTitleList.get(position);
        }
    }

}
