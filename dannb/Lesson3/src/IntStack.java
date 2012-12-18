
public class IntStack {
	IntListNode firstNode;

    public IntStack() {
    }

    public void push(int value) {
        IntListNode node = new IntListNode();
        node.value = value;
        node.nextNode = firstNode;
        firstNode = node;
    }

    public int pop() {
    	int topOfStack = firstNode.value;
        firstNode = firstNode.nextNode;   	
        return topOfStack;
    }

    public int size() {        
    	int count = 1;
    	IntListNode node = firstNode;
    	while (node.nextNode != null) {
    		node = node.nextNode;
    		count++;
    	}
    	return count;
    }
}
