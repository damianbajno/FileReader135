package com.epam.component;

import javafx.scene.control.TextArea;

/**
 * Created by damian on 15.03.16.
 */
public class OutPutTextArea {
    private  TextArea fileTextArea;

    public OutPutTextArea() {
        this.fileTextArea =new TextArea();
        setDefault();
    }

    private void setDefault(){
        fileTextArea.setPrefRowCount(20);
        fileTextArea.setPrefColumnCount(20);
    }

    public void appendText(String text){
        fileTextArea.appendText(text);
    }


    public TextArea getFileTextArea() {
        return fileTextArea;
    }
}
