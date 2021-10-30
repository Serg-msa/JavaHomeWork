package com.pb.dn280186msa.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static String UP (String userText) {

        String userTextUp = "";

        String[] arrayUserText = userText.split("\\s+");

        for (int i = 0; i < arrayUserText.length; i++) {
            if (i == 0)
            {
                userTextUp = userTextUp + arrayUserText[i].substring(0, 1).toUpperCase() + arrayUserText[i].substring(1, arrayUserText[i].length());
            }
            else
            {
                userTextUp = userTextUp + " " + arrayUserText[i].substring(0, 1).toUpperCase() + arrayUserText[i].substring(1, arrayUserText[i].length());
            }
        }
        return userTextUp;
    }


    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        String userText;

        System.out.println("Введите текст");
        userText = scan.nextLine();

        String result = UP(userText);
        System.out.println(result);

    }
}



