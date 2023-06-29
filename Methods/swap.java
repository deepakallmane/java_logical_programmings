import java.util.Scanner;

class Swap2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a;
    int b;

    System.out.println("Enter value of a: ");
    a = sc.nextInt();

    System.out.println("Enter value of b: ");
    b = sc.nextInt();
    System.out.println("value of a before swapping =" + a);
    System.out.println("value of b before swapping =" + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("value of a after swapping =" + a);
    System.out.println("value of b after swapping =" + b);

  }
}