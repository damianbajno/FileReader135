package com.epam.main;

import com.epam.component.ChooseFileButtonEventHandeler;
import com.epam.component.OutPutTextArea;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Label urlLabel = new Label("URL");

        Button chooseFileButton = new Button();
        chooseFileButton.setText(" Choose File ");

        OutPutTextArea outPutTextArea = new OutPutTextArea();
        ChooseFileButtonEventHandeler buttonEventHandeler = new ChooseFileButtonEventHandeler(outPutTextArea, primaryStage);

        chooseFileButton.setOnAction(buttonEventHandeler);

        HBox urlBox = new HBox();
        urlBox.setAlignment(Pos.CENTER_RIGHT);
        urlBox.setSpacing(15D);
        urlBox.getChildren().addAll(chooseFileButton);

        BorderPane root = new BorderPane();


        root.setTop(urlBox);
        root.setCenter(outPutTextArea.getFileTextArea());

        primaryStage.setTitle("FileReader135");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
