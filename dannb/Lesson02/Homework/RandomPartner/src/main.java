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
		
		// Check if number of students is even and perform random matching accordingly
		ArrayList<Integer> matchedStudents = new ArrayList<Integer>(0);
		if (numberOfStudents % 2 == 0) {
			while (matchedStudents.size() < numberOfStudents) {
				int student1 = (int) (Math.random() * numberOfStudents);
				int student2 = (int) (Math.random() * numberOfStudents);
				if (student1 != student2 && !matchedStudents.contains(student1) && !matchedStudents.contains(student2)) {
					matchedStudents.add(student1);
					matchedStudents.add(student2);
					System.out.println(listOfStudents[student1] + ", " + listOfStudents[student2]);
				}
			}
		} else {
			
		}
	
	}

}
