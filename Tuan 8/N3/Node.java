public class Node {
  private int data;
  private Node left;
  private Node right;
  private int height;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public int getData() {
    return data;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  public void setData(int data) {
    this.data = data;
  }
  
  @Override
  public String toString() {
    return "" + data;
  }
}