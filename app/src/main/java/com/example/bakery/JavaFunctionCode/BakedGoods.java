package com.example.bakery.JavaFunctionCode;

import java.sql.Date;
import java.util.Calendar;

public class BakedGoods {
    private String name;
    private int availableCount;
    private double price;
    private String description;
    private Date produceTime;
    private double currentDiscount;

    public BakedGoods(String name, int availableCount, double price, String description, Date produceTime, double currentDiscount) {
        this.name = name;
        this.availableCount = availableCount;
        this.price = price;
        this.description = description;
        this.produceTime = produceTime;
        this.currentDiscount = currentDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(Date produceTime) {
        this.produceTime = produceTime;
    }

    public double getCurrentDiscount() {
        return currentDiscount;
    }

    public void setCurrentDiscount(double currentDiscount) {
        this.currentDiscount = currentDiscount;
    }
}
