package com.bawei.huwanjun.mvp;

import android.view.View;

import com.bawei.huwanjun.contract.Icpntract;

import java.lang.ref.WeakReference;

/**
 * author: 斛万珺
 * data: 2019/11/27 09:9:48
 * function:
 */
public class Presenter<V> {
    WeakReference weakReference;
    public void onAttach(){

        WeakReference weakReference;
    }

    public void onDetach(){

        if (weakReference!=null){

            weakReference.clear();
            weakReference=null;
        }
    }

}
