package com.dp.observer;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource(10);
        var sheet1 = new Spreadsheet();
        var sheet2 = new Spreadsheet();
        var chart1 = new Chart();
        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart1);
        dataSource.setValue(20);

    }
}
