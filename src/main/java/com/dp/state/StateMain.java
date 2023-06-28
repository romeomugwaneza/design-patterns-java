package com.dp.state;

public class StateMain {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseUp();
        canvas.mouseUp();
    }
}
