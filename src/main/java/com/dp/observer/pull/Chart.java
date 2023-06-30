package com.dp.observer.pull;

public class Chart implements Observer {
    DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chat got updated. New value: " + dataSource.getValue());
    }
}
