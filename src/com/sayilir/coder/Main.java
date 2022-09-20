package com.sayilir.coder;

import com.sayilir.coder.classTraining.Product;
import com.sayilir.coder.classTraining.ProductManager;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ReCapDemo2 reCapDemo2 = new ReCapDemo2();
        reCapDemo2.runReCapDemo2();

        WonderNumber wonderNumber = new WonderNumber();
        wonderNumber.wonderNumberrun();

        MultiDimensionalArray multiDimensionalArray = new MultiDimensionalArray();
        multiDimensionalArray.multiDimensionalArrayrun();
        ArraysTrain arraysTrain = new ArraysTrain();
        arraysTrain.runArraysTrain();
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.primeNumbersrun();


        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
