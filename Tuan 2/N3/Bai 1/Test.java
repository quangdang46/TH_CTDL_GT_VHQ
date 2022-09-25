import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    MyStack<Fraction> stack=new MyStack<Fraction>();
    MyQueue<Fraction> queue=new MyQueue<Fraction>();
    Scanner sc=new Scanner(System.in);
    System.out.print("Moi ban nhap so luong phan so: ");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
    sc.nextLine();
    System.out.println("Moi ban nhap tu so:");
    int a=sc.nextInt();
    System.out.println("Moi ban nhap mau so:");
    int b=sc.nextInt();
    stack.push(new Fraction(a,b));
    queue.enQueue(new Fraction(a,b));

    }
    System.out.println("Stack:");
    stack.print();
    System.out.println("\nQueue:");
    queue.print();
  }
}
