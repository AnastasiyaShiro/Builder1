package com.example.builder1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable
{
    public VBox panel;
    Director direct=new Director();
    Smile smile= new Smile();
    @FXML
    protected void onHelloButtonClick()
    {
        panel.getChildren().remove(smile);
        smile=direct.construct(new GoodBuilder());
        panel.getChildren().add(smile);
    }

    @FXML
    protected void onAngrySmile()
    {
        panel.getChildren().remove(smile);
        smile=direct.construct(new AngryBuilder());
        panel.getChildren().add(smile);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        panel.getChildren().add(smile);
    }
}