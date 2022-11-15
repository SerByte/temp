package com.serbyte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = getUserName();
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        System.out.println("Your name is: " + userName);
        switch (operation) {
            case ("+"):
                System.out.println(add(a, b));
                break;
            case ("-"):
                System.out.println(minus(a, b));
                break;
            case("*"):
                System.out.println(multiply(a, b));
                break;
            case("/"):
                System.out.println(division(a, b));
                break;
            default:
                System.out.println("Nothing was found");
        }
    }



    static String getUserName() {
        System.out.print("Input your name: ");
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }


    static int add(Integer a, Integer b) {
        return a + b;
    }

    static  int minus(Integer a, Integer b) {
        return a - b;
    }

    static int multiply(Integer a, Integer b) {
        return a * b;
    }

    static int division(Integer a, Integer b) {
        return a / b;
    }
}
