package com.fastfoodfactory.app.controllers;

import com.fastfoodfactory.core.Controller;
import javafx.fxml.FXML;

/**
 * Class: DashboardController
 * ----------------------------------------
 * Author: Pau Ferrer
 * ----------------------------------------
 * Created: 24/02/2021
 */
public class DashboardController extends Controller {

    @FXML
    public void showDashboard() {
        this.renderView("dashboard/dashboard");
    }

    @FXML
    public void showOrders() {
        this.renderView("dashboard/orders");
    }

    @FXML
    public void showClients() {
        this.renderView("dashboard/clients");
    }

    @FXML
    public void showProducts() {
        this.renderView("dashboard/products");
    }

    @FXML
    public void showUsers() {
        this.renderView("dashboard/users");
    }
}
