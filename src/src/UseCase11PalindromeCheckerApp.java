import java.util.Scanner;

public class UseCase11PalindromeCheckerApp {

    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = "racecar";

        boolean result = checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}