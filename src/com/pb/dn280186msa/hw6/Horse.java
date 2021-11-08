package com.pb.dn280186msa.hw6;

import java.util.Objects;

public class Horse extends Animal {
    boolean sport;
    boolean pony;

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public boolean isPony() {
        return pony;
    }

    public void setPony(boolean pony) {
        this.pony = pony;
    }

    public Horse(String name, String food, String location, boolean sport, boolean pony) {
        super(name, food, location);
        this.sport = sport;
        this.pony = pony;
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + food);
    }


    @Override
    public void makeNoise() {
        System.out.println(name + " говорит Иго-го");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", sport=" + sport +
                ", pony=" + pony +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return sport == horse.sport && pony == horse.pony;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sport, pony);
    }
}
