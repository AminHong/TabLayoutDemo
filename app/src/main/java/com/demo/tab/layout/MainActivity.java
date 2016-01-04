package com.demo.tab.layout;

import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImagesAdapter imagesAdapter = new ImagesAdapter(this);
        ViewPager imagesViewPager = (ViewPager) findViewById(R.id.imagesViewPager);
        imagesViewPager.setAdapter(imagesAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("應用程式和遊戲"), 0);
        tabLayout.addTab(tabLayout.newTab().setText("娛樂"), 1);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ChangeFragmentPage(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        fragmentManager = getFragmentManager();
        ChangeFragmentPage(0);

        //DemoPagerAdapter demoPagerAdapter = new DemoPagerAdapter(getFragmentManager());
        //ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        //viewPager.setAdapter(demoPagerAdapter);
        //viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout));
        //tabLayout.setupWithViewPager(viewPager);
    }

    private void ChangeFragmentPage(int position){
        DemoFragment demoFragment = new DemoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        demoFragment.setArguments(bundle);
        fragmentManager.beginTransaction()
                .replace(R.id.container, demoFragment)
                .commit();
    }
}
