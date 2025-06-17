package com.plhd.mavenproject3;

import com.plhd.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;


public class PrimaryController{
    public void handleQuestionManagement(ActionEvent event) throws IOException{
        
        //MyAlert.getInstance().showMassage("QuestionManagement: Coming soon...");
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("question.fxml")).load());
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }
    public void handlePratice(ActionEvent event){
        MyAlert.getInstance().showMassage("Practice: Coming soon...");
    }
}