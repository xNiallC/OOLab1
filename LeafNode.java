public class LeafNode implements TreeNodeInterface {
    private int value;

    public LeafNode(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public void traverse() {
        System.out.println(value);
    }
}