
public class IntStack {
    IntListNode firstNode;

    public IntStack() {
    }

    public void push(int value) {
        // TODO: Add a value to the top of the stack
        if (firstNode == null){
            IntListNode newNode = new IntListNode(value);
            firstNode = newNode;
        } else {
            IntListNode nextNode = new IntListNode(value);
            nextNode.setNextNode(firstNode);
            firstNode = nextNode;
        }
    }

    public int pop() {
        // TODO: Pop the first value off the stack
        if (this.size() != 0) {
            IntListNode tempNode = firstNode;
            int tempVal = tempNode.getValue();

            firstNode = firstNode.getNextNode();
            tempNode = null;
            return tempVal;
        } else {
            return -1;
        }
    }

    public int size() {
        int size = 0;

        IntListNode node = firstNode;
        while (node != null) {
            size++;
            node = node.getNextNode();
        }
        return size;
    }
}
