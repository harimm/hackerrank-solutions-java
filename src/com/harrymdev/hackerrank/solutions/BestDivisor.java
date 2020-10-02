package com.harrymdev.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BestDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxSum = 0;
        int maxDivisor = 0;
        int highestDivisor = n / 2;
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= highestDivisor; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        divisors.add(n);
        for (Integer i: divisors) {
            if (i > 9) {
                int newSum = Arrays.stream(String.valueOf(i).split(""))
                        .mapToInt(Integer::valueOf)
                        .sum();
                if (newSum > maxSum) {
                    maxSum = newSum;
                    maxDivisor = i;
                }

            } else if (i > maxSum) {
                maxSum = i;
                maxDivisor = i;
            }
        }
        System.out.println(maxDivisor);
        scanner.close();
    }
}
