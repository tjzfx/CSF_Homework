/**
 * Created by tjz on 9/12/13.
 */
import java.util.Scanner;

public class Lesson02Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        //weirdLoop();
        //printFib();
        //allAs();
        //reverseNumbers();
        //reverseArray();
        //isGeneticSequence();
        //inputAndSearch();
        //calculator();
        foo();
    }



    public static int foo() {
        int n = 0;
        int result = 3;
        for (int i = 2; i < n; i++) {
            for (int j = 10; j < n * 2; j+= 3) {
                result += j * i;
            }
        }
        return result;
    }


    public static void weirdLoop() {
        // TODO: Modify this code and use the debugger to find the value of i at the 72nd iteration of this loop
        int counter = 0;
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
        counter++;
            if(counter == 72)
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
        int i = 0;
        while (i < s.length()) {

            char character = s.charAt(i);
            if (character != 'a' && character != 'A') {
                return false;
            }
            i++;
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
        int offset = array.length - 1;
        for(int index1 =0; index1 <= offset/2; index1++){
            int index2 = offset - index1;
            int el1 = array[index1];
            int el2 = array[index2];
            array[index1] = el2;
            array[index2] = el1;


        }
        for(int el : array)
        System.out.print(el + " ");

        // 1) Reverse the above array above without creating a new array, then print it out
    }

    public static void isGeneticSequence() {
        // 1) Ask the user for a string
        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        // 3) Otherwise, print false
    }

    public static void inputAndSearch() {

        Scanner scanner = new Scanner(System.in);
        String[] wordArray = new String[10];
        System.out.println("Please input ten words:");

        for(int userInput = 0; userInput < 10; userInput++){
            System.out.println("Word " + (userInput + 1) + ": ");
            wordArray[userInput] = scanner.next();
        }

        while(true){
            System.out.println("Enter a search word: ");
            String query = scanner.next();
            boolean foundIt = false;
            for(int queryCount = 0; queryCount < 10; queryCount++){
                //using .equals for strings, otherwise =='s will search array memory location
                if(wordArray[queryCount].equals(query))
                    foundIt = true;
            }
            //if (foundIt)
                System.out.println(foundIt);
        }
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