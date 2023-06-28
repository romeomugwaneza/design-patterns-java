package com.dp.command;

import com.dp.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White.");
    }
}
