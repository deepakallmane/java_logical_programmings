import java.util.Scanner;

class employee {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int eno = 101;
    String str = "Deepu";
    float f = 454.54F;

    System.out.println("enter Employee number:");
    eno = sc.nextInt();
    System.out.println("enter Employee name:");
    str = sc.next();
    System.out.println("enter Employee salary:");
    f = sc.nextFloat();

    System.out.println("the given Employee number:" + eno);
    System.out.println("the given Employee name:" + str);
    System.out.println("the given Employee salary:" + f);
  }
}