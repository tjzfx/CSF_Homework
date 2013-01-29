import java.util.LinkedList;



public class BSTIterator{
	private IntNode currentNode;	
	
	private BSTIterator (IntNode ourNode){
		currentNode = ourNode;
	}
	
	
	public boolean hasNext() {
		if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Object next() {
		// Need to modify so that next returns the next item in the queue
		LinkedList<IntNode> queue = new LinkedList<IntNode>();
        queue.add(currentNode);
        currentNode.setVisited(true);
        System.out.print("BFS of BST:" );

        while(!queue.isEmpty()) {
            IntNode node = queue.remove();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChild() != null && node.getLeftChild().getVisited() == false) { 
                queue.add(node.getLeftChild());
            	node.getLeftChild().setVisited(true);
            }
            if (node.getRightChild() != null && node.getRightChild().getVisited() == false) {
                queue.add(node.getRightChild());
            	node.getRightChild().setVisited(true);
            }
        }
	}
	
}
