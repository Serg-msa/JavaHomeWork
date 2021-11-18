package com.pb.dn280186msa.hw7;

public class Tie extends Clothes  implements ManClothes{

    public Tie(Size size, int price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public String toString() {
        return "Галстук " + name + " по цене " + price + ", цвет - " + color + ", размер - " + size;
    }
}
