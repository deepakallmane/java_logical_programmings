import java.util.Scanner;

class upperlower10 {
  public static void main(String args[]) {

    System.out.println("Checking for the Lowercase character");
    char val = 'd';
    System.out.println("Character:" + val);
    if (Character.isLowerCase(val)) {
      System.out.println("Character is in Lowercase!");
    } else {
      System.out.println("character is in Uppercase!");
    }
  }
}
