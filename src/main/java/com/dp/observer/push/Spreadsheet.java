package com.dp.observer.push;

public class Spreadsheet implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified. New value: " + value);
    }
}
