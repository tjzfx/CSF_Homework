import java.util.LinkedList;


public class IntBST {
    private IntNode rootNode;
    
    public void setRootNode(IntNode node) {
    	this.rootNode = node;
    }

    public void printTree() {
        LinkedList<IntNode> queue = new LinkedList<IntNode>();
        queue.add(rootNode);
        rootNode.setVisited(true);
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

    public void insertValue(int value) {
        if (rootNode == null) {
            rootNode = new IntNode(value);
        }
        else {
            IntNode currentNode = rootNode;

            while (currentNode.getValue() != value) {
                if (value > currentNode.getValue()) { // Right child path
                    if (currentNode.getRightChild() == null) {
                        currentNode.setRightChild(new IntNode(value));
                    }
                    currentNode = currentNode.getRightChild();
                }
                else { // Left child path
                    if (currentNode.getLeftChild() == null) {
                        currentNode.setLeftChild(new IntNode(value));
                    }
                    currentNode = currentNode.getLeftChild();
                }
            }
        }
    }
}
