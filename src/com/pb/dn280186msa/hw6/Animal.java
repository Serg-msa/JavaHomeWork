package com.pb.dn280186msa.hw6;

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

    public void sleep(){
      System.out.println(name + " cпит");
    }

    public void eat(){
        System.out.println(name + " кушает");
    }

    public void makeNoise(){
        System.out.println(name);
    }
}



    /*

        Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
        Пусть этот метод печатает на экран food и location пришедшего на прием животного.
        Объект класса Veterinarian создайте с помощью рефлексии.

        Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
        В цикле отправляйте животных на прием к ветеринару.


*/