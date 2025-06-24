/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.plhd.mavenproject3;

import com.plhd.pojo.Category;
import com.plhd.pojo.Level;
import com.plhd.services.CategoryServices;
import com.plhd.services.LevelService;
import java.net.URL;
import java.nio.channels.ConnectionPendingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionController implements Initializable {
    @FXML private VBox vboxChoice;
    @FXML private ComboBox<Category> cbCates;
    @FXML private ComboBox<Level> cbLevels;
    private static final CategoryServices cateService = new CategoryServices();
    private static final LevelService levelService = new LevelService();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            //            // B1
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //B2
//            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
//            //B3
//            Statement stm=conn.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT * FROM category");
//            
//            List<Category> cates = new ArrayList<>();
//            while (rs.next()){
////                int id = rs.getInt("id");
////                String name = rs.getString("name");
//                
//                Category c = new Category(rs.getInt("id"),rs.getString("name"));
//                cates.add(c);
//                
//                //System.out.printf("%d - %s\n",id,name);
//            }
//            //B4
//            conn.close();

            this.cbCates.setItems(FXCollections.observableList(cateService.getCates()));
            this.cbLevels.setItems(FXCollections.observableList(levelService.getLevel()));
        } catch (SQLException ex) {
            Logger.getLogger(QuestionController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
        
        
    }
    
    public void hanleMoreChoice(ActionEvent event){
        HBox h = new HBox();
        h.getStyleClass().add("Main");
        
        
        RadioButton r = new RadioButton();
        TextField txt = new TextField();
        //txt.getStyleClass().add("Input");
        
        h.getChildren().addAll(r,txt);
        this.vboxChoice.getChildren().add(h);
    }
    
}
