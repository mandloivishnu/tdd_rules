package com.avm;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        
        
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex); 
            numbers = numbers.substring(delimiterIndex + 1);
        }
        
        String[] nums = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();
        
        for (String num : nums) {
            if (!num.isEmpty()) { // Ensure no empty strings are parsed
                int number = Integer.parseInt(num);
                
                if (number < 0) {
                    negatives.add(number);
                }
                
                sum += number;
            }
        }
        
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }
        
        return sum;
	}

	
}


	