import java.util.Scanner;

class area {
  public static void main(String args[]) {
    int r;
    float area;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the radius");
    
    r = sc.nextInt();
    
    area = 3.14F * r * r;
    System.out.println("the area of a circle is " +area);
  }
}
