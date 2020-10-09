package com.harrymdev.hackerrank.solutions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class WeightedMean {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weights[i] = scn.nextInt();
        }
        int weightedSum = 0;
        int sumWeights = 0;
        for (int i = 0; i < n; i++) {
            int weight = weights[i];
            weightedSum += nums[i] * weight;
            sumWeights += weight;
        }
        System.out.println(round(((double) weightedSum) / sumWeights));
        scn.close();
    }

    private static double round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
