package com.harrymdev.hackerrank.solutions;

import java.util.Scanner;

public class ArmyGame {
    private static int gameWithCells(int n, int m) {
        return ((m + 1) / 2) * ((n + 1) / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = gameWithCells(n, m);

        System.out.println(result);
    }
}
