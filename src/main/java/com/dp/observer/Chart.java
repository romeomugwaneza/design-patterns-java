package com.dp.observer;

public class Chart implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Chat got updated. New value: " + value);
    }
}
