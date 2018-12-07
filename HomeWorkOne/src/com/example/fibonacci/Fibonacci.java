package com.example.fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int z = 0;
		int o = 1;
		int num = 1;
		System.out.println("Fibonacci Numbers:\n" + z + "\n" + o);

		for (int x = 0; x < 23; x++) {
			//Printing the number
			System.out.println(num);
			// swapping data and updating new values
			z = num;
			num += o;
			o = z;
		}
	}
}
