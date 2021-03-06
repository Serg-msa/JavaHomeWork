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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", wool=" + wool +
                ", Activ=" + Activ +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return wool == cat.wool && Activ == cat.Activ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wool, Activ);
    }
}

