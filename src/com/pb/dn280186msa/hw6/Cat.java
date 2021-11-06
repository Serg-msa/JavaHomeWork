package com.pb.dn280186msa.hw6;

import java.util.Objects;

public class Cat extends Animal {
    boolean wool;
    boolean Activ;

    public boolean isWool() {
        return wool;
    }

    public void setWool(boolean wool) {
        this.wool = wool;
    }

    public boolean isActiv() {
        return Activ;
    }

    public void setActiv(boolean activ) {
        Activ = activ;
    }

    public Cat(String name, String food, String location, boolean wool, boolean activ) {
        super(name, food, location);
        this.wool = wool;
        Activ = activ;
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " говорит Мяу");
    }



}

