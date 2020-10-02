package com.harrymdev.hackerrank.solutions;

import java.util.Scanner;

public class CuttingPaperSquares {
    private static long solve(int n, int m) {
        return (n -1) + ((long)n * (m - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long result = solve(n, m);

        System.out.println(result);

        scanner.close();
    }
}
