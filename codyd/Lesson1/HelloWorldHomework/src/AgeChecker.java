import java.util.Hashtable;
import java.util.Scanner;


public class AgeChecker {
	
	public int getAge() {
		
		System.out.print("Please enter your age:");
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    return age;
	}
	
	public Hashtable<String,Boolean> checkAge(int age) {
		
		boolean candrive = false;
		boolean canvote = false;
		boolean candrink = false;
		boolean tooyoung = false;
		Hashtable<String,Boolean> agelaws = new Hashtable<String,Boolean>();
		agelaws.put("candrive", false);
		agelaws.put("canvote", false);
		agelaws.put("candrink", false);
		agelaws.put("tooyoung", false);
		if (age >= 16) {
			candrive = true;
			agelaws.put("candrive", candrive);
		}
		if (age >= 18) {
			canvote = true;
			agelaws.put("canvote", canvote);
		}
		if (age >= 21) {
			candrink = true;
			agelaws.put("candrink", candrink);
		}
		if (age < 16) {
			tooyoung = true;
			agelaws.put("tooyoung", tooyoung);
		}
		return agelaws;		
	}
	
	public void sayAgeResult(Hashtable<String,Boolean> agelaws) {
		
		boolean candrive = agelaws.get("candrive");
		boolean canvote = agelaws.get("canvote");
		boolean candrink = agelaws.get("candrink");
		boolean tooyoung = agelaws.get("tooyoung");
		if (candrive == true) {
			System.out.println("You can drive!");
		}
		if (canvote == true) {
			System.out.println("You can vote!");
		}
		if (candrink == true) {
			System.out.println("You can drink!");
		}
		if (tooyoung == true) {
			System.out.println("You are too young to do anything!");
		}
	}
}
