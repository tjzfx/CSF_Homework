import java.util.ArrayList;
import java.util.Scanner;


public class main {
	
	public static void main(String[] args) {
		
		assignRandomPartners();

		}
	
	public static void assignRandomPartners() {
		System.out.println("How many students are there?");
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = scanner.nextInt();
		String[] listOfStudents = new String[numberOfStudents];
		
		// Get student's names
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter name: ");
	        Scanner enteredName = new Scanner(System.in);
	        listOfStudents[i] = enteredName.next();
		}
		
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
					System.out.println(listOfStudents[student1] + ", " + listOfStudents[student2]);
				}
			}
		} else {
			
		}
	
	}

}
