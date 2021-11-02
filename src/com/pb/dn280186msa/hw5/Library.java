package com.pb.dn280186msa.hw5;

public class Library {
    public static void main(String[] args) {

        Reader reader = new Reader();
        Book book = new Book();

        Book[] booksArray = new Book[4];
        Reader[] readersArray = new Reader[4];

        booksArray[0] = new Book();

        System.out.println(booksArray[0]);

        /*
        reader.takeBook(3);
        reader.takeBook("Приключения","Словарь","Энциклопедия");
*/
    }
}
