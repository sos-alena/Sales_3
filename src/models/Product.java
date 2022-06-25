package models;

import base.Fiscal;
import base.Income;

import java.text.DecimalFormat;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;

    private static final double RATE = 0.05;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double pay() {
        return (quantity * price);
    }

    @Override
    public double pay(double tax, double sum) {
        return sum - tax;
    }

    @Override
    public double tax(double sum) {
        return sum * RATE;
    }
}
