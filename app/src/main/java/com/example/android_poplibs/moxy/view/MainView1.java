package com.example.android_poplibs.moxy.view;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MainView1 extends MvpView {
    @StateStrategyType(value = AddToEndSingleStrategy.class)
    void setText(String text);
}
