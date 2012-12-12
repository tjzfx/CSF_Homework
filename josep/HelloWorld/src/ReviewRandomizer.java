import java.util.ArrayList;
import java.util.Random;


public class ReviewRandomizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set up array of type string -- know number of objects
		String[] studentNames = {"David","Cody", "Ryan", "Mansi", "Dann", "Jose", "RyanBy", "RyannBi", "Parker"};
		//get array upper bound
		int iUpperBound = studentNames.length;
		//create array list to populate random student names -- ability to resize 
		ArrayList<String> randomNames = new ArrayList<String>();
		Random rNumber = new Random();
		
		
		for (int iCounter= 0; iCounter < iUpperBound; iCounter ++)
		{
			while(true)
			{
				//get random student name
				String sName = studentNames[rNumber.nextInt(iUpperBound)];
				//check if student name is already in array list
				if(!randomNames.contains(sName))
				{
					//add student name and break 4 next iteration
					randomNames.add(sName);
					break;
				}
			}
		}
		//print out new array
		for (int iSize = 0 ; iSize < iUpperBound; iSize+=2)
		{
			System.out.println(randomNames.get(iSize) + " paired with " + randomNames.get(iSize + 1));
			//check if last group should have 3 students
			if (iSize + 3 == iUpperBound)
			{
				System.out.println(" and " + randomNames.get(iSize+2));
				break;
			}
					
		}
	}
}	