package com.sayilir.coder;

import com.sayilir.coder.week2.inheritence.*;
import com.sayilir.coder.week2.methodoverloading.MethodOverloading;
import com.sayilir.coder.week2.polymorphism.BaseLogger;
import com.sayilir.coder.week2.polymorphism.DatabaseLogger;
import com.sayilir.coder.week2.polymorphism.EmailLogger;
import com.sayilir.coder.week2.polymorphism.FileLogger;
import com.sayilir.coder.week2.recapdemoclasses.DortIslem;

import java.lang.reflect.Member;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* ReCapDemo2 reCapDemo2 = new ReCapDemo2();
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
*/

        //week2

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager());

        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println("2 sayı toplma: " + methodOverloading.topla(1, 2));
        System.out.println("3 sayıtoplma: " + methodOverloading.topla(3, 4, 5));

        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.bestEmployee();
        customerManager.list();

        EmailLogger emailLogger = new EmailLogger();
        DatabaseLogger databaseLogger = new DatabaseLogger();
        FileLogger fileLogger = new FileLogger();
        BaseLogger baseLogger = new BaseLogger();
        emailLogger.log("Logged");
        databaseLogger.log("Logged2");
        fileLogger.log("Logged3");
        baseLogger.log("Logged4");
    }
}
