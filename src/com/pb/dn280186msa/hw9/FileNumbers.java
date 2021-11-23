package com.pb.dn280186msa.hw9;

import java.io.*;
import java.util.Scanner;

public class FileNumbers {

    public void createNumbersFile   () {
        try (Writer writer = new FileWriter("numbers.txt")) {
            byte [][] numbers = new byte[10][10];

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    numbers[i][j] = (byte) (Math.random() * 99);
                    writer.write(numbers[i][j] + " ");
                }
                writer.write("\n");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void createOddNumbersFile () {
        try (Scanner scan = new Scanner(new File("numbers.txt"))) {
            Writer writer = new FileWriter("odd-numbers.txt");
            while (scan.hasNext()) {
                Scanner str = new Scanner(scan.nextLine());
                while (str.hasNext()) {
                    int i = str.nextInt();
                    if (i % 2 == 0) {i = 0;}
                    writer.write(i + " ");
                    System.out.println(i + " ");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    }







