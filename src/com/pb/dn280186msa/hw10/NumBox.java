package com.pb.dn280186msa.hw10;

public class NumBox <T extends Number> {

    private final T[] numerics;

    public NumBox(int size) {
        numerics = (T[]) new Number[size];
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
                sum += x.intValue();
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
                sum += x.intValue();
            }
            else break;
        }
        System.out.println(sum);
    }

    public void max() {
        int s = 0;
        for (T x: numerics) {
            if (x != null) {
                if (s < x.intValue()) {
                    s = x.intValue();
                }
            }
            else break;
        }
        System.out.println(s);
    }

    public void println() {
          for (T x: numerics) System.out.println(x.intValue());
    }
}

