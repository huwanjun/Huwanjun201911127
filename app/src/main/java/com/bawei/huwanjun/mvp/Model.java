package com.bawei.huwanjun.mvp;

/**
 * author: 斛万珺
 * data: 2019/11/27 09:9:39
 * function:
 */
public interface Model {
    interface Success{
        void onSuccess(String json);
        void onError(String json);

    }

    interface errror{
        void onSuccess(String json);
        void onError(String json);

    }


}
