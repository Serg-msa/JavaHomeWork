package com.pb.dn280186msa.hw6;

import java.util.Objects;

public class Animal {
    String name;
    String food;
    String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void sleep() {
        System.out.println(name + " cпит");
    }

    public void eat() {
        System.out.println(name + " кушает");
    }

    public void makeNoise() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(food, animal.food) && Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, food, location);
    }
}




