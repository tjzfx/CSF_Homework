import java.util.Scanner;

public class Lab1Samples {

    static final int DRIVING_AGE = 16;
    static final int VOTING_AGE = 18;
    static final int DRINKING_AGE = 21;

    public static void main(String[] args) {
//        helloWorld();
//        helloMultipleTimes();
//        helloWorldWithStackedRights();
        helloWorldWithComboRights();
//        helloWorldWithSeparateClass();;
//        oddEven();
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();

        System.out.print("\nYour age: ");
        int age = scanner.nextInt();

        if (age >= DRIVING_AGE) {
            System.out.println("You can drive!");
        }
        if (age >= VOTING_AGE) {
            System.out.println("You can vote!");
        }
        if (age >= DRINKING_AGE) {
            System.out.println("You can drink!");
        }
    }

    public static void helloWorldWithComboRights() {
        // TODO: Print the following
        // If your age is above 16 but below 18, print "You can drive!"
        // If your age is above 18 but below 21, print "You can drive and vote!"
        // If your age is above 21, print "You can drive, vote and drink (but not at the same time!)"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();

        System.out.print("\nYour age: ");
        int age = scanner.nextInt();

        if (age >= DRINKING_AGE) {
            System.out.println("You can drive, vote and drink (but not at the same time!)");
        }
        else if (age >= VOTING_AGE) {
            System.out.println("You can drive and vote!");
        }
        else if (age >= DRIVING_AGE) {
            System.out.println("You can drive!");
        }
    }

    public static void helloMultipleTimes() {
        System.out.println("Enter a number of times to say hello! ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Modify this to print "Hello!" exactly n times

        for (int i = 0; i < n; i++) {
            System.out.println("Hello!");
        }
    }

    public static void numberAdder() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        // Change this to stop execution and print "Total sum : " plus the value when the value exceeds 100
        while (sum < 100) {
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

        System.out.println(even ? "Even!" : "Odd!");
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void helloWorldWithSeparateClass() {
    /*
    - Create a HelloWorldPrinter class
    - Create a method in that class, public void sayHello(). It should do the same thing as helloWorld() above
    - Create an instance of that class here
    - Call the method sayHello() on that instance
     */
        HelloWorldPrinter hello = new HelloWorldPrinter();
        hello.sayHello();
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