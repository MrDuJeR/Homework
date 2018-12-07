// Write a program to determine if an integer is even without using the modulus operator (%)

package com.example.iseven;

public class IsEven {

	public static void main(String[] args) {
		int i = 14;
		
		if((i/2)*2 == i) {
			System.out.println("Is Even");
		}
		else
		{
			System.out.println("Is not Even");
		}
	}
}
