package com.bohe.translucentbar_demo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends BaseActivty {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(mToolbar);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout_main);
        mTabLayout.addTab(mTabLayout.newTab().setText("tab4"));
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_main);
        mToggle = new ActionBarDrawerToggle(
                this,
                mDrawerLayout,
                mToolbar,
                R.string.app_name,
                R.string.app_name) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mToggle.syncState();
        mDrawerLayout.addDrawerListener(mToggle);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDrawerLayout.removeDrawerListener(mToggle);
    }


}
