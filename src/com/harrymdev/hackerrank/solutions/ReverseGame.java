package com.harrymdev.hackerrank.solutions;

import java.util.Scanner;

public class ReverseGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int position = (n - 1 - k) * 2;
            if (position >= n) {
                int diff = position - n + 1;
                position = n - diff;
            }
            System.out.println(position);
        }
        scanner.close();
    }
}

