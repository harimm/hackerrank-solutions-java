package com.harrymdev.hackerrank.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SpecialMultiple {
    private static Pattern pattern = Pattern.compile("[90]+");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Map<Integer, Long> values = new HashMap<>();
        while(t-- > 0) {
            int n = scanner.nextInt();
            Long value = values.get(n);
            if (value != null) {
                System.out.println(value);
            } else {
                long multiplier = 1;
                do {
                    long tempAnswer = n * multiplier++;
                    if (pattern.matcher(String.valueOf(tempAnswer)).matches()) {
                        value = tempAnswer;
                        values.put(n, value);
                        System.out.println(value);
                    }
                } while (value == null);
            }
        }
        scanner.close();
    }
}
