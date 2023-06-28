package com.dp.command.editor;

public class BoldCommand implements UndoableCommand{
    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.history = history;
        this.document = document;
    }

    @Override
    public void execute() {

        prevContent = document.getContent();
        document.makeBold();
        history.push(this);


    }

    @Override
    public void unExecute() {

        document.setContent(prevContent);

    }
}
