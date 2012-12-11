import java.util.Scanner;

public class Lab2Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        //equalsTest();
        //weirdLoop();
        //allAs();
        //reverseNumbers();
        reverseArray();
        //isGeneticSequence();
        //inputAndSearch();
    }
    
    public static void equalsTest()
    {
        System.out.println("String!" == "String!");

        String s1 = "String!!";
        String s2 = "String!!";
        System.out.println(s1 == s2);


        String s3 = new String("String!!!");
        System.out.println(s3 == s1);
    }

    public static void weirdLoop() {
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
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
            }
            else {
                return false;
            }
            i++;
        }
        return true;
    }

    // Methods to fill in
    public static void reverseNumbers() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("How many numbers do you want to enter? ");
        int numberEntries = scanner.nextInt();
        int[] userNumberList = new int[numberEntries];
        for (int i=0; i<numberEntries; i++) {
        	System.out.print("Enter number: ");
        	int userEnteredNumber = scanner.nextInt();
        	userNumberList[i] = userEnteredNumber;
        }
        for (int i=0; i<numberEntries/2; i++) {
        	int temp = userNumberList[i];
        	System.out.println("Temp " + userNumberList[i]);
        	userNumberList[i] = userNumberList[numberEntries-1-i];
        	System.out.println("NumberEntries-1-i " + (numberEntries-1-i));
        	userNumberList[numberEntries-1-i] = temp;
        }
        for (int i=0; i<numberEntries; i++) {
        	System.out.println(userNumberList[i]);
        }
        // 1) Ask the user for how many numbers they want to enter
        // 2) Let them enter that many numbers
        // 3) Print them out in reverse
    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 0214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        int arrayLength = array.length;
    	System.out.println("This is the array printed forwards");
        for (int i=0; i<arrayLength; i++) {
        	System.out.println(array[i]);
        }
        for (int i=0; i<arrayLength/2; i++) {
        	int temp = array[i];
        	array[i] = array[arrayLength-1-i];
        	array[arrayLength-1-i] = temp;
        }
    	System.out.println("This is the array printed backwards");
        for (int i=0; i<arrayLength; i++) {
        	System.out.println(array[i]);
        }
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
}