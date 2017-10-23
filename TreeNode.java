public class TreeNode {
  private int value;
  private TreeNode left;
  private TreeNode right;

  public TreeNode(int val) {
    value=val;
    left=null;
    right=null;
  }

  public void setValue(int aValue) {
    value=aValue;
  }

  public void setLeftAndRight(TreeNode leftNode, TreeNode rightNode) {
    left=leftNode;
    right=rightNode;
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

