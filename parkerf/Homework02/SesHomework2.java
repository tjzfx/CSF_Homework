import java.util.ArrayList;
import java.util.Collections;

public class SesHomework2 {
	
	public static void main(String[] args) {
		
	// Instantiate an empty ArrayList and add values.
		ArrayList<String> sesStudents = new ArrayList<String>();
		
        sesStudents.add("Davis");
        sesStudents.add("Cody");
        sesStudents.add("Ryan");
        sesStudents.add("Mansi");
        sesStudents.add("Dann");
        sesStudents.add("Jose");
        sesStudents.add("Ryan Bl");
        sesStudents.add("Parker");
        sesStudents.add("Ryan By");
        
        Collections.shuffle(sesStudents);
        int size = sesStudents.size();
        	
        System.out.println("First Pair: ");
        
        while (size >= 1) {
        	
        	for (int i = 0; i < 2 ; i++ ) {
        	
        	System.out.println(" " + sesStudents.get(i) + " ");  
        	sesStudents.remove(i);
        	
        		if (i == 1) {
        			System.out.println("Next Pair: ");  
        		}
        		
        	}
        
         }
        }
       
	}