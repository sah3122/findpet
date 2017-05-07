package com.ks.hihi.haha.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.ks.hihi.haha.R;
import com.ks.hihi.haha.items.BaseObj;
import com.ks.hihi.haha.main.GlobalApplication;
import com.ks.hihi.haha.utill.Config;
import com.tsengvn.typekit.TypekitContextWrapper;

/**
 * Created by jo on 2017-05-06.
 */

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    private Context context;
    private BaseObj item;
    private NetworkImageView nivImage;
    private ImageButton btnBack;

    private ImageLoader imageLoader = GlobalApplication.getGlobalApplicationContext().getImageLoader();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        context = getApplicationContext();

        item = (BaseObj) getIntent().getSerializableExtra("ITEM");

        btnBack = (ImageButton) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);

        nivImage = (NetworkImageView) findViewById(R.id.niv_image);
        nivImage.setDefaultImageResId(R.drawable.img_default);
        nivImage.setErrorImageResId(R.drawable.img_default);
        String imgUrl = Config.IMG_BASE_RUL + "/images/find/" + item.getImg_std();
        nivImage.setImageUrl(imgUrl, imageLoader);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btnBack.getId()){
            this.finish();
        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
}
