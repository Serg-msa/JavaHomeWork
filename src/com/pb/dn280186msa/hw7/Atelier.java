package com.pb.dn280186msa.hw7;

public class Atelier {

    public static void dressMan (Clothes[] clothes) {
        System.out.println("Мужска:");
        for (Clothes clothes1: clothes) {
            if (clothes1 instanceof ManClothes) {
                System.out.println(clothes1);
            }
        }
    }

    public static void dressWomen (Clothes[] clothes) {
        System.out.println("Жеская:");
        for (Clothes clothes1: clothes) {
            if (clothes1 instanceof WomenClothes) {
                System.out.println(clothes1);
            }
        }
    }

    public static void main(String[] args) {

    Tshirt tshirt = new Tshirt(Size.XXS, 250, "red", "nike");
    Pants pants =  new Pants(Size.S, 100, "green", "adidas");
    Skirt skirt = new Skirt(Size.L, 500, "black", "gucci");
    Tie tie = new Tie(Size.M, 50, "blue", "reebok");

    Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};

    dressMan(clothes);
    dressWomen(clothes);

    }



}
