// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-26, 12:18 a.m.
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
