package com.pb.dn280186msa.hw6;

public class VetСlinic {
    public static void main(String[] args) {

        Cat[] cat = new Cat[2];
        Dog[] dog = new Dog[2];
        Horse[] horses = new Horse[2];
        Animal[] animals = new Animal[2];

        cat[0] = new Cat("Барсик1", "Кошачий корм", "Дом", false, true);
        cat[1] = new Cat("Барсик2", "Кошачий корм", "Дом", true, true);

        dog[0] = new Dog("Шрам1", "Мясо", "Двор", false, true);
        dog[1] = new Dog("Шрам2", "Мясо", "Двор",true, true);

        horses[0] = new Horse("Молния1", "Сено", "Ферма", false, true);
        horses[1] = new Horse("Молния2", "Сено", "Ферма",true, true);

        cat[0].sleep();
        dog[0].eat();
        horses[1].makeNoise();




    }
}
