import java.util.*;


public class Library {

	private HashMap<String, User> libraryUsers;
	private HashMap<String, Item> libraryItems;
	
	public Library() {
		this.libraryUsers = new HashMap<String, User>();
		this.libraryItems = new HashMap<String, Item>();
	}
	
	public HashMap<String, User> getLibraryUsers() {
		return libraryUsers;
	}
	
	public void setLibraryUsers(HashMap<String, User> libraryUsers) {
		this.libraryUsers = libraryUsers;
	}
	
	public HashMap<String, Item> getLibraryItems() {
		return libraryItems;
	}
	
	public void setLibraryItems(HashMap<String, Item> libraryItems) {
		this.libraryItems = libraryItems;
	}
	
	public void issueItem(User user, Item item) {
		user.addLoanedItem(item);
	}
	
	public void returnItem(User user, Item item) {
		user.returnLoanedItem(item);
	}
	
	public void addItemToLibrary(Item item) {
		this.libraryItems.put(item.getTitle(),item);
	}
	
	public void addUserToLibrary(User user) {
		this.libraryUsers.put(user.getName(), user);
	}
	
	public Item lookupItem(String tempItemTitle) {
		Item item = libraryItems.get(tempItemTitle);
		return item;
	}
	
	public User lookupUser(String tempUser) {
		User user = libraryUsers.get(tempUser);
		return user;
	}
}
