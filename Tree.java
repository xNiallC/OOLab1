
public class Tree {
  private TreeNodeInterface root;
  public void traverse() {
    root.traverse();
  }

  public Tree(TreeNodeInterface r) {
    root=r;
  }
}

