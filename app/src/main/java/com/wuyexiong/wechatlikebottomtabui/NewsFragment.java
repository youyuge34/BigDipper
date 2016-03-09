package com.wuyexiong.wechatlikebottomtabui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by renjunfan on 16/3/7.
 */
public class NewsFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View testView = inflater.inflate(R.layout.news_layout,container,false);
        TextView testText = (TextView)testView.findViewById(R.id.test);
        testText.setText("(づ￣ 3￣)づ 么么哒");
        return testView;
    }
}
