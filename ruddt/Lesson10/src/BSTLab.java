

public class BSTLab {
    public void printAllValues() {
        IntBST bst = new IntBST();

        // Inserts 100 random values
        for (int i = 0; i < 100; i++) {
            int value = (int)(Math.random() * 100.0);
            bst.insertValue(value);
        }

        bst.printTree();

        int n = (int)(Math.random() * 100.0);
        BSTLab.printValuesGreaterThan(n, bst);
    }

    private static void printValuesGreaterThan(int n, IntBST bst) {
        // TODO: Print all values in the tree that are greater than N in 
        //  as quick an amount of time as possible.
    }
}
