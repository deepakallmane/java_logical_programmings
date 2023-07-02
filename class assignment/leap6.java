import java.util.Scanner;

class leap6 {
  public static void main(String args[]) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    a = sc.nextInt();
    if (a % 4 == 0) {
      System.out.println("entered year is leap year");
    } else {
      System.out.println("entered year is  not leap year");
    }

  }
}