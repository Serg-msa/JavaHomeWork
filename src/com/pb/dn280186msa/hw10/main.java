package com.pb.dn280186msa.hw10;

public class main {
    public static void main(String[] args) {
        NumBox<Num> numBox = new NumBox<>(4);

        numBox.add(0, new Double(10));
        numBox.add(1, new Double(50));
        numBox.add(2, new Double(120));

        Double d1 = (Double) numBox.get(0);
        Double d2 = (Double) numBox.get(1);
        Double d3 = (Double) numBox.get(2);

        System.out.println(d1.getN());
        System.out.println(d2.getN());
        System.out.println(d3.getN());

        numBox.length();
        numBox.average();
        numBox.sum();
        numBox.max();

    }
}
