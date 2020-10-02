package com.harrymdev.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ConstructingANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int sumDigits = 0;
            while (n-- > 0) {
                int nextNum = scanner.nextInt();
                sumDigits += Arrays.stream(String.valueOf(nextNum).split(""))
                        .mapToInt(Integer::valueOf)
                        .sum();
            }
            if (sumDigits % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
