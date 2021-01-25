package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        System.out.println("Podaj nazwe gracza: ");
        Scanner scannerName = new Scanner(System.in);
        String userName = scannerName.nextLine();

        System.out.println("Podaj ilość rund: ");
        Scanner toWin = new Scanner(System.in);
        int roundToWin = toWin.nextInt();
        User user = new User(userName, roundToWin);

        System.out.println("Klawisz 1: kamień");
        System.out.println("Klawisz 2: papier");
        System.out.println("Klawisz 3: nożyce");
        System.out.println("Klawisz X: zakończ grę");
        System.out.println("Klawisz n: rozpocznij od nowa");




    }
}
