package com.pb.dn280186msa.hw2;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int operand1, operand2;
        String sign;

        System.out.println("Введите число №1");
        operand1 = scan.nextInt();
        System.out.println("Введите число №2");
        operand2 = scan.nextInt();
        System.out.println("Введите действие (+,-,*,/)");
        sign = scan.next();

        switch (sign) {
            case "/":
                if (operand2 == 0) {
                    System.out.print("Ошибка - деление на ноль");
                }
                else {
                    System.out.println("Число №1 = " + operand1 + "; " +
                                       "Число №2 = " + operand2 + "; " +
                                       "Действие = " + sign);
                    System.out.println("Результат выполнения арифметической операции = " + ((double)operand1 / operand2));
                }
                break;
           case "+":
               System.out.println("Число №1 = " + operand1 + "; " +
                       "Число №2 = " + operand2 + "; " +
                       "Действие = " + sign);
               System.out.println("Результат выполнения арифметической операции = " + ((double)operand1 + operand2));
                break;
            case "-":
                System.out.println("Число №1 = " + operand1 + "; " +
                        "Число №2 = " + operand2 + "; " +
                        "Действие = " + sign);
                System.out.println("Результат выполнения арифметической операции = " + ((double)operand1 - operand2));
                break;
            case "*":
                System.out.println("Число №1 = " + operand1 + "; " +
                        "Число №2 = " + operand2 + "; " +
                        "Действие = " + sign);
                System.out.println("Результат выполнения арифметической операции = " + ((double)operand1 * operand2));
                break;
            default:
                System.out.println("Попробуйте еще раз");
        }

    }
}
