package com.sayilir.coder;

public class Vowels {
    public void vowelsRun() {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf");
                break;
            default:
                System.out.println("Ince sesli harf");
        }
    }
}
