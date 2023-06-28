package com.dp.command;

import com.dp.command.fx.Button;

public class CommandMain {
    public static void main(String[] args) {
        //var service = new CustomerService();
        //var command = new AddCustomerCommand(service);
        //var button = new Button(command);
        //button.click();

        var composite = new CompositeCommand();
        composite.addCommand(new ResizeCommand());
        composite.addCommand(new BlackAndWhiteCommand());
        composite.execute();

    }
}
