import java.util.Scanner;

public class alphabet7 {
  public static void main(String[] args) {
    char my_input;
    my_input = '!';
    System.out.println("The Alphabet is defined as " + my_input);
    if ((my_input >= 'a' && my_input <= 'z') || (my_input >= 'A' && my_input <= 'Z'))
      System.out.println("The character " + my_input + " is an alphabet.");
    else
      System.out.println("The character " + my_input + " is not an alphabet.");
  }
}
