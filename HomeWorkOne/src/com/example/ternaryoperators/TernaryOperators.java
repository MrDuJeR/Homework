// Find the minimum of two numbers using ternary operators.

package com.example.ternaryoperators;

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int min = (a < b) ? a : b;
		System.out.println("The minimum of " + a + " and " + b + " is: " + min);
	}
}
