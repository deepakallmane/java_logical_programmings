import java.util.Scanner;

class vol {
  public static void main(String args[]) {
    int r;
    double volume;
    float v = 1.33F;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the radius");

    r = sc.nextInt();

    volume = v * 3.14 * r * r * r;
    System.out.println("the volume of the sphere = " + volume);
  }
}
