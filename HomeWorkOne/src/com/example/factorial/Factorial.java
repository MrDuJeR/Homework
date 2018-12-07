// Write a program to compute N factorial.

package com.example.factorial;

public class Factorial {
	public static void main(String[] args) {
		int n = 8;
		int f = 1;
		for (int x = n; x > 0; x--) {
			f = f * x;
		}
		System.out.println(n + " Factorial is: " + f);
	}
}
