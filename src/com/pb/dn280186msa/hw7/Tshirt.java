package com.pb.dn280186msa.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt(Size size, int price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWomen() {
    }

    @Override
    public String toString() {
        return "Футболка " + name + " по цене " + price + ", цвет - " + color + ", размер - " + size;
    }
}


