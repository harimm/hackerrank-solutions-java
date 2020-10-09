package com.harrymdev.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MeanMedianAndMode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Map<Integer, FrequencyValue> keyToFrequencyMap = new HashMap<>();
        List<Integer> values = new ArrayList<>();
        int sum = 0;
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            sum += num;
            values.add(num);
            keyToFrequencyMap.computeIfAbsent(num, k -> new FrequencyValue(num)).increment();
        }
        Collections.sort(values);
        List<FrequencyValue> valueMap = new ArrayList<>(keyToFrequencyMap.values());
        Collections.sort(valueMap);

        double avg = ((double) sum) / n;
        double median = n % 2 == 0 ?
                ((double) values.get(n / 2) + (double) values.get((n / 2) - 1)) / 2 :
                (double) values.get(n / 2);
        double mode = valueMap.get(0).getKey();

        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        scn.close();
    }

    static class FrequencyValue implements Comparable<FrequencyValue> {
        int key;
        int freq;

        public FrequencyValue(int key) {
            this.key = key;
        }

        public void increment() {
            freq++;
        }

        public int getKey() {
            return key;
        }

        public int compareTo(FrequencyValue other) {
            int freqCompare = other.freq - freq;
            if (freqCompare == 0) {
                return key - other.key;
            }
            return freqCompare;
        }
    }
}
