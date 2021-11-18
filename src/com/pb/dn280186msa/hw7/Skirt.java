package com.pb.dn280186msa.hw7;

public class Skirt extends Clothes  implements WomenClothes{

    public Skirt(Size size, int price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public void dressWomen() {

    }

    @Override
    public String toString() {
        return "Юбка " + name + " по цене " + price + ", цвет - " + color + ", размер - " + size;
    }
}
