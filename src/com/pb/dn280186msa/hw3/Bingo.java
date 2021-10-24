package com.pb.dn280186msa.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int Bingo_ = 0 + (int) (Math.random() * 100);
        int operand1;
        int counter = 0;

        do {counter ++;

            System.out.println("Для игры введите число от 0 до 100 или -1 для остановки");
            operand1 = scan.nextInt();

            if (operand1 == -1) {
                System.out.println("Игра окончена");
                break;
            }
            else if (operand1 > Bingo_) {
                System.out.println("Ваше число больше");
            }
            else if (operand1 < Bingo_) {
                System.out.println("Ваше число меньше");
            }
            else if (operand1 == Bingo_) {
                System.out.println("Вы угадали");
                System.out.println("Число = " + operand1);
                System.out.println("Число Bingo = " + Bingo_);
                System.out.println("Кол-во попыток = " + counter);
            }
        }
        while (operand1 != Bingo_);

    }
}
