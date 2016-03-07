package com.wuyexiong.wechatlikebottomtabui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.wuyexiong.wechatlikebottomtabui.TestFragment.newInstance;

/**
 * Created by wuyexiong on 4/25/15.
 */
public class TestFragmentAdapter extends FragmentPagerAdapter {

    protected static final String[] CONTENT = new String[] { "我", "成", "功", "了", };
    private int mCount = CONTENT.length;

    public TestFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        NewsFragment testNews = new NewsFragment();
        return testNews;
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence charSequence = "这是标题！";
        return charSequence;
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
}
