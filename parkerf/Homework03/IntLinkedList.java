// Class stores a linked-List of unique int values 
public class IntLinkedList {
	// When a new IntLinkedList is created, firstNode == null
	
	public IntListNode firstNode;
	
	// Add the integer to the datastructure
	public void insert(int value) {
		if (firstNode == null) {
			//This was an empty, newly created list, so set this as the firstNode and add an int value.
			firstNode = new IntListNode();
			firstNode.value = value;
		}
		else {
			// There was a first node, so find the 'terminal' node,
            // which is the node that has a nextNode == null
			IntListNode node = firstNode; 
			while (node != null && node.value != value) {
				if (node.nextNode == null) {
					IntListNode nextNode = new IntListNode();
					nextNode.value = value;
					node.nextNode = nextNode;
				}
				
				node = node.nextNode;
			}
		}
	}
	
	public void print() {
	    // This should step through each node
        // and print out the value in each, from first to last
        // Order for the print-out of list containing 1, 2, 3, 4, 5, 6: "1 2 3 4 5 6"	
		// print the first node, then loop through to print the nextNode and stop when the node.nextNode == null.  returning all values is w
		if (firstNode == null) {
			System.out.print(firstNode.value);
		}
		else {
			IntListNode currentNode = firstNode;
			while (currentNode != null) {
				//redefine what node your cycling through, then print it after the if block.
						
				System.out.print(currentNode.value + " ");
				currentNode = currentNode.nextNode;
			}
		}	
	}
}		
		
		
		
	