package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.Operation;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {

    }

    @Override
    public Operation getOperation() {
        return Operation.CONTENT;
    }
}
