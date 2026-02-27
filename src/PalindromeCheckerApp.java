/**
 * ============================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */
import java.util.Scanner;


public class PalindromeCheckerApp {
      /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker Management System");
        
        System.out.println("Version : 1.0");

        
        System.out.println("System initialized successfully.");

        System.out.print("input text: ");
        String input = scanner.nextLine();

         input = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

         if (isPalindrome) {
            System.out.println("is It a Palindrome? true");
        } else {
            System.out.println("is It a Palindrome? false");
        }
        scanner.close();
    }
}