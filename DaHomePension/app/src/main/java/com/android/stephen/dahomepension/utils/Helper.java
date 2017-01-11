package com.android.stephen.dahomepension.utils;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.android.stephen.dahomepension.R;

/**
 * Created by Stephen Uy on 1/11/2017.
 */

public class Helper {
    public static void addFragment(AppCompatActivity activity, Fragment fragment, @IdRes int id, String tag){
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(id, fragment, tag)
                .addToBackStack(tag)
                .commit();
    }

    public static void replaceFragment(AppCompatActivity activity, Fragment fragment, @IdRes int id, String tag){
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(id, fragment, tag)
                .addToBackStack(tag)
                .commit();
    }
}
