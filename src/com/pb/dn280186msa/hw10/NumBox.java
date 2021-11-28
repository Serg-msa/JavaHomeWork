package com.pb.dn280186msa.hw10;

public class NumBox <T extends Num> {

    private final T[] numerics;

    public NumBox(int size) {
        numerics = (T[]) new Num[size];
    }

    public void add(int index, T numeric) {
        this.numerics[index] = numeric;
    }

    public T get(int index) {
        return numerics[index];
    }

    public void length() {
        int i = 0;
        for (T x: numerics) {
            if (x != null) {
                i++;
            }
            else break;
        }
        System.out.println(i);
    }

    public void average() {
        int sum = 0;
        int i = 0;
        for (T x: numerics) {
            if (x != null) {
                sum = sum + x.n;
                i++;
            }
            else break;
        }
        System.out.println(sum / i);
    }

    public void sum() {
        int sum = 0;
        for (T x: numerics) {
            if (x != null) {
                sum = sum + x.n;
            }
            else break;
        }
        System.out.println(sum);
    }

    public void max() {
        int s = 0;
        for (T x: numerics) {
            if (x != null) {
                if (s < x.n) {
                    s = x.n;
                }
            }
            else break;
        }
        System.out.println(s);
    }

}

