public class Test {
    public static void main(String args[]) {
        TreeNodeInterface r=new NonLeafNode(3, new LeafNode(4), new LeafNode(5));

        Tree t=new Tree(r);

        t.traverse();
    }
}

