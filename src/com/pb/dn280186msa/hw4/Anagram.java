package com.pb.dn280186msa.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

 static String Anagram_ (String userText1, String userText2) {

  String userText1S;
  String userText2S;
  String Anagram_result;

  userText1 = userText1.replaceAll("\\W", "");
  userText1 = userText1.toLowerCase();
  userText2 = userText2.replaceAll("\\W", "");
  userText2 = userText2.toLowerCase();

  char[] userTextArrays1 = userText1.toCharArray();
  char[] userTextArrays2 = userText2.toCharArray();

  Arrays.sort(userTextArrays1);
  Arrays.sort(userTextArrays2);

  userText1S = new String(userTextArrays1);
  userText2S = new String(userTextArrays2);

  if (userText1S.equalsIgnoreCase(userText2S)) {
   Anagram_result = "Анаграмма";
  } else { Anagram_result = "Не анаграмма";
     }
    return Anagram_result;
 }

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        String userText1;
        String userText2;

        System.out.println("Введите текст 1");
        userText1 = scan.nextLine();
        System.out.println("Введите текст 2");
        userText2 = scan.nextLine();

     String result = Anagram_(userText1, userText2);
     System.out.println(result);

    }
}
