package com.pb.dn280186msa.hw10;

public class main {
    public static void main(String[] args) {

        NumBox<Integer> NumberBox = new NumBox<>(4);

        NumberBox.add(0, 10);
        NumberBox.add(1, 50);
        NumberBox.add(2, 120);

        NumberBox.length();
        NumberBox.average();
        NumberBox.sum();
        NumberBox.max();
        NumberBox.println();

        NumBox<Float> FloatBox = new NumBox<>(4);

        FloatBox.add(0, 1.0f);
        FloatBox.add(1, 5.0f);
        FloatBox.add(2, 12.0f);

        FloatBox.length();
        FloatBox.average();
        FloatBox.sum();
        FloatBox.max();
        FloatBox.println();

    }
}
