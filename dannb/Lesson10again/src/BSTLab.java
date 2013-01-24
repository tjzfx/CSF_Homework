import java.util.ArrayList;
import java.util.Collections;



public class BSTLab {
    public void printAllValues() {
        IntBST bst = new IntBST();

        // Inserts 100 random values
        for (int i = 0; i < 100; i++) {
            int value = (int)(Math.random() * 100.0);
            bst.insertValue(value);
        }

        bst.printTree();

        int n = (int)(Math.random() * 100.0);
        BSTLab.printValuesGreaterThan(n, bst);
    }
    
    public void createArray() {
    	ArrayList<Integer> newArrayList = new ArrayList<Integer>(100);
    	
    	for (int i = 0; i < 100; i++) {
    		int value = (int)(Math.random() * 100.0);
    		newArrayList.add(value);
    	}
    	Collections.sort(newArrayList); 
    	
    }
    
    private void searchArray(ArrayList<Integer> array, int desiredInt) {
    	int currentIndex = array.size()/2;
    	if (desiredInt == array.get(currentIndex)) return;
    	// continue recursive function
    }

    private static void printValuesGreaterThan(int n, IntBST bst) {
        // TODO: Print all values in the tree that are greater than N in 
        //  as quick an amount of time as possible.
    }
}