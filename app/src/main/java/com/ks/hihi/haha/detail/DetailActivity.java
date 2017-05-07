package com.ks.hihi.haha.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ks.hihi.haha.R;

/**
 * Created by jo on 2017-05-06.
 */

public class DetailActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        context = getApplicationContext();



    }
}
