package com.dp.momento;

import java.util.List;
//Originator
public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState(){
        return new EditorState(content);
    }
    public void restoreState(EditorState editorState){
        content = editorState.getContent();
    }
}
