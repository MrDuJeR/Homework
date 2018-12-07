//Reverse a string without using a temporary variable.  Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.

package com.example.reversestring;

public class ReverseString {

	public static void main(String[] args) {
		String name = "This Should Work!";
		String reversed = stringReverse(name);
		System.out.println(reversed);
	}
	public static String stringReverse(String str) {
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
}
