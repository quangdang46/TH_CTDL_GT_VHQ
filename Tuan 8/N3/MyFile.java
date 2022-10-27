import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
  private AVL tree;

  public MyFile() {
    this.tree = new AVL();
  }

  public void init(int[] arr, String fileName) throws IOException {
    FileWriter writer = new FileWriter(fileName);
    for (int i = 0; i < arr.length; i++) {
      writer.write(arr[i] + " ");
    }
    writer.close();
  }

  public void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      String[] words = line.split(" ");
      for (String number : words) {
        tree.setRoot(tree.insert(tree.getRoot(), Integer.parseInt(number)));
      }
    }
    sc.close();
  }

  public void writeFile(String fileName) throws IOException {
    FileWriter writer = new FileWriter(fileName);
    writer.write(tree.NLR(tree.getRoot()));
    writer.write("\r\n");
    writer.write(tree.LNR(tree.getRoot()));
    writer.write("\r\n");
    writer.write(tree.LRN(tree.getRoot()));
    writer.close();
  }

}
