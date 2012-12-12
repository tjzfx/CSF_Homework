import java.util.*;

public class LinkedListPractice {

	public static void main(String[] args) {
		IntLinkedList newLinkedList = new IntLinkedList();
		System.out.println("Enter a number in the format 'add n': ");
		Scanner scanner = new Scanner(System.in);
		String userStringInput = scanner.next();
	    int userIntInput = scanner.nextInt();
	    newLinkedList.insert(userIntInput);
	    newLinkedList.print();
	}
}
	
	
