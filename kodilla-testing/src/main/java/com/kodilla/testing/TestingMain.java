package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(5, 10);
        int resultSub = calculator.subtract(22, 5);

        if(resultAdd == 15){
            System.out.println("test Ok");
        } else {
            System.out.println("Error");
        }

        if(resultSub == 17){
            System.out.println("test Ok");
        } else {
            System.out.println("Error");
        }
    }
}
