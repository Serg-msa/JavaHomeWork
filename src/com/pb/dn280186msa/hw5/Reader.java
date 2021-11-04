package com.pb.dn280186msa.hw5;

import com.pb.dn280186msa.hw3.Array;

import java.util.Arrays;

public class Reader {
    Book[] booksArray = new Book[3];

    String fio;
    int nom;
    String fakul;
    String dat;
    int tel;

    public Reader(String fio, int nom, String fakul, String dat, int tel) {
        this.fio = fio;
        this.nom = nom;
        this.fakul = fakul;
        this.dat = dat;
        this.tel = tel;
    }



        public void takeBook (int kol) {
            System.out.println("Петров В. В. взял " + kol + " книги");
        }

        String takegg = "";
        public void takeBook (String... books) {
                    for (String book: books) {
                        takegg += book + "; ";
            }
            System.out.println("Петров В. В. взял книги " + takegg);
        }

    String takeggg = "";
    public void takeBook (Book... books) {
        for (Book book: books)    {
            takeggg += book.getInfo() + "; ";
            }
        System.out.println("Петров В. В. взял книги " + takeggg);
    }


    public void returnBook (int kol) {
        System.out.println("Сидоров В. В. вернул " + kol + " книги");
    }

    String returgg = "";
    public void returnBook (String... books) {
        for (String book: books) {
            returgg += book + "; ";
        }
        System.out.println("Сидоров В. В. вернул книги " + returgg);
    }

    String returggg = "";
    public void returnBook (Book... books) {
        for (Book book: books)    {
            returggg += book.getInfo() + "; ";
        }
        System.out.println("Сидоров В. В. вернул книги " + returggg);
    }



    String getInfo() {
        return "ФИО: " + fio + ", Номер читательского билета: " + nom
                + ", факультет: " + fakul + ", дата рождения" + dat + ", телефон" + tel;
    }

}
