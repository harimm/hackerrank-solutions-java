package com.harrymdev.hackerrank.solutions;

import java.util.Scanner;

public class StrangeGridAgain {
    private static long strangeGrid(int r, int c) {
        int extra = r % 2 == 0 ? 1 : 0;
        int onesValue = extra + ((c - 1) * 2);
        long tensValue = (((long)r - 1)/2) * 10;
        return onesValue + tensValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        long result = strangeGrid(r, c);

        System.out.println(result);

        scanner.close();
    }
}
