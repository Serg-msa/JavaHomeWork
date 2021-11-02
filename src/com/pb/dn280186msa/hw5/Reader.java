package com.pb.dn280186msa.hw5;

public class Reader {
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

    String gg = "";
    public void takeBook (String... books) {
                for (String book: books) {
               gg += book + "; ";
        }
        System.out.println("Петров В. В. взял книги " + gg);
    }

    String getInfo() {
        return "ФИО: " + fio + ", Номер читательского билета: " + nom
                + ", факультет: " + fakul + ", дата рождения" + dat + ", телефон" + tel;
    }

}
