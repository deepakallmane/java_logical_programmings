import java.util.Scanner;

public class salary14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the basic salary: ");
    double basicSalary = scanner.nextDouble();

    double hra, da;

    if (basicSalary <= 10000) {
      hra = basicSalary * 0.2;
      da = basicSalary * 0.8;
    } else if (basicSalary <= 20000) {
      hra = basicSalary * 0.25;
      da = basicSalary * 0.9;
    } else {
      hra = basicSalary * 0.3;
      da = basicSalary * 0.95;
    }
    double grossSalary = basicSalary + hra + da;
    System.out.println("Gross Salary:" + grossSalary);
  }
}