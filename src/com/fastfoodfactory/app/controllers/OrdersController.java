package com.fastfoodfactory.app.controllers;

import com.fastfoodfactory.core.Controller;
import com.fastfoodfactory.interfaces.ControllerResources;

/**
 * Class: OrdersController
 * ----------------------------------------
 * Author: Pau Ferrer
 * ----------------------------------------
 * Created: 24/02/2021
 */
public class OrdersController extends Controller implements ControllerResources {

    @Override
    public void create() {
        this.renderModal("orders/create", "Create new order");
    }

    @Override
    public void show(int id) {
        this.renderModal("orders/show", "Show order");
    }

    @Override
    public void edit(int id) {
        this.renderModal("orders/edit", "Edit order");
    }

    @Override
    public void search() {

    }
}
