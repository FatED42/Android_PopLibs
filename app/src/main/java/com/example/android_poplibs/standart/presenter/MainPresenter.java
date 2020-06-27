package com.example.android_poplibs.standart.presenter;


import com.example.android_poplibs.standart.model.Model;
import com.example.android_poplibs.standart.view.MainView;

public class MainPresenter {
    private Model model;
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
        model = new Model();
    }

    public void onBtnClick(String text) {
        String text1 = model.getText();
        String text2 = text1.concat(text);
        model.setText(text2);
        view.setText(text2);
    }
}
