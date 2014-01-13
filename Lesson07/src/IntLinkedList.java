
public class IntLinkedList {
    private IntListNode firstNode;

    // IntLinkedList stores a list of unique integers
    // When this class is called, firstNode is created as null, and doesn't exist in memory
    // State of an empty linked list, create the very first insert, you need to set/create it then
    //
    public IntLinkedList() {
    }

    public void insert(int value) {
        // TODO: Add the integer, or take no action if it's already in the list
        if (!contains(value)) {
            if (firstNode == null) {
                IntListNode newNode = new IntListNode(value);
                firstNode = newNode;
            } else {
                IntListNode newNode = new IntListNode(value);
                newNode.setNextNode(firstNode);
                firstNode = newNode;
            }
        }
    }

    public boolean contains(int value) {
        // TODO: Print out if the linked list contains the given integer
        IntListNode node = firstNode;
        while (node != null) {
            if (node.getValue() == value) {
                return true;
        } else {
            node = node.getNextNode();
            }
        }
        return false;
    }

    public void remove(int value) {
        // TODO: Remove the given integer from the list, or take no action if it's not in the list
        IntListNode node = firstNode;
        IntListNode prev = null;

        if (this.contains(value)) {
            while (node != null) {
                if (node.getValue() == value) {
                    if (prev != null) {
                        prev.setNextNode(node.getNextNode());
                    } else {
                        firstNode = node.getNextNode();
                    }
                    node = null;
                } else {
                   firstNode = node.getNextNode();
                        node = null;
                    }
                }
                prev = node;
                node = node.getNextNode();
            }
        }

    public void print() {
        IntListNode node = firstNode;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNextNode();
        }
    }
}
