// Write a program to store numbers from 1 to 100 in an array.
// Print out all the even numbers from the array. Use the enhanced 
// FOR loop for printing out the numbers.

package com.example.printeven;

import java.util.ArrayList;

public class PrintEven {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(100);
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
		System.out.print("Even Numbers: ");
		for (int num : list) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}else {
				
			}
		}
	}
}

