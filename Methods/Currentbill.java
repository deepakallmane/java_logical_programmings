import java.util.Scanner;

class Currentbill {
  public static void main(String args[]) {
    int cno, pmr, lmr, tunits;
    String cname;
    float bill;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the consumer number");
    cno = sc.nextInt();
    System.out.println("enter the consumer name");
    cname = sc.next();
    System.out.println("enter the present month reading");
    pmr = sc.nextInt();
    System.out.println("enter the last month of reading");
    lmr = sc.nextInt();
    tunits = pmr - lmr;
    bill = tunits * (float) (3.80);
    System.out.println("report of current bill");
    System.out.println("consumer number is " + cno);
    System.out.println("consumer name is " + cname);
    System.out.println("present month reading =" + pmr);
    System.out.println("last month reading = " + lmr);
    System.out.println("total uints =" + tunits);
    System.out.println("current bill = " + bill);
  }
}
