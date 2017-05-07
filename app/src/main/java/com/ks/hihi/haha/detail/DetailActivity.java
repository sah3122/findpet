package com.ks.hihi.haha.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.ks.hihi.haha.R;
import com.ks.hihi.haha.items.BaseObj;
import com.ks.hihi.haha.main.GlobalApplication;

/**
 * Created by jo on 2017-05-06.
 */

public class DetailActivity extends AppCompatActivity {

    private Context context;
    private BaseObj item;
    private NetworkImageView nivImage;

    private ImageLoader imageLoader = GlobalApplication.getGlobalApplicationContext().getImageLoader();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        context = getApplicationContext();

        item = (BaseObj) getIntent().getSerializableExtra("ITEM");

        nivImage = (NetworkImageView) findViewById(R.id.niv_image);
        nivImage.setDefaultImageResId(R.drawable.img_default);
        nivImage.setErrorImageResId(R.drawable.img_default);
        nivImage.setImageUrl(item.getImg_std(), imageLoader);


    }
}
