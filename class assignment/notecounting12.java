import java.util.Scanner;

public class notecounting12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount: ");
    int amount = scanner.nextInt();

    int[] denominations = { 1000, 500, 200, 100, 50, 20, 10, 5, 1 };
    int[] count = new int[9]; // Array to store the count of each denomination

    for (int i = 0; i < denominations.length; i++) {
      if (amount >= denominations[i]) {
        count[i] = amount / denominations[i];
        amount %= denominations[i];
      }
    }

    System.out.println("Total number of notes:");
    for (int i = 0; i < denominations.length; i++) {
      if (count[i] > 0) {
        System.out.println(denominations[i] + ": " + count[i]);
      }
    }
    scanner.close();
  }
}
