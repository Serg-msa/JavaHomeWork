package com.pb.dn280186msa.hw7;

public abstract class Clothes {
    Size size;
    int price;
    String color;
    String name;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes(Size size, int price, String color, String name) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.name = name;
    }
}
