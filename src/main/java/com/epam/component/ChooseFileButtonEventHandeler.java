package com.epam.component;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by damian on 15.03.16.
 */
public class ChooseFileButtonEventHandeler implements EventHandler {

    private TextFileChooser textFileChooser;
    private Stage primaryStage;
    private FileTextReader fileTextReader;

    public ChooseFileButtonEventHandeler(OutPutTextArea textArea, Stage primarystage) {
        this.primaryStage = primarystage;

        this.fileTextReader = new FileTextReader(textArea);
        this.textFileChooser = new TextFileChooser();
    }

    public void handle(Event event) {
        File file = textFileChooser.showOpenDialog(primaryStage);
        if (file != null) {
            fileTextReader.read(file);
        }

    }
}
