package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleuser = new SimpleUser("theForumUser");

        String result = simpleuser.getUserName();

        if(result.equals("theForumUser")){
            System.out.println("test Ok");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(5,8);
        Integer resultAdd = calculator.add();
        Integer resultSub = calculator.subtract();
        int calcA = calculator.getA();
        int calcB = calculator.getB();

        if(resultAdd.equals(calcA + calcB)){
            System.out.println("add test Ok");
        } else {
            System.out.println("Error");
        }

        if(resultSub.equals(calcA - calcB)){
            System.out.println("subtract test Ok");
        } else {
            System.out.println("Error");
        }


    }
}
