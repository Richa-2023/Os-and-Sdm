package com.core;

import java.util.Scanner;

public class SumOfDigitsCalculator {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Calculate and display the sum of digits
	        int sum = calculateSumOfDigits(number);
	        System.out.println("Sum of digits in " + number + " is: " + sum);

	        scanner.close();
	    }

	    private static int calculateSumOfDigits(int n) {
	        int sum = 0;
	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;
	    }
}
