package com.omrobbie.cataloguemovieuiux.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.omrobbie.cataloguemovieuiux.feature.favorite.FavoriteFragment;
import com.omrobbie.cataloguemovieuiux.feature.NowPlayingFragment;
import com.omrobbie.cataloguemovieuiux.feature.UpcomingFragment;

public class ATabPager extends FragmentPagerAdapter {

    private static final int NUM_ITEMS = 3;

    public ATabPager(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NowPlayingFragment();

            case 1:
                return new UpcomingFragment();

            case 2:
                return new FavoriteFragment();

            default:
                return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
