package com.generalassembly;

import java.util.Scanner;

public class Lab1Samples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }

    public static void helloWorld() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();

        System.out.print("\nYour age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", you're " + age + " years old.");
    }

    public static void helloWorldWithStackedRights() {
        // TODO: Print the following
        // If your age is above 16, print "You can drive!"
        // If your age is above 18, print "You can vote!"
        // If your age is above 21, print "You can drink!"
    }

    public static void helloWorldWithComboRights() {
        // TODO: Print the following
        // If your age is above 16 but below 18, print "You can drive!"
        // If your age is above 18 but below 21, print "You can drive and vote!"
        // If your age is above 21, print "You can drive, vote and drink (but not at the same time!)"
    }

    public static void helloMultipleTimes() {
        System.out.println("Enter a number of times to say hello! ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Hello!");
        // TODO: Modify this to print "Hello!" exactly n times
    }

    public static void numberAdder() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        // TODO: Change this to stop execution and print "Total sum : " plus the value when the value exceeds 100
        while (true) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            sum = sum + n;
            System.out.println("Total sum is " + sum);
        }
    }

    public static void oddEven() {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean even = isEven(n);

        // TODO: Print if the number is even or not
    }

    public static boolean isEven(int n) {
        // TODO: Return whether the number is even or odd
        return false;
    }

    public static void helloWorldWithSeparateClass() {
    /*
    TODO:
    - Create a HelloWorldPrinter class
    - Create a method in that class, public void sayHello(). It should do the same thing as helloWorld() above
    - Create an instance of that class here
    - Call the method sayHello() on that instance
     */
    }

    public static void fib() {
    /*
    TODO:
    - Create a FibSeqeunce class
    - Create a method in that class, public long numberAtPosition(int n).
    - Create an instance of that class here
    - Ask the user to enter a number
    - Print out the result of numberAtPosition
    - Fill out the fibonacci logic for numberAtPosition
     */
    }
}
