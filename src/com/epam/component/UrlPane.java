package com.epam.component;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by damian on 15.03.16.
 */
public class UrlPane {
    private HBox urlBox;
    private TextFile textFile;
    private Stage primaryStage;

    public UrlPane(Stage primaryStage) {
        this.primaryStage=primaryStage;

        Label urlLabel=new Label("URL");

        TextField urlTextField=new TextField();
        urlTextField.setPrefColumnCount(20);

        TextFileChooser textFileChooser=new TextFileChooser();

        Button chooseTestFileButton=new Button();
        chooseTestFileButton.setText(" ... ");

        chooseTestFileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                File tempFile;
                if ((tempFile=textFileChooser.showOpenDialog(primaryStage))!=null) {
                    textFile.setFile(tempFile);
                }

            }
        });


        createUrlBox(urlLabel, urlTextField, chooseTestFileButton);
    }

    private void createUrlBox(Label urlLabel, TextField urlTextField, Button chooseTestFileButton) {
        urlBox=new HBox();
        urlBox.setAlignment(Pos.CENTER_LEFT);
        urlBox.setSpacing(15D);
        urlBox.getChildren().addAll(urlLabel, urlTextField, chooseTestFileButton);
    }

    public HBox getUrlBox() {
        return urlBox;
    }

    public TextFile getTextFile() {
        return textFile;
    }

}
