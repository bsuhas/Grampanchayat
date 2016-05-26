package com.grampanchayat.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by SUHAS on 26/05/2016.
 */
public class Utils {

    public static void hideSoftKeyboard(View view, Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public static boolean hasICS()
    {
        return Build.VERSION.SDK_INT>=Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    }
    public static boolean hasJellyBean()
    {
        return Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN;
    }
    public static boolean hasJellyBeanMR1()
    {
        return Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR1;
    }
    public static boolean hasJellyBeanMR2()
    {
        return Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2;
    }
    public static boolean hasKitKat()
    {
        return Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT;
    }
    public static boolean hasLollipop()
    {
        return Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP;
    }
}
