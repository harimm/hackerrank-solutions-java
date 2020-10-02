package com.harrymdev.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JohnAndGcdList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int maxNum = 0;
            int maxIndex = -1;
            int prev = 0;
            List<Integer> numList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int num = scn.nextInt();
                numList.add(num);
                int nextNum = num * num;
                if (i > 0) {
                    int nextNum2 = prev * num;
                    if (nextNum2 > nextNum) {
                        nextNum = nextNum2;
                    }
                }
                if (nextNum > maxNum) {
                    maxNum = nextNum;
                    maxIndex = i;
                }
                prev = num;
            }
            numList.add(maxIndex, maxNum);
            System.out.println(numList.stream().map(Object::toString).collect(Collectors.joining(" ")));
        }
        scn.close();
    }
}
