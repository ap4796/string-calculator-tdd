package com.incubyte.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Calculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, delimiterEnd));
            numbers = numbers.substring(delimiterEnd + 1);
        }

        String[] parts = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();

        for (String num : parts) {
            int value = Integer.parseInt(num);
            if (value < 0) {
                negatives.add(value);
            }
            sum += value;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException(
                    "negative numbers not allowed: " + negatives.toString().replaceAll("[\\[\\] ]", "")
            );
        }
        return sum;
    }
}

