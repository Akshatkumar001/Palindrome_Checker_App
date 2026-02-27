//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        String var2 = "refer";
        ArrayDeque var3 = new ArrayDeque();

        for (char var7 : var2.toCharArray()) {
            var3.add(var7);
        }

        boolean var8 = true;

        while (!var3.isEmpty() && var3.size() != 1) {
            char var9 = (Character) var3.removeFirst();
            char var10 = (Character) var3.removeLast();
            if (var9 != var10) {
                var8 = false;
                break;
            }
        }

        System.out.println("Input : " + var2);
        System.out.println("Is Palindrome? : " + var8);
        var1.close();
    }
}
