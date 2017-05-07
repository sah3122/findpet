package com.ks.hihi.haha.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.ks.hihi.haha.R;
import com.ks.hihi.haha.map.MapActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout llFindInMap = null;
    private LinearLayout llFindInList = null;
    private LinearLayout llFindRegist = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llFindInMap = (LinearLayout) findViewById(R.id.ll_find_map);
        llFindInMap.setOnClickListener(this);

        llFindInList = (LinearLayout) findViewById(R.id.ll_find_list);
        llFindInList.setOnClickListener(this);

        llFindRegist = (LinearLayout) findViewById(R.id.ll_find_regist);
        llFindRegist.setOnClickListener(this);


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == llFindInMap.getId()){
            startActivity(new Intent(this, MapActivity.class));
        } else if(v.getId() == llFindInList.getId()){

        }
    }
}
