
import java.util.Scanner;

class meth {
  int a;
  Scanner sc = new Scanner(System.in);

  void num() {
    System.out.println("enter a value:");
    a = sc.nextInt();
    if (a > 0) {
      System.out.println("num is the positive");
    } else {
      System.out.println(" num is the negative");
    }

  }

}

public class pos3 {
  public static void main(String args[]) {
    meth m1 = new meth();
    m1.num();
  }
}