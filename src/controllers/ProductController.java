package controllers;

import models.Product;
import views.SalesView;

import static utils.Rounder.roundUp;

public class ProductController {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        String name = model.getName();
        double pay =(roundUp(model.pay(), 2));
        double tax = (roundUp(model.tax(pay), 2));
        double getIncome = (roundUp(model.pay(tax, pay), 2));


        String output = "Name product: " + name + "\n"
                + "Total income (grn.): " + pay + "\n"
                + "Tax amount (grn.): " + tax + "\n"
                + "Net income (grn.): " + getIncome;

        view.getOutput(output);
    }
}

