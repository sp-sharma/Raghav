package org.example.models;

import java.util.Arrays;

public class Tshirt {
    private String itemName;
    int productCode;
    double price;
    String brand;
    String description;
    String[] availableSizes;

    // Constructor to initialize fields
    public Tshirt(String itemName, int productCode, double price, String brand, String description, String[] availableSizes) {
        this.itemName = itemName;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.availableSizes = availableSizes;
    }

    // Getters and setters


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }

    // Method to describe the T-shirt
    public void describeTShirt() {
        System.out.println("Item name: " + itemName);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + productCode);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + Arrays.toString(availableSizes));
    }
}
