package com.bawei.huwanjun.contract;

/**
 * author: 斛万珺
 * data: 2019/11/27 09:9:10
 * function:
 */
public interface Icpntract {
    //契约类定义接口

    interface Model{
        void onSuccess(String json);
        void onError(String json);
    }

    interface View{
        void onSuccess(String json);
        void onError(String json);
    }
    interface Presenter{
        void onSuccess(String json);
        void onError(String json);
    }

}
