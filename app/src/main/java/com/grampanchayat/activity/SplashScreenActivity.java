package com.grampanchayat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.grampanchayat.R;
import com.grampanchayat.utils.UserPreferences;

/**
 * Created by suhasbachewar on 24/5/16.
 */
public class SplashScreenActivity extends AppCompatActivity {
    private static final long SPLASH_DELAY = 3000;
    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        mContext = this;
        displayLandingScreen();
//        DBHelper.getInstance(this).initDB();
    }

    public void displayLandingScreen() {
        Handler handler = new Handler();
        handler.postDelayed(runnable, SplashScreenActivity.SPLASH_DELAY);
    }

    private Runnable runnable = new Runnable() {
        public void run() {
            checkUserLogin();
        }
    };

    private void checkUserLogin() {

        boolean isLoggedIn = UserPreferences.getInstance(mContext).isUserLogin();
        if (isLoggedIn) {
            Intent intent = new Intent(SplashScreenActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        } else {
            Intent loginIntent = new Intent(SplashScreenActivity.this, LoginScreenActivity.class);
            startActivity(loginIntent);
            finish();
        }
    }
}
