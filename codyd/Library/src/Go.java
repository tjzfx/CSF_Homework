import java.util.Scanner;


public class Go {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User();
		Library library = new Library();
		
		Item timeMagazine = new ItemMagazine(5,"Time");
		Item mobyDickBook = new ItemBook("Melville", "Moby Dick");
		Item outOfSightMovie = new ItemDVD ("Soderberg", "Out of Sight");
		
		library.addItemToLibrary(timeMagazine);
		library.addItemToLibrary(mobyDickBook);
		library.addItemToLibrary(outOfSightMovie);
		
		User codyUser = new User("cody", 1);
		
		library.addUserToLibrary(codyUser);
		
		while(true) {
			System.out.print("\nWelcome to the library");
			Scanner consoleScanner = new Scanner(System.in);
	        System.out.print("\nType 'loan', 'return', or 'list' (or 'quit' to exit): ");
	        String result = consoleScanner.next();
	        
	        if (result.equals("loan")) {
	        	System.out.print("\nHere are the items available to loan: " + library.getLibraryItems().keySet());
	        	System.out.print("\nWhich item would you like to loan? ");
	        	String tempItemTitle = consoleScanner.next();
	        	Item loanedItem = library.lookupItem(tempItemTitle);
	        	System.out.print("\nHere are all the library users: " + library.getLibraryUsers().keySet());
	        	System.out.print("\nWho would you like to loan it to?");
	        	String tempUser = consoleScanner.next();
	        	User userGettingBook = library.lookupUser(tempUser);
	        	library.issueItem(userGettingBook, loanedItem);
	        }
		}

	}

}
