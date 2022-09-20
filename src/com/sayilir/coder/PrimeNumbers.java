package com.sayilir.coder;

public class PrimeNumbers {

    public void primeNumbersrun() {
        int number = -2;
        int reminder = number % 2;

        System.out.println(reminder);
        boolean isPrime = true;

        if (number == 1) {
            System.out.println(" Asal sayıdır");
            return;
        }

        if (number < 0) {
            System.out.println("Sayı negatif olmaz");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 2) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println(" Asal sayıdır");
        } else {
            System.out.println(" Asal sayıdır Değildir");
        }
    }

}

