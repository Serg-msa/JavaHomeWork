package com.pb.dn280186msa.hw5;

public class Library {
    public static void main(String[] args) {

        Book[] booksArray = new Book[3];
        Reader[] readersArray = new Reader[3];

        booksArray[0] = new Book("Приключение", "Иванов И. И.", 2020);
        booksArray[1] = new Book("Словарь", "Сидоров А. В.", 1980);
        booksArray[2] = new Book("Энциклопедия", "Гусев К. В.", 2010);

        readersArray[0] = new Reader("Петров В. В.", 123456, "Инж", "20.01.2001", 123546);
        readersArray[1] = new Reader("Петров В. В.", 123456, "Инж", "20.01.2001", 123546);
        readersArray[2] = new Reader("Петров В. В.", 123456, "Инж", "20.01.2001", 123546);

        readersArray[0].takeBook(3);
        readersArray[0].takeBook("Приключения","Словарь","Энциклопедия");

        for (int i = 0; i < readersArray.length; i++)
        {
        System.out.println(booksArray[i].getInfo());
        }

        for (int i = 0; i < readersArray.length; i++)
        {
            System.out.println(readersArray[i].getInfo());
        }

    }
}
