package com.focus.databindingdemo.utils;

import android.util.Log;

/**
 * Created by focus on 16/9/22.
 */
public class MyStringUtils {
    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }

    public static void doSomething() {
        Log.d("tag", "click button");
    }
}
