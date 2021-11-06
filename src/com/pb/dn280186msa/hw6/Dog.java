package com.pb.dn280186msa.hw6;

import java.util.Objects;

public class Dog  extends Animal {
    boolean tail;
    boolean security;

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public Dog(String name, String food, String location, boolean tail, boolean security) {
        super(name, food, location);
        this.tail = tail;
        this.security = security;
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " говорит Гав");
    }

}
