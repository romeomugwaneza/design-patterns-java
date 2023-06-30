package com.dp.observer.pull;

public class Spreadsheet implements Observer {
    private DataSource dataSource;

    public Spreadsheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got notified. New value: " + dataSource.getValue());
    }
}
