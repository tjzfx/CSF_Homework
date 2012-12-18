
public class IntNode {
	private int value;
    private IntNode leftChild;
    private IntNode rightChild;

    public IntNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int i) {
    	this.value = i;
    }

    public IntNode getLeftChild() {
        return leftChild;
    }

    public IntNode getRightChild() {
        return rightChild;
    }

    public void setLeftChild(IntNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(IntNode rightChild) {
        this.rightChild = rightChild;
    }
}
