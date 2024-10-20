package com.example.sequential.structure;

import java.text.DecimalFormat;

public class Challenge01 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        String product1 = "Computer";
        String product2 = "TV";
        double price1 = 2100.5;
        double price2 = 1830.0;

        String priceFormat1 = df.format(price1);
        String priceFormat2 = df.format(price2);

        int age = 30;
        int code = 5291;
        char gender = 'F';

        System.out.println("Products:");
        System.out.println("The product " + product1 + " costs R$" + priceFormat1);
        System.out.println("The product " + product2 + " costs R$" + priceFormat2);
        System.out.println();
        System.out.println("Code = " + code);
        System.out.println();
        System.out.println("Person data: gender " + gender + " and" + " age " + age);
    }

}
