
public class AVL {
  private Node root;

  public AVL() {
    this.root = null;
  }

  public Node getRoot() {
    return this.root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public int height(Node node) {
    if (node == null) {
      return -1;
    }
    return node.getHeight();
  }

  public int checkBalance(Node x) {
    if (x == null) {
      return 0;
    }
    return height(x.getLeft()) - height(x.getRight());
  }

  public Node rotateLeft(Node x) {
    Node y = x.getRight();
    x.setRight(y.getLeft());
    y.setLeft(x);
    x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
    y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
    return y;
  }

  public Node rotateRight(Node x) {
    Node y = x.getLeft();
    x.setLeft(y.getRight());
    y.setRight(x);
    x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
    y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
    return y;
  }

  public Node rotateRightLeft(Node x) {
    x.setRight(rotateRight(x.getRight()));
    return rotateLeft(x);
  }

  public Node rotateLeftRight(Node x) {
    x.setLeft(rotateLeft(x.getLeft()));
    return rotateRight(x);
  }

  public Node balance(Node x) {
    if (checkBalance(x) < -1) {
      if (checkBalance(x.getRight()) > 0) {
        x.setRight(rotateRight(x.getRight()));
      }
      x = rotateLeft(x);
    } else if (checkBalance(x) > 1) {
      if (checkBalance(x.getLeft()) < 0) {
        x.setLeft(rotateLeft(x.getLeft()));
      }
      x = rotateRight(x);
    }
    return x;
  }

  public Node insert(Node node, int data) {
    if (node == null) {
      return new Node(data);
    }
    if (data < node.getData()) {
      node.setLeft(insert(node.getLeft(), data));
    } else if (data > node.getData()) {
      node.setRight(insert(node.getRight(), data));
    }
    node.setHeight(Math.max(height(node.getLeft()), height(node.getRight())) + 1);
    return balance(node);
  }

  public String NLR(Node node) {
    if (node == null) {
      return "";
    }
    return node.getData() + " " + NLR(node.getLeft()) + NLR(node.getRight());
  }

  public String LNR(Node node) {
    if (node == null) {
      return "";
    }
    return LNR(node.getLeft()) + node.getData() + " " + LNR(node.getRight());
  }

  public String LRN(Node node) {
    if (node == null) {
      return "";
    }
    return LRN(node.getLeft()) + LRN(node.getRight()) + node.getData() + " ";
  }
}
