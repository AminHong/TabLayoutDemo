package com.demo.tab.layout;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

public class ImagesAdapter extends PagerAdapter {

    private Context context;
    private ArrayList<String> arrayList;

    public ImagesAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_view, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        if(arrayList.size() > 0) {
            Glide.with(context).load(arrayList.get(position % arrayList.size())).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
        }

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    public void removeAll(){
        arrayList.clear();
        notifyDataSetChanged();
    }

    public void addAll(ArrayList<String> arrayList){
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }
}
