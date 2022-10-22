package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de temperaturas a serem transformadas");
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++) {
            double sumBefore = 0;
            double mediaBefore = 0;
            double sumAfter = 0;
            double mediaAfter = 0;
            System.out.println("Insira o valor da temperatura");
            double value = input.nextDouble();
            System.out.println("Insira a unidade de temperatura atual (C, F, K");
            String currencyTemp = input.next();
            System.out.println("Insira a unidade de temperatura a ser convertida");
            String nextTemp = input.next();

            switch (currencyTemp) {
                case "C":
                    switch (nextTemp) {
                        case "F" -> {
                            sumBefore += value;
                            double fahrenheitC = (value * 1.8) + 32;
                            sumAfter += fahrenheitC;
                            System.out.println("O valor de " + value + "ºC" + " em Fahrenheit é: " + fahrenheitC + "ºF");
                        }
                        case "K" -> {
                            sumBefore += value;
                            double kelvinC = value + 273.15;
                            sumAfter += kelvinC;
                            System.out.println("O valor de " + value + "ºC" + " em Kelvin é: " + kelvinC + "ºK");
                        }
                    }
                case "F":
                    switch (nextTemp) {
                        case "C" -> {
                            sumBefore += value;
                            double celsiusF = (value - 32) / 1.8;
                            sumAfter += celsiusF;
                            System.out.println("O valor de " + value + "ºF" + " em Celsius é: " + celsiusF + "ºC");
                        }
                        case "K" -> {
                            sumBefore += value;
                            double kelvinF = (value - 32) * 5 / 9 + 273.15;
                            sumAfter += kelvinF;
                            System.out.println("O valor de " + value + "ºF" + " em Kelvin é: " + kelvinF + "ºK");
                        }
                    }
                case "K":
                    switch (nextTemp) {
                        case "F" -> {
                            sumBefore += value;
                            double fahrenheitK = (value - 273.15) * 9 / 5 + 32;
                            sumAfter += fahrenheitK;
                            System.out.println("O valor de " + value + "K" + " em Fahrenheit é: " + fahrenheitK + "ºF");
                        }
                        case "C" -> {
                            sumBefore += value;
                            double celsiusK = value - 273.15;
                            sumAfter += celsiusK;
                            System.out.println("O valor de " + value + "K" + " em Celsius é: " + celsiusK + "ºC");
                        }
                    }
                default:
                    System.out.println("Insira uma temperatura válida!");
            }
            mediaBefore = sumBefore / quantity;
            mediaAfter = sumAfter / quantity;
            System.out.println("A média das temperaturas iniciais é " + mediaBefore);
            System.out.println("A média das temperaturas transformadas é " + mediaAfter);
        }
    }
}