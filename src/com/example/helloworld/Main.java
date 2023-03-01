package com.example.helloworld;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        int age = 30;
//        age = 35;
//        String message = "Hello World";
////      sout + tab is shortcut
//        System.out.println(message);
//
//
//        int[] numbers = { 2, 3, 5, 1, 4 };
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//
//
//        double result = (double)10 / (double)3;
//        System.out.println(result);
//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2;
//        System.out.println(y);

//        Mortgage Calculator with error handling

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        Double monthlyInterest = 0.00;
        int numberOfPayments = 0;

                Scanner scanner = new Scanner(System.in);
        System.out.println("Mortgage Calculator");
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            Double annualInterest = scanner.nextDouble();
            if (annualInterest >= 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a number greater than 1 and less than 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            int period = scanner.nextInt();
            if (period >= 1 && period <= 30) {
                numberOfPayments = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


        Double mortgagePayment = principal * ( monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments) / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1) );
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Your monthly mortgage payment is " + currency.format(mortgagePayment));


////        Fizz Buzz
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a Number to see Fizz Buzz: ");
//        int number = scanner.nextInt();
//        if ((number % 15) == 0) {
//            System.out.println("Fizz Buzz");
//        } else if((number % 5) == 0) {
//            System.out.println("Buzz");
//        } else if ((number % 3) == 0) {
//            System.out.println("Fizz");
//        } else {
//            System.out.println(number);
//        }
    }
}
