import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;



public class StartHere {

	public static void main(String[] args) {
		System.out.println("Which excersize would you like to run? (0 to quit)");
		System.out.println("Type '1' for the 'Hello World' demo;");
		System.out.println("type '2' for the 'Age Checker' demo; or ");
		System.out.println("type '3' for the 'Fibonacci Calculator' demo: ");
		System.out.println("type '4' for the 'ArrayList' demo: ");
		System.out.println("type '5' for the 'Fibonacci Calculator w/ an Array' demo: ");
		System.out.println("type '6' for the 'Fibonacci Calculator w/ Recursion' demo: ");
    Scanner scanner = new Scanner(System.in);
    int chapter = scanner.nextInt();
		switch (chapter) {
		case 0: System.out.println("Goodbye!");
						break;
		case 1: HelloWorldPrinter hello = new HelloWorldPrinter();
						String name = hello.getName();
						hello.sayHello(name);
						break;
		case 2: AgeChecker agechecker = new AgeChecker();
						int age = agechecker.getAge();
						Hashtable<String,Boolean> agelaws = agechecker.checkAge(age);
						agechecker.sayAgeResult(agelaws);
						break;
		case 3: FibonacciCalculator fibcalc = new FibonacciCalculator();
						System.out.println(fibcalc.calculateFibonannci(fibcalc.getSequenceNumber())); 
						break;
		case 4: FunWithArrayList namelist = new FunWithArrayList();
						ArrayList<String> allnames = namelist.getNames(); 
						namelist.printNames(allnames);
						break;
		case 5: FibonacciCalculator fibcalcarray = new FibonacciCalculator();
						int sequencenumber2 = fibcalcarray.getSequenceNumber();
						int fibcalcarrayresult = fibcalcarray.calculateFibonannciWithArray(sequencenumber2);
						System.out.println(fibcalcarrayresult); break;	
		case 6: FibonacciCalculator fibcalcrecursion = new FibonacciCalculator();
						int sequencenumber3 = fibcalcrecursion.getSequenceNumber();
						int fibcalcarrayresult2 = fibcalcrecursion.calculateFibonannciWithRecursion(sequencenumber3);
						System.out.println(fibcalcarrayresult2); break;
		}
	}
}
