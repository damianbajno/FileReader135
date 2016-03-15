package com.epam.component;

import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;

/**
 * Created by damian on 15.03.16.
 */
public class TextFileChooser {
    FileChooser fileChooser;

    public TextFileChooser() {
        this.fileChooser=new FileChooser();
        setSettings();
    }

    private void setSettings(){
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter(".txt","*.txt"));
        fileChooser.setInitialDirectory(new File("/home/damian"));
    }

    public File showOpenDialog(Window window){
        return fileChooser.showOpenDialog(window);
    }





}
