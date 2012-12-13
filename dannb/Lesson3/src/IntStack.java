
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
        System.out.println("Pop not implemented");
        return 0;
    }

    public int size() {
        System.out.println("Size not implemented");
        return 0;
    }
}
