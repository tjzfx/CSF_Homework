import java.util.*;

public class FunWithLinkedLists {

	
	public static void main(String[] args) {
		enterNumbersForList();
		
		
		

	}
	
	public static void enterNumbersForList() {
		CreateLinkedList list =  new CreateLinkedList();
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter add/remove with a number to add a number to the list: ");
			String command = scanner.next();
			int newNumber = scanner.nextInt();
			
			if (command.equals("add")) {
				list.addNode(newNumber);
			}
		}
	}
	

}
