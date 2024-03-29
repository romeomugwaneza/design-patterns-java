package com.dp.observer.push;

public class DataSource extends Subject{
    private int value;

    public DataSource(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }
}
