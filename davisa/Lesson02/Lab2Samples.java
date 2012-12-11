import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lab2Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
//        equalsTest();
//        weirdLoop();
//        allAs();
//        reverseNumbers();
//        reverseArray();
        randomlyAssignCodeReviewPartners();
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
    	int seventwo = 1;
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
            if (seventwo == 72) {
            	break;
            }
            seventwo ++;
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
        int i = -1;
        while (i <= s.length()) {
            i++;
            char character = s.charAt(i);
            boolean isA = (character == 'a' || character == 'A');
            if (character == 'a' || character == 'A') {
            }
            else {
                return false;
            }
        }
        return true;
    }

    // Methods to fill in
    public static void reverseNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int numberOfNumbers = scanner.nextInt();
        int[] userNumbers = new int[numberOfNumbers]; 
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Enter a number");
        	int num = scanner.nextInt();
        	userNumbers[i] = num;
        }
        for (int i = 1; i <= numberOfNumbers; i++) {
            System.out.println(userNumbers[numberOfNumbers-i]);
        }
        // 1) Ask the user for how many numbers they want to enter
        // 2) Let them enter that many numbers
        // 3) Print them out in reverse
    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 0214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        int temp = array[0];
    	for (int i = 0; i < array.length/2 ; i++) {
    		int compIndex = array.length - i - 1;
    		array[i] = array[compIndex];
    		array[compIndex] = temp;
    		temp = array[i+1]; 
    	}
    	for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + ",");
    	}
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

    public static void randomlyAssignCodeReviewPartners() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> classList = new ArrayList<String>();
		ArrayList<String[]> codeReviewPairs = new ArrayList<String[]>(); 
		System.out.println("How many students in class?");
		int numStudents = scanner.nextInt();
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter student name:");
			String studentName = scanner.next();
			classList.add(studentName);
		}
		Random generator = new Random();
		for (int i = 0; i < classList.size(); i++) {
			if (classList.size() > 3) {
				int pair1Index = generator.nextInt(classList.size());
				String pair1Name = classList.get(pair1Index);
				classList.remove(pair1Index);
				int pair2Index = generator.nextInt(classList.size());
				String pair2Name = classList.get(pair2Index);
				classList.remove(pair2Index);
				String[] pair = {pair1Name, pair2Name};
				codeReviewPairs.add(pair);
			} else {
				String[] pair = classList.toArray(new String[classList.size()]);
				codeReviewPairs.add(pair);
			}
		}
		System.out.println("Here are your pairs:");
		for (int i = 0; i < codeReviewPairs.size(); i++) {
			String[] pair = codeReviewPairs.get(i);
			for (int j = 0; j < pair.length; j++) {
				System.out.print(pair[j] + " ");
			}
			System.out.println("");
		}
    }
}