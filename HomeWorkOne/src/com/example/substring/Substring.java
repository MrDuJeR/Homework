//	Write a substring method that accepts a string str and an integer idx and returns the substring 
//	contained between 0 and idx-1 inclusive.  Do NOT use any of the existing substring methods in the String, 
//	StringBuilder, or StringBuffer APIs.

package com.example.substring;

public class Substring {

	public static void main(String[] args) {
		String name = "Jevin Francis";

		String newstring = getSubstring(name, 0);
		System.out.println(newstring);
	}

	public static String getSubstring(String str, int idx) {
		if (idx == 0) {
			return "";
		} else if (idx > str.length()) {
			return "Given Index is Out Of Bounds";
		} else {
			String newstring = "";
			for (int i = 0; i < idx; i++) {
				newstring = newstring + str.charAt(i);
			}
			return newstring;
		}
	}
}
