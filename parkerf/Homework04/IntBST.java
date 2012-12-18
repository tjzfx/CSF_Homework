import java.util.LinkedList;


public class IntBST {
    private IntNode rootNode;

    public void printTree() {
        LinkedList<IntNode> queue = new LinkedList<IntNode>();
        queue.add(rootNode);
        System.out.print("BFS of BST:" );

        while(!queue.isEmpty()) {
            IntNode node = queue.remove();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChild() != null)
                queue.add(node.getLeftChild());
            if (node.getRightChild() != null)
                queue.add(node.getRightChild());
        }
    }

    public void insertValue(int value) {	   
        
    	IntNode newNode = new IntNode(value);
     
        if (rootNode == null) {
        rootNode = new IntNode(value);
        }
        else {
            IntNode currentNode = rootNode; 
            IntNode parent;
            while(currentNode != null && (currentNode.getValue() != value)) {
            	parent = currentNode;
            	if ( value > currentNode.getValue()) {
            		currentNode = currentNode.getRightChild();
            		if (currentNode == null) {
            			parent.setRightChild(newNode);       			
            		}
            	}
            	else {
            		currentNode = currentNode.getLeftChild();
            		if (currentNode == null ) {
            			parent.setLeftChild(newNode);
            		}
            	}
            }           
        }
    }

    public boolean search(int value) {
        IntNode currentNode = rootNode;

        while(currentNode != null && (currentNode.getValue() != value)) {
            if (value > currentNode.getValue()) { // Continue down the right child path
                currentNode = currentNode.getRightChild();
            }
            else { // Continue down the left child path
                currentNode = currentNode.getLeftChild();
            }
        }
        // If the current node exists and its value is equal to the input, return true, else return false
        return currentNode != null && (currentNode.getValue() == value);
    }

    public void remove(int value) {
        // TODO: Optional Challenge HW Question for next Tuesday
        // To remove, first examine the find the node, then:
        // 1) Node N has no children? Just remove N
        // 2) Node N has one child? Just remove N and replace with the child
        // 3) Node N has two children? A little harder. Either take the in-order successor or predecessor R, swap the values of N and R, then delete R
    	
    	IntNode currentNode = rootNode;
    	IntNode parent;
    	IntNode child;
    	while(currentNode != null && (currentNode.getValue() != value)) {
    		if (value > currentNode.getValue()) {
    			currentNode = currentNode.getRightChild();
    		}
    		else {
    			currentNode = currentNode.getLeftChild();
    		}  		
    	}
    	if (currentNode != null && (currentNode.getvalue() == value && currentNode)
    			
    			return currentNode != null && (currentNode.getValue() == value);
    	
    	
    	
    }
}