package com.demo.tab.layout.view;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.demo.tab.layout.R;

public class ItemPlayView extends LinearLayout {

    private Context context;
    private ImageView imageView;
    private TextView nameView;

    public ItemPlayView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context){
        this.context = context;
        setView();
    }

    private void setView(){
        inflate(getContext(), R.layout.item_play_layout, this);

        imageView = (ImageView) findViewById(R.id.imageView);
        nameView = (TextView) findViewById(R.id.nameView);
    }

    public void setTitle(String title){
        nameView.setText(title);
    }

    public void setImage(String url){
        Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
    }
}
