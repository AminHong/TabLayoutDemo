package com.demo.tab.layout;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.demo.tab.layout.object.ItemObj;
import com.demo.tab.layout.object.ItemsLayoutObj;
import com.demo.tab.layout.view.ItemAppView;
import com.demo.tab.layout.view.ItemPlayView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter{

    public static final int TYPE_HEADER = 1;
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_ITEM = 3;

    private Context context;
    private int pageNumber = 0;
    private ArrayList<ItemsLayoutObj> items;

    public RecyclerAdapter(Context context) {
        this.context = context;
        this.items = SimpleData.getItemLayoutArrayList_1();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == TYPE_HEADER) {
            View headerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_header_view, parent, false);
            return new HeaderViewHolder(headerView, context);
        }else if(viewType == TYPE_FOOTER) {
            View footerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_footer_view, parent, false);
            return new FooterViewHolder(footerView);
        }else{
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_view, parent, false);
            return new ItemViewHolder(itemView);
        }
    }

    //1 = header view size
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(position < 1){

            HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;
            headerViewHolder.tabLayout.setScrollPosition(pageNumber, 0, true);
            headerViewHolder.tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    pageNumber = tab.getPosition();

                    items.clear();
                    if (pageNumber == 0) {
                        items = SimpleData.getItemLayoutArrayList_1();
                    } else {
                        items = SimpleData.getItemLayoutArrayList_2();
                    }

                    notifyDataSetChanged();
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {
                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {
                }
            });

            if (pageNumber == 0) {
                headerViewHolder.dataChange(SimpleData.getBannerArrayList_1());
                headerViewHolder.setViewPagerIndicator(SimpleData.getBannerArrayList_1().size(), context);
            } else {
                headerViewHolder.dataChange(SimpleData.getBannerArrayList_2());
                headerViewHolder.setViewPagerIndicator(SimpleData.getBannerArrayList_2().size(), context);
            }

        }else if(position >= 1 + items.size()){

            FooterViewHolder footerViewHolder = (FooterViewHolder) holder;

        }else {

            ItemsLayoutObj itemsLayoutObj = items.get(position - 1);
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            itemViewHolder.titleView.setText(itemsLayoutObj.getTitle());
            itemViewHolder.descriptionView.setText(itemsLayoutObj.getDescription());

            ArrayList<ItemObj> itemArrayList;
            itemViewHolder.scrollViewLayout.removeAllViews();

            if(pageNumber == 0) {
                if (itemsLayoutObj.getId() == 1) {
                    itemArrayList = SimpleData.getItemArrayList_1();
                } else if (itemsLayoutObj.getId() == 2) {
                    itemArrayList = SimpleData.getItemArrayList_2();
                } else if (itemsLayoutObj.getId() == 3) {
                    itemArrayList = SimpleData.getItemArrayList_3();
                } else if (itemsLayoutObj.getId() == 4) {
                    itemArrayList = SimpleData.getItemArrayList_4();
                } else if (itemsLayoutObj.getId() == 5) {
                    itemArrayList = SimpleData.getItemArrayList_5();
                } else if (itemsLayoutObj.getId() == 7) {
                    itemArrayList = SimpleData.getItemArrayList_7();
                } else {
                    itemArrayList = SimpleData.getItemArrayList();
                }

                for (int i = 0; i < itemArrayList.size(); i++) {
                    ItemObj itemObj = itemArrayList.get(i);
                    ItemAppView itemAppView = new ItemAppView(context);
                    itemAppView.setTitle(itemObj.getName());
                    itemAppView.setImage(itemObj.getImageUrl());
                    itemViewHolder.scrollViewLayout.addView(itemAppView);
                }
            }else{
                if (itemsLayoutObj.getId() == 11) {
                    itemArrayList = SimpleData.getItemArrayList_11();
                } else if (itemsLayoutObj.getId() == 12) {
                    itemArrayList = SimpleData.getItemArrayList_12();
                } else if (itemsLayoutObj.getId() == 13) {
                    itemArrayList = SimpleData.getItemArrayList_13();
                } else if (itemsLayoutObj.getId() == 14) {
                    itemArrayList = SimpleData.getItemArrayList_14();
                } else {
                    itemArrayList = SimpleData.getItemArrayList_15();
                }

                for (int i = 0; i < itemArrayList.size(); i++) {
                    ItemObj itemObj = itemArrayList.get(i);
                    ItemPlayView itemPlayView = new ItemPlayView(context);
                    itemPlayView.setTitle(itemObj.getName());
                    itemPlayView.setImage(itemObj.getImageUrl());
                    itemViewHolder.scrollViewLayout.addView(itemPlayView);
                }
            }

        }
    }

    //1 = header view size
    @Override
    public int getItemViewType(int position) {
        if(position < 1){
            return TYPE_HEADER;
        }else if(position >= 1 + items.size()){
            return TYPE_FOOTER;
        }
        return TYPE_ITEM;
    }

    //2 = header view size + footer view size
    @Override
    public int getItemCount() {
        return 2 + items.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView titleView;
        public TextView descriptionView;
        public HorizontalScrollView horizontalScrollView;
        public LinearLayout scrollViewLayout;

        public ItemViewHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.titleView);
            descriptionView = (TextView) itemView.findViewById(R.id.descriptionView);
            horizontalScrollView = (HorizontalScrollView) itemView.findViewById(R.id.horizontalScrollView);
            scrollViewLayout = (LinearLayout) itemView.findViewById(R.id.scrollViewLayout);

            horizontalScrollView.setHorizontalScrollBarEnabled(false);
        }
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder{
        public ImagesAdapter imagesAdapter;
        public ViewPager viewPager;
        public TabLayout tabLayout;

        private LinearLayout viewPagerIndicatorLayout;
        private ImageView[] indicatorViews;
        private int indicatorCount = 0;

        public HeaderViewHolder(View itemView, final Context context) {
            super(itemView);

            imagesAdapter = new ImagesAdapter(context, SimpleData.getBannerArrayList_1());
            viewPager = (ViewPager) itemView.findViewById(R.id.viewPager);
            viewPager.setAdapter(imagesAdapter);
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override
                public void onPageSelected(int position) {
                    selectIndicator(position, context);
                }

                @Override
                public void onPageScrollStateChanged(int state) {
                }
            });

            viewPagerIndicatorLayout = (LinearLayout) itemView.findViewById(R.id.viewPagerCountDots);

            tabLayout = (TabLayout) itemView.findViewById(R.id.tabLayout);
            tabLayout.addTab(tabLayout.newTab().setText("應用程式和遊戲"), 0);
            tabLayout.addTab(tabLayout.newTab().setText("娛樂"), 1);

            //viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout));
            //tabLayout.setupWithViewPager(viewPager);
        }

        private void dataChange(ArrayList<String> arrayList){
            viewPager.setCurrentItem(0);
            imagesAdapter.removeAll();
            imagesAdapter.addAll(arrayList);
        }

        private void setViewPagerIndicator(int count, Context context) {
            indicatorCount = count;
            indicatorViews = new ImageView[count];
            viewPagerIndicatorLayout.removeAllViews();

            for (int i = 0; i < count; i++) {
                indicatorViews[i] = new ImageView(context);
                indicatorViews[i].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.nonselecteditem_dot));

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(4, 0, 4, 0);
                viewPagerIndicatorLayout.addView(indicatorViews[i], params);
            }

            indicatorViews[0].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.selecteditem_dot));
        }

        private void selectIndicator(int position, Context context) {
            for (int i = 0; i < indicatorCount; i++) {
                indicatorViews[i].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.nonselecteditem_dot));
            }

            indicatorViews[position % indicatorCount].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.selecteditem_dot));
        }
    }

    public static class FooterViewHolder extends RecyclerView.ViewHolder{
        public FooterViewHolder(View itemView) {
            super(itemView);
        }
    }
}
