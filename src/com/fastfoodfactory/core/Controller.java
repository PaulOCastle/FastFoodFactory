package com.fastfoodfactory.core;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class: Controller
 * ----------------------------------------
 * Author: Pau Ferrer
 * ----------------------------------------
 * Created: 24/02/2021
 */
abstract public class Controller implements Initializable {

    @FXML
    public BorderPane mainBody;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void renderView(String view) {
        mainBody.setCenter(getView(view));
        System.out.println(getView(view));
    }

    private Parent getView(String view) {
        Parent root = null;
        try {
            root = FXMLLoader.load(Controller.class.getResource("../resources/views/" + view + ".fxml"));
        } catch (IOException e) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return root;
    }
}
