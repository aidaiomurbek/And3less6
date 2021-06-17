package com.example.and3less6.domain;

public class Math {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;

    }

    public int div(int a, int b) {
        return a / b;

    }

    public int minus(int a, int b) {
        return a - b;
    }


    public int degrate(int getNumber, int degree) {
        // getNumber = 9, degree =3 ;
        int number = getNumber;

        for (int i = 1; i < degree; i++) {
            
            getNumber = number * getNumber;
        }

        return getNumber;
    }

}
