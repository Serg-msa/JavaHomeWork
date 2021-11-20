package com.pb.dn280186msa.hw8;


import java.util.Scanner;


public class Auth {

    Scanner scan = new Scanner(System.in);

    String login;
    String password;

    public void signUp() throws WrongLoginException, WrongPasswordException {
        String loginUp;
        String passwordUp;
        String confirmPassword;

        System.out.println("Необходимо пройти регистрацию, введите логин");
        loginUp = scan.nextLine();
        char[] loginUpArray = loginUp.toCharArray();
        if ((loginUpArray.length < 5 || loginUpArray.length > 20) || loginUp.matches("\\W+")) {
            throw new WrongLoginException();
        }

        System.out.println("Введите пароль");
        passwordUp = scan.nextLine();
        System.out.println("Введите повторно пароль");
        confirmPassword = scan.nextLine();

        char[] passwordUpArray = passwordUp.toCharArray();
        if (passwordUpArray.length < 5 || passwordUp.matches("\\W+")) {
            throw new WrongPasswordException();
        }
        if (passwordUp == confirmPassword) {
            System.out.println("Повтороный пароль не верный");
        } else {
            login = loginUp;
            password = passwordUp;

        }

    }

    public void signIn () throws WrongLoginException{
        String loginIn;
        String passwordIn;

        System.out.println("Для входа необходимо ввести логин и пароль");
        loginIn = scan.nextLine();
        passwordIn = scan.nextLine();

        if (loginIn == login || passwordIn == passwordIn) {
            throw new WrongLoginException();
        }
            else {System.out.println("Вход успешный");}

    }


    }
