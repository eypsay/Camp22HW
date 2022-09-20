package com.sayilir.coder;

import java.util.Scanner;

public class WonderNumber {
    public void wonderNumberrun() {
        System.out.println("Enter a number:");
        Scanner scanNumber = new Scanner(System.in);
        int number = scanNumber.nextInt();
        int divSum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divSum = divSum + i;
            }
        }

        if (divSum == number) {
            System.out.println(" Wondernumber");
        } else {
            System.out.println("Not WonderNnmber");
        }
    }
}
