import java.util.Scanner;

class Rectangle {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int l;
    int w;
    int area;
    int circumference;

    System.out.println("Enter length of rectangle: ");
    l = sc.nextInt();

    System.out.println("Enter width of rectangle: ");
    w = sc.nextInt();

    area = l * w;
    circumference = 2 * (l + w);

    System.out.println("area of rectangle= " + area);
    System.out.println("circumference of rectangle= " + circumference);
   }
}