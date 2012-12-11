import java.util.Scanner;

public class Lab1Samples {

    public static void main(String[] args) {
        //helloWorld();
        // Simple
        /* 
        public static void main(String[] args) {
            System.out.print("Your name:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            System.out.println("Hello " + name + "!");
        }*/
        printFib();
    }

    public static void printFib() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number in the fibonacci sequence: ");
            int sequenceNumber = scanner.nextInt();
            FibSequence fib = new FibSequence();
            System.out.println(fib.numberAtPosition(sequenceNumber));
        }
    }

    /*public static void helloWorld() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");

        HelloWorld hello = new HelloWorld();
        hello.sayHello();
    }*/
}