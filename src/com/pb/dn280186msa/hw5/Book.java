package com.pb.dn280186msa.hw5;

public class Book {
   String nazvanie;
   String avtor;
   int year;

    public Book(String nazvanie, String avtor, int year) {
        this.nazvanie = nazvanie;
        this.avtor = avtor;
        this.year = year;
    }

   public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    String getInfo() {
        return "Название книги: " + nazvanie + ", Автор книги: " + avtor + ", Год книги: " + year;
    }

}

