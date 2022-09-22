package com.sayilir.coder.week2.methodoverloading;

public class MethodOverloading {
    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public int bol(int sayi1, int sayi2) {
        return sayi1 / sayi2; // Exception
    }

    //method overloading

    public int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public int cikar(int sayi1, int sayi2, int sayi3) {
        return sayi1 - sayi2 - sayi3;
    }

    public int carp(int sayi1, int sayi2, int sayi3) {
        return sayi1 * sayi2 * sayi3;
    }

    public int bol(int sayi1, int sayi2, int sayi3) {
        return sayi1 / sayi2 / sayi3; // Exception
    }
}
