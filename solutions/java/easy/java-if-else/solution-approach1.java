// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-26, 12:18 a.m.
// Technique   conditional-branching-logic
// Time        O(1)
// Space       O(1)
// Insight     The implementation partitions the integer space into odd numbers and three distinct even-number ranges to determine the output string.
// Interview   Before: "I would use a series of nested if-else statements to check the parity and range of N." After: "The solution runs in O(1) time by evaluating the parity and range constraints directly, correctly handling the N > 20 case as Not Weird."
// Pitfalls    (1) Failing to account for the inclusive range of 6 to 20, which results in an incorrect classification for even numbers in that interval.  (2) Neglecting the requirement that even numbers greater than 20 must be classified as Not Weird.  (3) Incorrectly handling the parity check, as the problem defines odd numbers as Weird regardless of their magnitude.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2!=0){
            System.out.print("Weird");
        }else{
            if(N>=2 && N<=5){
                System.out.print("Not Weird");
            }else if(N>=6 && N<=20){
                System.out.print("Weird");
            }else if(N>20){
                System.out.print("Not Weird");
            }
        }
        
        scanner.close();
    }
}
