import java.util.ArrayList;
import java.util.Scanner;

public class Lab2Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        //equalsTest();
        //weirdLoop();
        //allAs();
        //reverseNumbers();
        //reverseArray();
        //isGeneticSequence();
        inputAndSearch();
    }
    
    public static void equalsTest()
    {
        System.out.println("String!" == "String!");

        String s1 = "String!!";
        String s2 = "String!!";
        System.out.println(s1 == s2);


        String s3 = new String("String!!");
        System.out.println(s3 == s1);
    }

    public static void weirdLoop() {
        // Find the 72nd value of i
    	int count = 0;
    	for (int i = -8123; i < 100533; i += 505) {
            count++;
    		if (count == 72) {
            System.out.println("72nd iteration = " + i);
    		}
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

    // There's a bug in this, find it
    public static boolean stringIsAllAs(String s) {
    	int i = 0;
        while (i < s.length()) {
            char character = s.charAt(i);
            if (character == 'a' || character == 'A') {
            	i++;
            }
            else {
                return false;
            }
        }
        return true;
    }

    // Methods to fill in
    public static void reverseNumbers() {
    	// DIRECTIONS
    	// 1) Ask the user for how many numbers they want to enter
        // 2) Let them enter that many numbers
        // 3) Print them out in reverse
    	
    	System.out.println("How many numbers do you want to enter?");
        Scanner scanner = new Scanner(System.in);
		int numbersWanted = scanner.nextInt();
		int[] listOfNumbers = new int[numbersWanted];
		
		// Loop to collect numbers in an array based on how many numbers user wants
		for (int i = 0; i < numbersWanted; i++) {
			System.out.println("Enter number: ");
	        Scanner enteredNumber = new Scanner(System.in);
	        listOfNumbers[i] = enteredNumber.nextInt();
		}
		
		// Loop that prints numbers in array in reverse
		while (numbersWanted > 0) {
			System.out.println(listOfNumbers[numbersWanted - 1]);
			numbersWanted--;
		}
    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 0214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        // DIRECTIONS
        // 1) Reverse the above array above without creating a new array, then print it out
        
        int arrayLength = array.length;
        while (arrayLength > 0) {
        	System.out.println(array[arrayLength - 1]);
        	arrayLength--;
        }
    }

    public static void isGeneticSequence() {
        // DIRECTIONS
    	// 1) Ask the user for a string
        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        // 3) Otherwise, print false
    	
    	System.out.println("Please enter a string:");
    	Scanner scanner = new Scanner(System.in);
    	String enteredString = scanner.next();
    	char character = enteredString.charAt(0);
    	if (character == 'G' || character == 'A' || character == 'T' || character == 'C') {
    		System.out.println("true");
    	} else {
    		System.out.println("false");
    	}
    }

    public static void inputAndSearch() {
        // DIRECTIONS
    	// 1) Ask the user to input 10 words
        // 2) Then ask the user to input a search word
        // 3) If the word exists in the first 10 words, print true, otherwise print false
        // 4) Return to step 2
    	System.out.println("Please enter 10 words:");
    	
    	ArrayList<String> listOfWords = new ArrayList<String>();
    	
    	// Collect 10 words and store them in the ArrayList
    	for (int i = 1; i <= 10; i++) {
    		System.out.println(i + ": ");
    		Scanner scanner = new Scanner(System.in);
        	String singleWord = scanner.next();
        	listOfWords.add(singleWord);
    	}
    	
    	// Infinite search loop
    	while (true) {
	    	System.out.println("Input a search word:");
	    	Scanner scanner = new Scanner(System.in);
	    	String searchWord = scanner.next();
	    	
	    	if (listOfWords.contains(searchWord)) {
	    		System.out.println("true");
	    	} else {
	    		System.out.println("false");
	    	}
    	}
    }
}