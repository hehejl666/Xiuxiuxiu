package com.example.myapplication.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myapplication.App;
import com.example.myapplication.R;
import com.example.myapplication.UI.TestFragment;

import java.util.List;

/**
 * Created by 17930 on 2016/2/24.
 */
public class PageAdapter extends FragmentPagerAdapter {
    private List<Fragment>fragments;
    private String[] title;


    public PageAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
        title= App.getmContext().getResources().getStringArray(R.array.titles);
    }

    public PageAdapter(FragmentManager fm) {
        super(fm);
        fragments.add(TestFragment.newInstance());
        title= App.getmContext().getResources().getStringArray(R.array.titles);
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
