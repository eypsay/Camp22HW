package com.sayilir.coder;

public class ArraysTrain {

    public void runArraysTrain() {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Sahil";
        ogrenciler[3] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {

            System.out.println(ogrenciler[1]);


        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
