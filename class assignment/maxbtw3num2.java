import java.util.Scanner;

class meth {
  int a, b, c;
  Scanner sc = new Scanner(System.in);

  void max() {
    System.out.println("enter a,b,c value:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if ((a > b) && (a > c)) {
      System.out.println("a is the maximum");
    } else if ((b > c) && (b > a)) {
      System.out.println("b is the maximum");
    } else {
      System.out.println("c is the maximum");
    }
  }

}

class maxbtw3num2 {
  public static void main(String args[]) {
    meth m1 = new meth();
    m1.max();
  }
}
