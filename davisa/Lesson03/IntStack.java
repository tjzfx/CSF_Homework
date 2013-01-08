
public class IntStack {
    IntListNode firstNode;
    int stackSize;

    public IntStack() {
    }

    public void push(int value) {
        IntListNode node = new IntListNode();
        node.value = value;
        node.nextNode = firstNode;
        firstNode = node;
        stackSize++;
    }

    public int pop() {
    	if(firstNode != null) {
            int poppedValue = firstNode.value;
            firstNode = firstNode.nextNode;
            stackSize--;
            return poppedValue;
    	} else {
    		return 0;
    	}
    }

    public int size() {
//        return stackSize;
    	int tempStackSize = 0;
    	IntListNode node = firstNode;
    	while(node != null) {
    		node = node.nextNode;
    		tempStackSize++;
    	}
      return tempStackSize;
    }
    
    public void iShouldntPrintTheFullContentsOfAStack() {
    	IntListNode node = firstNode;
    	while(node != null) {
    		System.out.print(node.value + " ");
    		node = node.nextNode;
    	}
		System.out.println("");
    }
}
