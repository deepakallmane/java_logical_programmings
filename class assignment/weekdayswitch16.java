import java.util.Scanner;

class weekdayswitch16 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int day = 8;
    System.out.println("enter the weekdays number:");
    day = sc.nextInt();

    switch (day) {
      case 1:
        System.out.print("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wenesday");
        break;
      case 5:
        System.out.println("Thrusday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("no days");
        break;
    }
  }
}