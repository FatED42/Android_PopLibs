package com.example.android_poplibs.retrofit;

import moxy.MvpView;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface RetrofitView extends MvpView {

    @StateStrategyType(value = SkipStrategy.class)
    void showPhoto(String avatarUrl);

}
