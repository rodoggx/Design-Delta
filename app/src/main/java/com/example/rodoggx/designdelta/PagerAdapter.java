package com.example.rodoggx.designdelta;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by RodoggX on 3/24/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
        private static final int NUM_PAGES = 5;

    public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PageFragment.create(position);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
}
