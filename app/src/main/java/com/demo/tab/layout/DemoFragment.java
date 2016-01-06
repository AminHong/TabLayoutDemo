package com.demo.tab.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.tab.layout.object.ItemObj;

import java.util.ArrayList;

public class DemoFragment extends Fragment{

    private int position;

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        position = args.getInt("position");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("NANA");
        itemObj.setImageUrl("http://kpopn.com/wp-content/uploads/2015/12/20151227-nana.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("TZUYU");
        itemObj.setImageUrl("http://static.ettoday.net/images/1510/d1510430.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("EMMA");
        itemObj.setImageUrl("http://www.people.com.cn/mediafile/pic/20151228/3/3722804968833000695.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("LIU");
        itemObj.setImageUrl("http://ent.news.cn/2015-12/28/128572762_14512619135451n.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("NANA");
        itemObj.setImageUrl("http://kpopn.com/wp-content/uploads/2015/12/20151227-nana.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("TZUYU");
        itemObj.setImageUrl("http://static.ettoday.net/images/1510/d1510430.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("EMMA");
        itemObj.setImageUrl("http://www.people.com.cn/mediafile/pic/20151228/3/3722804968833000695.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("LIU");
        itemObj.setImageUrl("http://ent.news.cn/2015-12/28/128572762_14512619135451n.jpg");
        arrayList.add(itemObj);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getActivity());
        recyclerView.setAdapter(recyclerAdapter);

        //StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerAdapter.notifyDataSetChanged();

        return view;
    }
}
