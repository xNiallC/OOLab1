public class NonLeafNode implements TreeNodeInterface {
    private int value;
    private TreeNodeInterface left;
    private TreeNodeInterface right;

    public NonLeafNode(int val, TreeNodeInterface left, TreeNodeInterface right) {
        this.value = val;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void traverse() {
        if (left!=null) {
            left.traverse();
        }

        System.out.println(value);

        if (right!=null) {
            right.traverse();
        }
    }
}