// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
// Problem     Java Stdin and Stdout II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-27, 10:56 a.m.
// Technique   scanner-buffer-clearing
// Time        O(1)
// Space       O(1)
// Insight     The scanner consumes tokens based on type, requiring an explicit call to nextLine() to clear the trailing newline character left in the buffer after reading numeric primitives.
// Interview   Before: "I am getting an empty string when reading the input." After: "The issue is that nextInt() leaves a newline in the buffer. Calling nextLine() once after the numeric inputs consumes that newline, allowing the subsequent nextLine() to capture the string correctly in O(1) time."
// Pitfalls    (1) Failing to consume the newline character after nextInt() or nextDouble() causes the subsequent nextLine() to return an empty string.  (2) Assuming nextLine() behaves like next() when reading input containing spaces.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine(); 
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
