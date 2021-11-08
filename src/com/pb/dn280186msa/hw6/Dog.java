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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", tail=" + tail +
                ", security=" + security +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return tail == dog.tail && security == dog.security;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tail, security);
    }
}
