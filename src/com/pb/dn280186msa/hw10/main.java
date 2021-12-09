package com.pb.dn280186msa.hw10;

public class main {
    public static void main(String[] args) {
        NumBox<Number> NumberBox = new NumBox<>(4);

        NumberBox.add(0, 10);
        NumberBox.add(1, 50);
        NumberBox.add(2, 120);


        NumberBox.length();
        NumberBox.average();
        NumberBox.sum();
        NumberBox.max();
        NumberBox.println();

    }
}
