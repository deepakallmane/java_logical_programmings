import java.util.Scanner;

class si {
  public static void main(String args[]) {
    int pamt, ri, time;
    float si, tamt;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter principal amount");
    pamt = sc.nextInt();
    System.out.println("enter rate of intrest");
    ri = sc.nextInt();
    System.out.println("enter time");
    time = sc.nextInt();
    si = (float) (pamt * time * ri) / 100;
    tamt = pamt + si;
    System.out.println("report for simple intrest and total amount");
    System.out.println("principal amount = " + pamt);
    System.out.println("rate of intrest = " + ri);
    System.out.println("given time = " + time);
    System.out.println("simple intrest = " + si);
    System.out.println("total amount =" + tamt);
  }
}