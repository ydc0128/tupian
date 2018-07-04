package com.example.administrator.pingjia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2018/7/4.
 */

public class MainActivity extends Activity {
    private ImageView rv_photo_pic;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_photo_pic=(ImageView)findViewById(R.id.rv_photo_pic);
        rv_photo_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PickOrTakeImageActivity.class);
                startActivity(intent);
            }
        });

    }

}
