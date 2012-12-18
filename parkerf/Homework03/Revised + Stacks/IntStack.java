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
    	int temp = firstNode.value;
    	firstNode = firstNode.nextNode;
    	System.out.println(temp);
    	return temp;
    }

    public int size() {
    	IntListNode currentNode = firstNode;
    	int count = 0;
   		while (currentNode != null) {                //redefine what node your cycling through, then print it after the if block.
			currentNode = currentNode.nextNode;
			count++;
		}
		
		return count;
				
	}
    
}