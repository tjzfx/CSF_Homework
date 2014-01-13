
public class IntListNode {
    //each node has to have these two things
    private int value;
    private IntListNode nextNode;

    public IntListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public IntListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(IntListNode nextNode) {
        this.nextNode = nextNode;
    }
}
