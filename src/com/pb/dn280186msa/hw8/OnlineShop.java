package com.pb.dn280186msa.hw8;

public class OnlineShop {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Auth auth = new Auth();

        try {
            auth.signUp();
            }
        catch (WrongLoginException e1) {
        System.out.println("Логин должен быть длинее 5 и короче 20 символов, " +
        "а также должен содержать только латинские буквы или цифры");
                }
        catch (WrongPasswordException e2) {
            System.out.println("Пароль должен быть длинее 5 символов, " +
                    "а также должен содержать только латинские буквы или цифры");
        }
        try {
            auth.signIn();
        }
        catch (WrongLoginException e1) {
            System.out.println("Логин или пароль не верный");
        }

    }
}
