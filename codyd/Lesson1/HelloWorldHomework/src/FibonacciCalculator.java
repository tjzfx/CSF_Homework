import java.util.ArrayList;
import java.util.Scanner;


public class FibonacciCalculator {
	public int getSequenceNumber() {
		
		System.out.print("For which number do you want the corresponding Fibonacci value?");
    Scanner scanner = new Scanner(System.in);
    int sequencenumber = scanner.nextInt();
    return sequencenumber;
	}
	
	public int calculateFibonannci (int sequencenumber) {
		int fibvalue = 0;
		if (sequencenumber == 0) {
			fibvalue = 0;
		}
		if (sequencenumber == 1) {
			fibvalue = 1;
		}
		else {
			int a=0, b=1;
			for (int x = 0; x <= sequencenumber; x++) {
				fibvalue = a;
				a = a + b;
				b = a-b;
			}
		}
		return fibvalue;
	}
	
	public int calculateFibonannciWithArray (int sequencenumberarray) {
		ArrayList<Integer> fibnumbers = new ArrayList<Integer>();
		int a=0, b=1, fibnumber=0;
		if ((sequencenumberarray == 0) || (sequencenumberarray == 1)){
			return sequencenumberarray;
		}
		else {
		for (int x = 0; x <= sequencenumberarray; x++) {
			fibnumber = a;
			a = a + b;
			b = a - b;
			fibnumbers.add(fibnumber);
		}
		int fibresult = fibnumbers.get(sequencenumberarray);
		return fibresult;
		}
	}
	
	public int calculateFibonannciWithRecursion (int sequencenumberrecursion) {
		if ((sequencenumberrecursion == 0) ||  (sequencenumberrecursion == 1)) {
			return sequencenumberrecursion;
		}
		else {
			return calculateFibonannciWithRecursion(sequencenumberrecursion-1) + calculateFibonannciWithRecursion(sequencenumberrecursion-2);
		}
	}
}


