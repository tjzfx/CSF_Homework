// This class stores a linked-list of unique int values
public class IntLinkedList {
    // When a new IntLinkedList is created, Java makes firstNode == null by default
    public IntListNode firstNode;

    // Add the integer, or take no action if it's already in the list
    public void insert(int value) {
        if (firstNode == null) {
            // This was an empty, newly created list, so set the first node and its value
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

    // TODO: For this Thursday
    public void print() {
        // This should step through each node
        // and print out the value in each, from first to last
        // Order for the print-out of list containing 1, 2, 3, 4, 5, 6: "1 2 3 4 5 6"
        IntListNode node = firstNode;
        while (true) {
        	System.out.print(" " + node.value);
        	if (node.nextNode != null) {
        		node = node.nextNode;
        	}
        	else {
        		break;
        	}
        }
    }

    // TODO: For next Tuesday
    public void remove(int value) {
        // Remove the node that contains this value from the list
        // If no such node exists in the list, no action should be taken
//    	IntListNode node = firstNode;
//    	while(true) {
//	    	if (node.value == value) {
//	    		node = node.nextNode;
//	    		node.next
//	    	}
//	    	else {
//	    		node = node.nextNode
//	    	}
//    	}
    	
        System.out.println("Remove Not Implemented");
    }

    // TODO: Optional Challenge HW Question for next Tuesday:
    public int count() {
        // This method should return an int with the current count of objects in the list
        // Leave a comment with the Big-O complexity of this method
        // Hint: With a little extra work it can be done in O(1) time
        return 0;
    }

    // TODO: Optional Challenge HW Question for next Tuesday:
    public void reverse() {
        // This method should completely reverse the linked list
        // Leave a comment with the Big-O complexity of this method
        // (note: extremely popular interview question)
    }
}
