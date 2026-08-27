// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-27, 01:05 p.m.
// Technique   printf-formatted-string-padding
// Time        O(1)
// Space       O(1)
// Insight     The printf format specifier %-15s left-justifies a string within a 15-character field, while %03d pads an integer with leading zeros to ensure a minimum width of three digits.
// Interview   Before: "I would use string concatenation and manual padding logic." After: "I used Java's printf format specifiers to handle alignment and zero-padding in O(1) time, ensuring the output strictly adheres to the 15-character left-justification and 3-digit integer requirements."
// Pitfalls    (1) Using %15s instead of %-15s results in right-justification, which violates the requirement for left-justification.  (2) Omitting the 0 in %03d causes the integer to be padded with spaces instead of leading zeros.  (3) Failing to include the %n format specifier results in all output appearing on a single line instead of separate lines.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}



