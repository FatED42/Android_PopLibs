package com.example.android_poplibs.moxy.presenter;


import com.example.android_poplibs.moxy.model.Model1;
import com.example.android_poplibs.moxy.view.MainView1;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MainPresenter1 extends MvpPresenter<MainView1> {
    private Model1 model1   ;

    public MainPresenter1() {
        model1 = new Model1();
    }

    public void onBtnClick(String text) {
        String text1 = model1.getText();
        String text2 = text1.concat(text);
        model1.setText(text2);
        getViewState().setText(text2);
    }
}
