package com.harrymdev.hackerrank.solutions;

import java.util.Scanner;

// This is incomplete - Does not cover all cases. Needs rework
public class NewYearChaos {

    private static void minimumBribes(int[] q) {
        int totalBribes = 0;
        int currentBribes = 0;
        int currentBribers = 0;

        for (int i = 0; i < q.length; i++) {
            int value = q[i];
            int expectedIndexWithoutBribes = value - 1;
            int expectedIndexWithBribes = value - 1 + currentBribers;
            int indexDifference = expectedIndexWithBribes - i;
            if (indexDifference > 2) {
                totalBribes = -1;
                break;
            }
            if (indexDifference > 0) {
                totalBribes += indexDifference;
                currentBribes += indexDifference;
                currentBribers++;
            } else {
                if (currentBribers > 0) {
                    currentBribes--;
                    if (currentBribes == 0) {
                        currentBribers--;
                    }
                }
            }
        }

        if (totalBribes < 0) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(totalBribes);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
