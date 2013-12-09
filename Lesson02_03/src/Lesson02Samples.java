import java.util.Scanner;

public class Lesson02Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        weirdLoop();
        //printFib();
        //allAs();
        //reverseNumbers();
        //reverseArray();
        //isGeneticSequence();
        //inputAndSearch();
        //calculator();
    }

    public static void weirdLoop() {
        // TODO: Modify this code and use the debugger to find the value of i at the 72nd iteration of this loop
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
        }
    }

    public static void printFib() {
        // TODO: Fill in the method in the FibSequence class
        // The first 10 fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number in the fibonacci sequence: ");
            int sequenceNumber = scanner.nextInt();
            FibSequence fib = new FibSequence();
            System.out.println(fib.numberAtPosition(sequenceNumber));
        }
    }

    public static void allAs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String s = scanner.next();
            System.out.println("The string only contains the letter 'a': " + stringIsAllAs(s));
        }
    }

    // TODO: There's a bug in this, find it
    public static boolean stringIsAllAs(String s) {
        int i = -1;
        while (i <= s.length()) {
            i++;
            char character = s.charAt(i);
            if (character == 'a' || character == 'A') {
                return true;
            }
            else {
                return false;
            }
        }
        return true;
    }

    // TODO: Fill in the below methods
    public static void reverseNumbers() {
        // 1) Ask the user for how many numbers they want to enter
        // 2) Let them enter that many numbers
        // 3) Print them out in reverse
    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 0214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        // 1) Reverse the above array above without creating a new array, then print it out
     }

    public static void isGeneticSequence() {
        // 1) Ask the user for a string
        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        // 3) Otherwise, print false
    }

    public static void inputAndSearch() {
        // 1) Ask the user to input 10 words
        // 2) Then ask the user to input a search word
        // 3) If the word exists in the first 10 words, print true, otherwise print false
        // 4) Return to step 2
    }

    public static void calculator() {
        // Below is a very simple calculator
        // 1) Modify it to support both addition, subtraction and multiplication operations
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an addition statement in the format x + y: ");
            Integer leftOperand = scanner.nextInt();
            String plus = scanner.next(); // The "+" sign, just ignore this
            Integer rightOperand = scanner.nextInt();
            System.out.println("Resulting value is: " + (leftOperand.intValue() + rightOperand.intValue()));
        }
    }
}