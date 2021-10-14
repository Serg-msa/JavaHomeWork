package com.pb.dn280186msa.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int operand1;

        System.out.println("Введите число №1");
        operand1 = scan.nextInt();

        if (operand1 >= 0 && operand1 <= 14) {
        System.out.println("Число №1 входит в диапазон [0 - 14]");
        }
        if (operand1 >= 15 && operand1 <= 35) {
            System.out.println("Число №1 входит в диапазон [15 - 35]");
        }
        if (operand1 >= 36 && operand1 <= 50) {
            System.out.println("Число №1 входит в диапазон [36 - 50]");
        }
        if (operand1 >= 51 && operand1 <= 100) {
            System.out.println("Число №1 входит в диапазон [51 - 100]");
        }
        else{System.out.println("Число №1 не входит в диапазоны");}


}

}
