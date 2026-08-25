// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
// Problem      Java Stdin and Stdout I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-25, 08:29 p.m.
// Technique   scanner-input-stream-processing
// Time        O(1)
// Space       O(1)
// Insight     The implementation consumes exactly three integer tokens from the standard input stream and prints each to a new line using standard output.
// Interview   Before: "How do I read multiple integers from stdin?" After: "You can use the Scanner class to read tokens sequentially. This approach runs in O(1) time as it processes exactly three integers, ensuring each is printed on a new line as required by the problem constraints."
// Pitfalls    (1) Failing to handle potential InputMismatchException if the input stream contains non-integer tokens.  (2) Assuming the input stream contains exactly three integers when the problem might provide more or fewer tokens.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        
    }
}
