package com.harrymdev.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quartiles {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(scn.nextInt());
        }
        Collections.sort(values);
        int index1 = n / 2;
        int index2 = n % 2 == 0 ? index1 : index1 + 1;
        System.out.println(median(values.subList(0, index1)));
        System.out.println(median(values));
        System.out.println(median(values.subList(index2, n)));
    }

    private static double median(List<Integer> values) {
        int size = values.size();
        int middle = size / 2;
        if (size % 2 == 0) {
            return (values.get(middle) + values.get(middle - 1)) / 2.0;
        } else {
            return (double) values.get(size / 2);
        }
    }
}