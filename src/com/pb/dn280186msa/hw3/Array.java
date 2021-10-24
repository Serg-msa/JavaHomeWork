package com.pb.dn280186msa.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];
        int sum_array = 0;
        int count_array = 0;

        System.out.println("Введите 10 целых чисел");

        for (int i = 0; i < 10; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
            sum_array = sum_array + array[i];
            if (array[i] > 0) {
                count_array = count_array + 1;
            }
        }

        System.out.println ("Сумма Ваших чисел равна - " + sum_array);
        System.out.println ("Кол-во Ваших положительных чисел равна - " + count_array);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }


    }
}
