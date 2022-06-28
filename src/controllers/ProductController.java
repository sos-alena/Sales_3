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

        double pay = model.pay();
        String pays = roundUp(pay);

        double tax = model.tax(pay);
        String taxes = roundUp(tax);

        double getIncome = model.pay(tax, pay);
        String getIncomes = roundUp(getIncome);


        String output = "Name product: " + name + "\n"
                + "Total income (grn.): " + pays + "\n"
                + "Tax amount (grn.): " + taxes + "\n"
                + "Net income (grn.): " + getIncomes;

        view.getOutput(output);
    }
}

