package com.pb.dn280186msa.hw7;

public class Pants extends Clothes  implements ManClothes, WomenClothes{

    public Pants(Size size, int price, String color, String name) {
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
        return "Штаны " + name + " по цене " + price + ", цвет - " + color + ", размер - " + size;
    }
}
