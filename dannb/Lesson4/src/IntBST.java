import java.util.LinkedList;
import java.util.Stack;

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
        if (rootNode == null) {
            rootNode = new IntNode(value);
        }
        else {
        	IntNode currentNode = rootNode;
        	
        	while (currentNode.getValue() != value) {
        		if (value < currentNode.getValue()) {
        			if (currentNode.getLeftChild() == null) {
        				currentNode.setLeftChild(new IntNode(value));
        				currentNode = currentNode.getLeftChild();
        			} else {
        				currentNode = currentNode.getLeftChild();
        			}
        				        			
        		} else {
        			if (currentNode.getRightChild() == null) {
        				currentNode.setRightChild(new IntNode(value));
        				currentNode = currentNode.getRightChild();
        			} else {
        				currentNode = currentNode.getRightChild();
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
    	
    	// STILL BUGGY :(
    	IntNode parentNode = rootNode;
    	IntNode deletionNode = rootNode;
    	
    	while (deletionNode != null && (deletionNode.getValue() != value)) {
    		parentNode = deletionNode;
    		if (value > parentNode.getValue()) {
    			deletionNode = parentNode.getRightChild();
    		}
    		else {
    			deletionNode = parentNode.getLeftChild();
    		}
    	}
	    if (deletionNode.getLeftChild() == null && deletionNode.getRightChild() == null) {	
    		if (deletionNode.getValue() > parentNode.getValue()) {
    			parentNode.setRightChild(null);
	    	} else {
	    		parentNode.setLeftChild(null);
	    	}
	    } else if (deletionNode.getLeftChild() == null || deletionNode.getRightChild() == null) {
	    	// Remove N and replace with child
	    	if (deletionNode.getValue() > parentNode.getValue()) {
	    		if (deletionNode.getLeftChild() == null) {
	    			parentNode.setRightChild(deletionNode.getRightChild());
	    		} else {
	    			parentNode.setRightChild(deletionNode.getLeftChild());	    			
	    		}
	    	} else {
	    		if (deletionNode.getLeftChild() == null) {
	    			parentNode.setLeftChild(deletionNode.getRightChild());
	    		} else {
	    			parentNode.setLeftChild(deletionNode.getLeftChild());	    			
	    		}
	    	}
	    } else {
	    	//Either take the in-order successor or predecessor R, swap the values of N and R, then delete R
	    	IntNode childNode = deletionNode.getLeftChild();
	    	int childValue = childNode.getValue();
	    	deletionNode.setValue(childValue);
	    	deletionNode.setLeftChild(null);
	    	}
	    	
	 }
    	
    	/*
    	Stack<IntNode> nodeStack = new Stack<IntNode>();
    	nodeStack.push(rootNode);
    	IntNode node = nodeStack.peek();
    	
    	while (nodeStack.peek() != null && node.getValue() != value) {    		
    		if (value < node.getValue()) {
    			node = node.getLeftChild();
    			nodeStack.push(node);
    		} else {
    			node = node.getRightChild();
    			nodeStack.push(node);
    		}
    	}	
    	while (node != null) {
    		if (node.getLeftChild() == null && node.getRightChild() == null) {
    			IntNode currentNode = nodeStack.peek();
    			
    		}
    		else if (currentNode.getLeftChild() == null || currentNode.getRightChild() == null) {
    			if(currentNode.getLeftChild() != null) {
    				currentNode = currentNode.getLeftChild();
    			} else {
    				currentNode = currentNode.getRightChild();
    			}
    		} else {
    			
    		}
    	} */
}

