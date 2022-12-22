package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PasswordStrengthChecker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter password: ");
    String password = scanner.nextLine();

    // Check if password is at least 8 characters long
    if (password.length() < 8) {
      System.out.println("Password is not strong (must be at least 8 characters long)");
      return;
    }

    // Check if password contains at least one special character
    boolean hasSpecialChar = false;
    String specialCharRegex = "[^A-Za-z0-9]"; // any character that is not a letter or a number
    Pattern pattern = Pattern.compile(specialCharRegex);
    Matcher matcher = pattern.matcher(password);
    while (matcher.find()) {
      hasSpecialChar = true;
      break;
    }
    if (!hasSpecialChar) {
      System.out.println("Password is not strong (must contain at least one special character)");
      return;
    }

    // Check if password contains at least one number
    boolean hasNumber = false;
    String numberRegex = "[0-9]";
    pattern = Pattern.compile(numberRegex);
    matcher = pattern.matcher(password);
    while (matcher.find()) {
      hasNumber = true;
      break;
    }
    if (!hasNumber) {
      System.out.println("Password is not strong (must contain at least one number)");
    }

    // Check if password contains at least one upper and one lower case letter
//    boolean hasUpperCase = false;
  }
}
