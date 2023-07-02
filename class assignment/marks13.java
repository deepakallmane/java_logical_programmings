import java.util.Scanner;

public class marks13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Physics marks: ");
    int physicsMarks = scanner.nextInt();

    System.out.print("Enter Chemistry marks: ");
    int chemistryMarks = scanner.nextInt();

    System.out.print("Enter Biology marks: ");
    int biologyMarks = scanner.nextInt();

    System.out.print("Enter Mathematics marks: ");
    int mathematicsMarks = scanner.nextInt();

    System.out.print("Enter Computer marks: ");
    int computerMarks = scanner.nextInt();

    int totalMarks = physicsMarks + chemistryMarks + biologyMarks + mathematicsMarks + computerMarks;
    double percentage = (totalMarks / 5.0);

    String grade;

    if (percentage >= 90) {
      grade = "A";
    } else if (percentage >= 80) {
      grade = "B";
    } else if (percentage >= 70) {
      grade = "C";
    } else if (percentage >= 60) {
      grade = "D";
    } else if (percentage >= 40) {
      grade = "E";
    } else {
      grade = "F";
    }
    System.out.println("Percentage:" + percentage);
    System.out.println("Grade:" + grade);
  }
}
