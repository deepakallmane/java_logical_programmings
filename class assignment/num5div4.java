import java.util.Scanner;

class meth {
  int a;
  Scanner sc = new Scanner(System.in);

  void div() {
    System.out.println("enter a value:");
    a = sc.nextInt();
    if ((a % 5 == 0) && (a % 11 == 0)) {
      System.out.println("num is divisible by 5 and 11");
    } else {
      System.out.println(" num is not division");
    }

  }

}

public class num5div4 {
  public static void main(String[] args) {
    meth m1 = new meth();
    m1.div();
  }
}
