package com.demo.tab.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        String text = "this is " + position;
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(text);

        return view;
    }
}
