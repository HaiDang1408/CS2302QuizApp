package com.plhd.mavenproject3;

import com.plhd.utils.MyAlert;
import com.plhd.utils.MyStage;
import com.plhd.utils.theme.DarkThemeFactory;
import com.plhd.utils.theme.DefaultThemeFactory;
import com.plhd.utils.theme.LightThemeFactory;
import com.plhd.utils.theme.Theme;
import com.plhd.utils.theme.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

import javafx.stage.Stage;


public class PrimaryController implements Initializable{
    @FXML private ComboBox<Theme> cbTheme;
    public void handleTheme(ActionEvent event){
        this.cbTheme.getSelectionModel().getSelectedItem().updateTheme();
//        switch (this.cbTheme.getSelectionModel().getSelectedItem()){
//            case DARK:
//                ThemeManager.setThemeFactory(new DarkThemeFactory());
////                this.cbTheme.getScene().getRoot().getStylesheets().clear();
////                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
//                break;
//            case LIGHT:
//                ThemeManager.setThemeFactory(new LightThemeFactory());
////                this.cbTheme.getScene().getRoot().getStylesheets().clear();
////                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
//                break;
//            case DEFAULT:
//                ThemeManager.setThemeFactory(new DefaultThemeFactory());
////                this.cbTheme.getScene().getRoot().getStylesheets().clear();
////                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("style.css").toExternalForm());
//                break;
//        }
        ThemeManager.applyTheme(this.cbTheme.getScene());
    }
    public void handleQuestionManagement(ActionEvent event) throws IOException{
        MyStage.getInstance().showStage("question.fxml");
        //MyAlert.getInstance().showMassage("QuestionManagement: Coming soon...");
//        Scene scene = new Scene(new FXMLLoader(App.class.getResource("question.fxml")).load());
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Quiz App");
//        stage.show();
    }
    public void handlePratice(ActionEvent event){
        MyAlert.getInstance().showMassage("Practice: Coming soon...");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbTheme.setItems(FXCollections.observableArrayList(Theme.values()));
    }
}