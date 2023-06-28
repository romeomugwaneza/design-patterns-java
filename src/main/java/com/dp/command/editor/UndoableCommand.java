package com.dp.command.editor;

public interface UndoableCommand extends Command{
    void unExecute();
}
