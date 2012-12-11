import java.util.ArrayList;
import java.util.Scanner;

public class RandomPartner {

	public static void main(String[] args) {
		System.out.println("How many students are there?");
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = scanner.nextInt();
		String[] listOfStudents = collectStudentNames(numberOfStudents);
		assignAndPrintRandomPartners(listOfStudents, numberOfStudents);
	}

	public static String[] collectStudentNames(int n) {
		// Creates and returns an Array filled with all the students' names.
		String[] listOfStudents = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name: ");
	        Scanner enteredName = new Scanner(System.in);
	        listOfStudents[i] = enteredName.next();
		}
		return listOfStudents;
	}
	
	/*
	 * NOT WORKING YET :(
	public static void assignAndPrintPartners(String[] studentNames, int numberOfStudents) {
		ArrayList<Integer> matchedStudents = new ArrayList<Integer>(0);
		while (matchedStudents.size() < numberOfStudents) {
			if (numberOfStudents - matchedStudents.size() == 3) {
				int counter = 0;
				while (counter < 1) {
					int student1 = (int) (Math.random() * numberOfStudents);
					int student2 = (int) (Math.random() * numberOfStudents);
					int student3 = (int) (Math.random() * numberOfStudents);
					if (student1 != student2 && student1 != student3 && student2 != student3 && !matchedStudents.contains(student1) && !matchedStudents.contains(student2) && !matchedStudents.contains(student3)) {
						System.out.println(studentNames[student1] + ", " + studentNames[student2] + ", " + studentNames[student3]);
						counter++;
					}
				}
			} else {
				// Pick random student by generating random int between 0 and numberOfStudents
				int student1 = (int) (Math.random() * numberOfStudents);
				int student2 = (int) (Math.random() * numberOfStudents);
				// Make sure the two students aren't the same and that they haven't been assigned yet
				if (student1 != student2 && !matchedStudents.contains(student1) && !matchedStudents.contains(student2)) {
					// Add students to matchedStudents array that stores students who have already been matched
					matchedStudents.add(student1);
					matchedStudents.add(student2);
					System.out.println(studentNames[student1] + ", " + studentNames[student2]);
					break;
				}				
			}
		}
	}	
	*/
	
	public static void assignAndPrintRandomPartners(String[] studentNames, int numberOfStudents) {		
		ArrayList<Integer> matchedStudents = new ArrayList<Integer>(0);
		// Check if number of students is even and perform random matching accordingly
		if (numberOfStudents % 2 == 0) {
			while (matchedStudents.size() < numberOfStudents) {
				// Pick random student by generating random int between 0 and numberOfStudents
				int student1 = (int) (Math.random() * numberOfStudents);
				int student2 = (int) (Math.random() * numberOfStudents);
				// Make sure the two students aren't the same and that they haven't been assigned yet
				if (student1 != student2 && !matchedStudents.contains(student1) && !matchedStudents.contains(student2)) {
					// Add students to matchedStudents array that stores students who have already been matched
					matchedStudents.add(student1);
					matchedStudents.add(student2);
					System.out.println(studentNames[student1] + ", " + studentNames[student2]);
				}
			}
		} else {			
			// Do the same as above, until there are only three students left
			while (numberOfStudents - matchedStudents.size() > 3) {
				// Pick random student by generating random int between 0 and numberOfStudents
				int student1 = (int) (Math.random() * numberOfStudents);
				int student2 = (int) (Math.random() * numberOfStudents);
				// Make sure the two students aren't the same and that they haven't been assigned yet
				if (student1 != student2 && !matchedStudents.contains(student1) && !matchedStudents.contains(student2)) {
					// Add students to matchedStudents array that stores students who have already been matched
					matchedStudents.add(student1);
					matchedStudents.add(student2);
					System.out.println(studentNames[student1] + ", " + studentNames[student2]);
				}
			}
			// Now that there are 3 students left, randomly match and print them
			int j = 0;
			while (j < 1) {
				int student1 = (int) (Math.random() * numberOfStudents);
				int student2 = (int) (Math.random() * numberOfStudents);
				int student3 = (int) (Math.random() * numberOfStudents);
				if (student1 != student2 && student1 != student3 && student2 != student3 && !matchedStudents.contains(student1) && !matchedStudents.contains(student2) && !matchedStudents.contains(student3)) {
					System.out.println(studentNames[student1] + ", " + studentNames[student2] + ", " + studentNames[student3]);
					j++;
				}
			}
	
		}

	}

}
