import java.util.Scanner;


public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner consoleScanner = new Scanner(System.in);
        System.out.print("\nType 'add' or 'list' to start");
        String result = consoleScanner.next();
        if (result.equals("add")) {
        	System.out.print("\nName?");
        	String tempName = consoleScanner.next();
        	System.out.print("\nTime?");
        	int tempTime = consoleScanner.nextInt();
        	System.out.print("\nNumber of people?");
        	int tempSize = consoleScanner.nextInt();
        	Reservation reservation = new Reservation(tempName, tempTime, tempSize); 
        }
        else if (result.equals("list")) {
            
        }
        else {
            System.out.println("Invalid input, bailing");
        }
        
        
		
	}

}
