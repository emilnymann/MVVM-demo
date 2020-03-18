package com.example.mvvm_demo.model;

import java.util.Observable;

public class Model extends Observable {
    private CharSequence text;

    public CharSequence getText() {
        return text;
    }

    public void setText(CharSequence text) {
        this.text = text;
        setChanged();
        notifyObservers();
    }
}
