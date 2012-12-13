import java.util.Scanner;

public class IntListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 'list' to start: ");
		String command = sc.next();
		if (command.equals("list")) {
			linkedList();
		}
		else {
			System.out.println("Invalid input");
		}
	}
	 public static void linkedList() {
		IntLinkedList list = new IntLinkedList();
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter {add/remove} number to modify the list and {print} to print the list: ");
			String command = sc.next();
			
			
			if (command.equals("add")) {
				int value = sc.nextInt();
				list.insert(value);				
			}
			
			else if (command.equals("print")) {
				list.print();
			}
		}
	 }
}
