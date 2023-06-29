
import java.util.Scanner;

public class student {
  public static void main(String [] args)
    {
      int sno,m1,m2,m3,sum;
      String sname;
      float avg;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the student number");
      sno = sc.nextInt();
      System.out.println("enter the student name");
      sname = sc.next();
      System.out.println("enter the marks of maths");
      m1 = sc.nextInt();
      System.out.println("enter the marks of phy");
      m2 = sc.nextInt();
      System.out.println("enter the marks of che");
      m3 = sc.nextInt();
      sum = (m1+m2+m3);
      avg = (float)(sum)/3;
      System.out.println("report of student");
      System.out.println("sno ="+sno);
      System.out.println("sname = "+sname);
      System.out.println("m1 =" +m1);
      System.out.println("m2 = "+m2);
      System.out.println("m3 = "+m3);
      System.out.println("sum of 3 subject marks = "+sum);
      System.out.println("average of marks= "+avg);
    }  
}
