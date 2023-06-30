package com.dp.observer.pull;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource(10);
        var sheet1 = new Spreadsheet(dataSource);
        var sheet2 = new Spreadsheet(dataSource);
        var chart1 = new Chart(dataSource);
        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart1);
        dataSource.setValue(20);

    }
}
