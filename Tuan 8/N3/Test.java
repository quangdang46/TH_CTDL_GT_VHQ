import java.util.HashSet;
import java.util.Set;

public class Test {

  public static int[] generateNumbers(int size) {
    int[] numbers = new int[size];
    Set<Integer> set = new HashSet<>();
    while (set.size() < size) {
      set.add((int) (Math.random() * 100));
    }
    int i = 0;
    for (Integer number : set) {
      numbers[i++] = number;
    }
    return numbers;
  }
  public static void main(String[] args) throws Exception {
    MyFile file = new MyFile();
    file.init(generateNumbers(20), "input.txt");
    file.readFile("input.txt");
    file.writeFile("output.txt");
  }
}