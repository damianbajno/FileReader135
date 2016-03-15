package com.epam.main;

import com.epam.component.FileTextArea;
import com.epam.component.TextFile;
import com.epam.component.UrlPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    final static TextFile textFile=new TextFile();

    @Override
    public void start(Stage primaryStage) throws Exception {

        UrlPane urlPane=new UrlPane(primaryStage);
        HBox urlBox = urlPane.getUrlBox();

        BorderPane root=new BorderPane();

        FileTextArea fileTextArea=new FileTextArea();

        root.setTop(urlBox);
        root.setCenter(fileTextArea.getFileTextArea());

        primaryStage.setTitle("FileReader135");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
