package com.bawei.huwanjun.base;

import com.bawei.huwanjun.util.NetUtil;
import com.bawei.huwanjun.contract.Icpntract;

/**
 * author: 斛万珺
 * data: 2019/11/27 10:10:08
 * function:
 */
public class BaseMvpActivity implements Icpntract.Presenter {
        @Override
    public void onSuccess(String json) {
        NetUtil.getData(json);
    }

    @Override
    public void onError(String json) {
        NetUtil.getData(json);


    }
}
