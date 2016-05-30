package com.grampanchayat.activity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.grampanchayat.R;
import com.grampanchayat.fragment.Form8EntryFragment;
import com.grampanchayat.fragment.NotificationFragment;
import com.grampanchayat.utils.UserPreferences;
import com.grampanchayat.utils.Utils;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Context mContext;
    private SystemBarTintManager mTintManager;
    private TextView mTxtProfileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mContext = this;
        init();

        Bundle bundle = new Bundle();
        setFragment(new NotificationFragment(), bundle);
        setTitle(R.string.notification);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
    }

    void init() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        int colorCode = ContextCompat.getColor(mContext, R.color.colorPrimary);
        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
            bar.setDisplayShowHomeEnabled(true);

            bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#" + Integer.toHexString(colorCode))));
            setTitle(R.string.notification);
        }
        applyKitKatTranslucency(Color.parseColor("#" + Integer.toHexString(colorCode)));
        initDrawer(toolbar);
    }

    public void applyKitKatTranslucency(int color) {
        if (Utils.hasKitKat()) {
            if (mTintManager == null)
                mTintManager = new SystemBarTintManager(this);
            mTintManager.setStatusBarTintEnabled(true);
            mTintManager.setStatusBarTintColor(color);

        }
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(color));
    }

    void initDrawer(Toolbar toolbar) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View view = navigationView.getHeaderView(0);
        mTxtProfileName = (TextView) view.findViewById(R.id.txt_profile_name);
        mTxtProfileName.setText(UserPreferences.getInstance(mContext).getUserName());
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_notification:
                Bundle bundle = new Bundle();
                setFragment(new NotificationFragment(), bundle);
                setTitle(R.string.notification);
                break;
            // Handle the camera action
            case R.id.nav_form8:
                Bundle bundle1 = new Bundle();
                setFragment(new Form8EntryFragment(), bundle1);
                setTitle(R.string.notification);
                break;

            case R.id.nav_form8_register:
                break;

            case R.id.nav_form9:
                break;

            case R.id.nav_tax:
                break;

            case R.id.nav_help:
                break;

            case R.id.nav_contact_us:
                break;

            case R.id.nav_sync:
                break;

            default:
                break;
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            drawer.closeDrawer(GravityCompat.START);
        }
        return true;
    }

    public void setFragment(Fragment fragment, Bundle bundle) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(fragment.getClass().getName());
        fragmentTransaction.replace(R.id.fl_container, fragment);
        fragment.setArguments(bundle);
        fragmentTransaction.commit();
    }
}

