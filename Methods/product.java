import java.util.Scanner;

class product {
  public static void main(String args[]) {
    int pno = 11;
    String pname = "cake";
    float pcost = 450.45F;
    float pqty = 1.5F;
    float bill;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the pno");
    pno = sc.nextInt();
    System.out.println("enter the pname");
    pname = sc.next();
    System.out.println("enter the pcost");
    pcost = sc.nextFloat();
    System.out.println("enter the pqty");
    pqty = sc.nextFloat();

    bill = pcost * pqty;

    System.out.println("the given pno=" + pno);
    System.out.println("the given pname=" + pname);
    System.out.println("the given pncost=" + pcost);
    System.out.println("the given pqty=" + pqty);
    System.out.println("the total pbill=" + bill);
  }

}
