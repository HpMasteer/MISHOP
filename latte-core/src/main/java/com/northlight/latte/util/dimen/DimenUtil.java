package com.northlight.latte.util.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.northlight.latte.app.Latte;

/**
 * author : 祝天康
 * tips   :
 * date   : 2017/7/29 16:09
 */

public final class DimenUtil {

    public static int getScreenWidth(){
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.widthPixels;
    }
    public static int getScreenHeight(){
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.heightPixels;
    }
}
